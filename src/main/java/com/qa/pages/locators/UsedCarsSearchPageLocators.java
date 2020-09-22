package com.qa.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.*;

public class UsedCarsSearchPageLocators {
	public WebDriver driver;

	public UsedCarsSearchPageLocators(WebDriver driver) { // Constructor 1 argumetno
		this.driver = driver;
		PageFactory.initElements(driver, this); // asi se inicializa el PF
	}

	@FindBy(xpath = "//a[contains(text(),'buy + sell')]")
	WebElement buy_sell;

	@FindBy(xpath = "//div[@class='uhf-child-content']//a[contains(text(),'Used')]")
	WebElement used_Cars;
	
	@FindBy(xpath = "//select[@id='makes']")
	WebElement any_brand;
	
	@FindBy(xpath = "//select[@id='models']")
	WebElement any_model;
	
	@FindBy(xpath = "//select[@id='locations']")
	WebElement any_location;
	
	@FindBy(xpath = "//select[@id='priceTo']")
	WebElement price;
	
	@FindBy(xpath = "//input[@id='search-submit']")
	WebElement find_my_next_car;

	public WebElement Buy_sell_Link() {
		return buy_sell;
	}

	// ---------- must hover over buy+sell------

	public WebElement Used_cars() {
		return used_Cars;
	}

	// --------------------------------------------
	
	public WebElement Any_brand() {
		return any_brand;
	}

	public WebElement Any_models() {
		return any_model;
	}
	
	public WebElement Any_location() {
		return any_location;
	}
	
	public WebElement Price() {
		return price;
	}
	
	public WebElement Find_my_next_car() {
		return find_my_next_car;
	}

}
