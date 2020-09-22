package com.qa.steps;

import cucumber.api.java.Before;
import com.qa.pages.locators.*;
import com.qa.utils.SeleniumDrivers;

public class BeforeActions {

	@Before
	public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
		SeleniumDrivers.setUpDriver();
	}
}
