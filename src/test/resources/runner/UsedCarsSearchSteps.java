package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDrivers;

public class UsedCarsSearchSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions = new CarSearchPageActions();

	//-----------------------------------------------------------------------------------//
	@Given("^I'm on the home page \"([^\"]*)\" of Carsguide$")
	public void i_m_on_the_home_page_of_Carsguide(String url) throws Throwable {
		SeleniumDrivers.openPage(url);
	}

	@When("^I hover over the menu$")
	public void i_hover_over_the_menu(List <String> list) throws Throwable {
		String menu = list.get(1);
		System.out.println("Menu selected is : " + menu);
		carsGuideHomePageActions.moveToBuyAndSell();
	}

	@And("^click on the \"([^\"]*)\" link$")
	public void click_on_the_link(String used) throws Throwable {
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^Select car brand as \"([^\"]*)\" from Anymake dropdown$")
	public void select_car_brand_as_from_Anymake_dropdown(String carBrand) throws Throwable {
		carSearchPageActions.selectCarMake(carBrand);
	}

	@And("^Select Any_Model dropdown as \"([^\"]*)\"$")
	public void select_Any_Model_dropdown_as(String Model) throws Throwable {
		carSearchPageActions.selectModel(Model);
	}

	@When("^Select Any_Location dropdown as \"([^\"]*)\"$")
	public void select_Any_Location_dropdown_as(String Location) throws Throwable {
		carSearchPageActions.selectLocation(Location);
	}

	@When("^Select Any_Price \\(max\\)$")
	public void select_Any_Price_max(List <String> list) throws Throwable {
		String price = list.get(1);
		carSearchPageActions.selectPrice(price);
	   
	}

	@When("^Click on \"([^\"]*)\" blue button$")
	public void click_on_blue_button(String FindMyNextCar) throws Throwable {
		carSearchPageActions.clickFindMyNextCar();
	}

	@Then("^I should see a list of used cars$")
	public void i_should_see_a_list_of_used_cars() throws Throwable {
		System.out.println("Used cards list found");
	}

	@Then("^the page titles should be \"([^\"]*)\"$")
	public void the_page_titles_should_be(String expectedTitle) throws Throwable {
		String actual_title = SeleniumDrivers.getDriver().getTitle();
        Assert.assertEquals(actual_title, expectedTitle);
	}

}
