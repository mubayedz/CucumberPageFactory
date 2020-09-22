package com.qa.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarSearchPageLocators {

	public WebDriver driver;

	public CarSearchPageLocators(WebDriver driver) { // Constructor 1 argumetno
			this.driver = driver;
			PageFactory.initElements(driver, this); // asi se inicializa el PF
		}

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
