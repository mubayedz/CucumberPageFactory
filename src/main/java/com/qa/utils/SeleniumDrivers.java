package com.qa.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDrivers {
	
	private static SeleniumDrivers seleniumDrivers;
	
	// init WebDriver
	private static WebDriver driver;
	
	private static WebDriverWait waitDriver;
	
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIME = 50;
	
	// metodo de tiempo
	private SeleniumDrivers() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mubayed\\eclipse-workspace\\CucumberPageObjects\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIME, TimeUnit.SECONDS);
	}
	
	/// constructor 1 argumento
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	// si es nulo apunta al metodo SeleniumDrivers
	public static void setUpDriver() {
		if(seleniumDrivers==null) {
			seleniumDrivers = new SeleniumDrivers();
		}
	}
	// metodo para cerrar las paginas
	public static void tearDown() {
		if(driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDrivers = null;
		
	}
	
	

}
