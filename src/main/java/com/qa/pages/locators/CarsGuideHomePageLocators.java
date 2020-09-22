package com.qa.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarsGuideHomePageLocators {
	
	public WebDriver driver;

	public CarsGuideHomePageLocators(WebDriver driver) { // Constructor 1 argumetno
		this.driver = driver;
		PageFactory.initElements(driver, this); // asi se inicializa el PF
	}
	
	@FindBy(xpath="//a[contains(text(),'buy + sell')]")
	WebElement buy_sell;
	
	@FindBy(xpath="//a[contains(text(),'Search Cars')]")
	WebElement search_Cars;
	
	@FindBy(xpath="//div[@class='uhf-child-content']//a[contains(text(),'Used')]")
	WebElement used_Cars;
	
	@FindBy(xpath="//li[@class='uhf-menu-item uhf-dropdown-menu-toggle uhf-menu-buysell']//div[@class='uhf-child-expand']//div[@class='uhf-child-content']//div[@class='uhf-child-menu']//ul//li//a[contains(text(),'New')]")
	WebElement new_Cars;
	
	@FindBy(xpath="//div[@class='uhf-child-menu']//a[contains(text(),'Sell my car')]")
	WebElement sell_my_car;
	
	@FindBy(xpath="//a[@class='uhf-top'][contains(text(),'reviews')]")
	WebElement reviews;
	
	@FindBy(xpath="//a[@class='uhf-top'][contains(text(),'news')]")
	WebElement news;
	
	@FindBy(xpath="//a[@class='uhf-top'][contains(text(),'advice')]")
	WebElement advice;
	
	@FindBy(xpath="//a[contains(text(),'pricing + specs')]")
	WebElement pricing_specs;
	
	@FindBy(xpath="//a[contains(text(),'guides')]")
	WebElement guides;
	
	
	public WebElement Buy_sell_Link() {
		return buy_sell;
	}
	
	//---------- must hover over buy+sell------
	public WebElement Search_cars() {
		return search_Cars;
	}
	
	public WebElement sell_my_car() {
		return sell_my_car;
	}
	
	public WebElement Used_cars() {
		return used_Cars;
	}
	
	public WebElement New_cars() {
		return new_Cars;
	}
	//--------------------------------------------
	
	public WebElement Reviews_link() {
		return reviews;
	}
	
	public WebElement News_link() {
		return news;
	}
	
	public WebElement Advice_Link() {
		return advice;
	}
	
	public WebElement Pricing_Specs_Link() {
		return pricing_specs;
	}
	
	public WebElement Guides_Link() {
		return guides;
	}


}
