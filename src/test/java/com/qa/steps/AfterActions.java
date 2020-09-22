package com.qa.steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.*;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import com.qa.pages.locators.*;
import com.qa.utils.SeleniumDrivers;

public class AfterActions {

	@After
	public static void tearDown(Scenario scenario) {

		WebDriver driver = SeleniumDrivers.getDriver();
		System.out.println(scenario.isFailed());
		if (scenario.isFailed()) {
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");

		}
		SeleniumDrivers.tearDown();

	}
}
