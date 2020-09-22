package com.qa.pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.qa.pages.locators.*;
import com.qa.utils.SeleniumDrivers;


public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators(null);
		PageFactory.initElements(SeleniumDrivers.getDriver(), carsGuideHomePageLocators);
	}

	public void moveToBuyAndSell() {
		Actions action = new Actions(SeleniumDrivers.getDriver());
		action.moveToElement(carsGuideHomePageLocators.Buy_sell_Link()).build().perform();

	}

	public void clickOnSearchCarsMenu() {
		//moveToBuyAndSell
		carsGuideHomePageLocators.Search_cars().click();
	}

	public void clickOnUsedMenu() {
		//moveToBuyAndSell
		carsGuideHomePageLocators.Used_cars().click();

	}

	public void clickOnNewMenu() {
		//moveToBuyAndSell
		carsGuideHomePageLocators.New_cars().click();
	}

	public void clickOnSellMyCarMenu() {
		//moveToBuyAndSell
		carsGuideHomePageLocators.sell_my_car().click();
	}
	
	public void moveToReviews() {
		Actions action = new Actions(SeleniumDrivers.getDriver());
		action.moveToElement(carsGuideHomePageLocators.Reviews_link()).build().perform();

	}

}
