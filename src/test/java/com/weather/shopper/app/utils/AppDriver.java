package com.weather.shopper.app.utils;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.weather.shopper.app.constants.Constants;
import com.weather.shopper.app.manager.AppManager;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class is responsible to initilize and launch the web driver as per the dynamic property 
 * app.browser.name from environment.property file 
 * @author amit.tyagi
 *
 */
public class AppDriver {

	private static AppDriver appDriver;

	// init WebDriver
	public static WebDriver driver;

	public static WebDriverWait waitDriver;
	public final static int TIMEOUT = 200;
	public final static int PAGE_LOAD_TIMEOUT = 200;

	public AppDriver() throws IOException {
		driver = initilizeWebDriver();
		driver.manage().window().maximize();
	}

	public static void openPage(String url) throws InterruptedException, IOException {

	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static void setUpDriver() throws IOException {

		if (appDriver == null) {

			appDriver = new AppDriver();

		}

	}

	public static void tearDown() {

		if (driver != null) {

			driver.close();
			driver.quit();

		}
		appDriver = null;

	}

	// WebDriverManager will auto download needed binaries (Chrome, Firefox,
	// Opera, Safari)
	private WebDriver initilizeWebDriver() throws IOException {

		AppManager appManager = new AppManager(Constants.APP_FILE_PATH);
		WebDriver driver = null;
		Class<? extends WebDriver> driverClass = null;
		try {
			if (appManager.getBrowser().equals("Chrome")) {
				driverClass = ChromeDriver.class;
			} else {
				driverClass = FirefoxDriver.class;
			}

			WebDriverManager.getInstance(driverClass).setup();
			driver = driverClass.newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return driver;
	}

}
