package com.qa.steps;
import com.qa.pages.actions.CarSearchPageActions;
import com.qa.pages.actions.UsedCarsSearchPageActions;
import com.qa.pages.locators.*;
import com.qa.utils.SeleniumDrivers;
import java.util.List;
import org.testng.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsedCarsSearchSteps {
	private static Logger logger = LogManager.getLogger(SeleniumDrivers.class.getName());
	UsedCarsSearchPageActions usedCarsSearchPageActions = new UsedCarsSearchPageActions();
	CarSearchPageActions carSearchPageActions = new CarSearchPageActions();
	
	@Given("^I'm on the home page \"([^\"]*)\" of Carsguide$")
	public void i_m_on_the_home_page_of_Carsguide(String url) throws Throwable {
		logger.info("Opening the url");
		SeleniumDrivers.openPage(url);
	}

	@When("^I hover over the menu$")
	public void i_hover_over_the_menu(List<String> list) throws Throwable {
		logger.info("Hover over the menu");
		String menu = list.get(1);
		System.out.println("Menu selected is : " + menu);
		usedCarsSearchPageActions.moveToBuyAndSell();
	   
	}

	@And("^click on the \"([^\"]*)\" link$")
	public void click_on_the_link(String clickOnUsedMenu) throws Throwable {
		logger.info("Click on used cars menu");
		usedCarsSearchPageActions.clickOnUsedMenu();
	   
	}

	@And("^Select car brand as \"([^\"]*)\" from Anymake dropdown$")
	public void select_car_brand_as_from_Anymake_dropdown(String carBrand) throws Throwable {
		logger.info("Select car brand");
		carSearchPageActions.selectCarMake(carBrand);
	  
	}

	@And("^Select Any_Model dropdown as \"([^\"]*)\"$")
	public void select_Any_Model_dropdown_as(String Model) throws Throwable {
		logger.info("Select car model");
		carSearchPageActions.selectModel(Model);
	}

	@And("^Select Any_Location dropdown as \"([^\"]*)\"$")
	public void select_Any_Location_dropdown_as(String Location) throws Throwable {
		logger.info("Select car location");
		carSearchPageActions.selectLocation(Location);
	}

	@And("^Select Any_Price \\(max\\)$")
	public void select_Any_Price_max(List<String> list) throws Throwable {
		logger.info("Select a price from dropdown");
		String price = list.get(1);
		carSearchPageActions.selectPrice(price);
	    
	}

	@And("^Click on \"([^\"]*)\" blue button$")
	public void click_on_blue_button(String FindMyNextCar) throws Throwable {
		logger.info("Click find my nextcar");
		carSearchPageActions.clickFindMyNextCar();
	}

	@Then("^I should see a list of used cars$")
	public void i_should_see_a_list_of_used_cars() throws Throwable {
		logger.info("Used cards list found");
		System.out.println("Used cards list found");
	    
	}

	@And("^the page titles should be \"([^\"]*)\"$")
	public void the_page_titles_should_be(String expectedTitle) throws Throwable {
		String actual_title = SeleniumDrivers.getDriver().getTitle();
		try {
			Assert.assertEquals(actual_title, expectedTitle);
			logger.info("The title matched with the page successfully");
		} catch (AssertionError e) {
			logger.error("The title didn't match with the provided on the page");
		}
	    
	}

}
