package com.weather.shopper.app.steps;

import com.weather.shopper.app.utils.AppDriver;

import cucumber.api.Scenario;

/**
 * After action is responsible to shutdown the web driver
 * 
 * @author amit.tyagi
 *
 */
public class AfterActions {

	public static void tearDown(Scenario scenario) {
		AppDriver.tearDown();
	}

}
