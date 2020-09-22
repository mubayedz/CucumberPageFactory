package com.qa.steps;

import java.util.List;

import org.testng.Assert;
import com.qa.pages.actions.CarSearchPageActions;
import com.qa.pages.actions.UsedCarsSearchPageActions;
import com.qa.pages.actions.CarsGuideHomePageActions;
import com.qa.pages.locators.*;
import com.qa.utils.SeleniumDrivers;
import cucumber.api.java.en.*;

public class SearchCarsSteps {
	//Globals
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions = new CarSearchPageActions();
	
	@Given("^I am on the home page \"([^\"]*)\" of Carsguide$")
	public void i_am_on_the_home_page_of_Carsguide(String url) throws Throwable {
		SeleniumDrivers.openPage(url);

	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List <String> list) throws Throwable {
		String menu = list.get(1);
		System.out.println("Menu selected is : " + menu);
		carsGuideHomePageActions.moveToBuyAndSell();
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable {
		carsGuideHomePageActions.clickOnSearchCarsMenu();

	}

	@And("^Select carbrand as \"([^\"]*)\" from Anymake dropdown$")
	public void select_carbrand_as_from_Anymake_dropdown(String carBrand) throws Throwable {
		carSearchPageActions.selectCarMake(carBrand);

	}

	@And("^Select Any Model dropdown as \"([^\"]*)\"$")
	public void select_Any_Model_dropdown_as(String Model) throws Throwable {
		carSearchPageActions.selectModel(Model);

	}

	@And("^Select Any Location dropdown as \"([^\"]*)\"$")
	public void select_Any_Location_dropdown_as(String Location) throws Throwable {
		carSearchPageActions.selectLocation(Location);

	}

	@And("^Select Any Price \\(max\\) dropdown as \"([^\"]*)\"$")
	public void select_Any_Price_max_dropdown_as(String Price) throws Throwable {
		carSearchPageActions.selectPrice(Price);

	}

	@And("^Click on \"([^\"]*)\" button$")
	public void click_on_button(String Find_My_Next_Car) throws Throwable {
		carSearchPageActions.clickFindMyNextCar();

	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
		System.out.println("Car list found");

	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedTitle) throws Throwable {
		String actual_title = SeleniumDrivers.getDriver().getTitle();
        Assert.assertEquals(actual_title, expectedTitle);
	}
}
