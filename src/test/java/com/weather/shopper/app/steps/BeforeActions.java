package com.weather.shopper.app.steps;

import java.io.IOException;

import com.weather.shopper.app.utils.AppDriver;

import cucumber.api.java.Before;

/**
 * Before action is used to initilize the web driver object
 * 
 * @author amit.tyagi
 *
 */
public class BeforeActions {
	@Before
	public static void setUp() throws IOException {
		AppDriver.setUpDriver();
	}

}
