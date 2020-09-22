package com.qa.pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.qa.pages.locators.*;
import com.qa.utils.SeleniumDrivers;

public class CarSearchPageActions {

	CarSearchPageLocators carSearchPageLocators = null;

	public CarSearchPageActions() {
		this.carSearchPageLocators = new CarSearchPageLocators(null);
		PageFactory.initElements(SeleniumDrivers.getDriver(), carSearchPageLocators);
	}

	public void selectCarMake(String carBrand) {
		Select selectCarMake = new Select(carSearchPageLocators.Any_brand());
		selectCarMake.selectByVisibleText(carBrand);

	}

	public void selectModel(String Model) {
		Select selectModel = new Select(carSearchPageLocators.Any_models());
		selectModel.selectByVisibleText(Model);

	}

	public void selectLocation(String Location) {
		Select selectLocation = new Select(carSearchPageLocators.Any_location());
		selectLocation.selectByVisibleText(Location);

	}

	public void selectPrice(String Price) {
		Select selectPrice = new Select(carSearchPageLocators.Price());
		selectPrice.selectByVisibleText(Price);
	}
	
	public void clickFindMyNextCar() {
		carSearchPageLocators.Find_my_next_car().click();
	}

}
