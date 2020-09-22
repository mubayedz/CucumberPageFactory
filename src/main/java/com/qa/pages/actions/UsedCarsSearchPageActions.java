package com.qa.pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.pages.locators.*;
import com.qa.utils.SeleniumDrivers;

public class UsedCarsSearchPageActions {
	
	UsedCarsSearchPageLocators usedSearchPageLocators = null;

	public UsedCarsSearchPageActions() {
		this.usedSearchPageLocators = new UsedCarsSearchPageLocators(null);
		PageFactory.initElements(SeleniumDrivers.getDriver(), usedSearchPageLocators);
	}
	
	public void moveToBuyAndSell() {
		Actions action = new Actions(SeleniumDrivers.getDriver());
		action.moveToElement(usedSearchPageLocators.Buy_sell_Link()).build().perform();

	}
	
	public void clickOnUsedMenu() {
		//moveToBuyAndSell
		usedSearchPageLocators.Used_cars().click();

	}

	public void selectCarMake(String carBrand) {
		Select selectCarMake = new Select(usedSearchPageLocators.Any_brand());
		selectCarMake.selectByVisibleText(carBrand);

	}

	public void selectModel(String Model) {
		Select selectModel = new Select(usedSearchPageLocators.Any_models());
		selectModel.selectByVisibleText(Model);

	}

	public void selectLocation(String Location) {
		Select selectLocation = new Select(usedSearchPageLocators.Any_location());
		selectLocation.selectByVisibleText(Location);

	}

	public void selectPrice(String Price) {
		Select selectPrice = new Select(usedSearchPageLocators.Price());
		selectPrice.selectByVisibleText(Price);
	}
	
	public void clickFindMyNextCar() {
		usedSearchPageLocators.Find_my_next_car().click();
	}


}
