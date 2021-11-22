package com.weather.shopper.app.steps;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.weather.shopper.app.utils.ExtentReport;
import com.weather.shopper.app.utils.AppDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * This class is responsible to log the test cases details in extent report for
 * success and failure (with error screen shot embed in test report)
 * 
 * @author amit.tyagi
 *
 */
public class CucumberHooks {
	Logger logger = LogManager.getLogger(CucumberHooks.class.getName());
	private static ExtentReport extRep;
	private static boolean isReporterrunning;

	protected String screenshotDestinationFolder;
	String fileName = "environments/defaultenv.properties";
	String extentReportLocation = System.getProperty("user.dir");
	String screenshotFileName;
	boolean loginType = false;

	@Before
	public void beforeHook(Scenario scenario) throws Exception {
		if (!isReporterrunning) {
			extRep = new ExtentReport(extentReportLocation);
			isReporterrunning = true;
		}
		logger.info(
				"\n******************************************************************************************************************************"
						+ "\n\t\t\t\t\tTEST SCENARIO NAME:    " + scenario.getName()
						+ "\n******************************************************************************************************************************");
		AppDriver.setUpDriver();
	}

	@After
	public void afterHook(Scenario scenario) throws Exception {
		screenshotFileName = "//ExtentScreenShot//" + scenario.getName();
		System.out.println("inside hooks After");
		if (scenario.isFailed() == false) {
			logger.info("[TEST IS SUCCESS -------- Test case " + scenario.getName() + " has passed]");
		}
		if (scenario.isFailed()) {
			logger.info("[TEST IS FAILED -------- Test case " + scenario.getName() + " has failed]");
			try {
			} catch (Exception e) {
			}

		}
		extRep.writeToReport();

		WebDriver driver = AppDriver.getDriver();
		System.out.println(scenario.isFailed());
		if (scenario.isFailed()) {

			File screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			Path filePath = screenshotBytes.toPath();
			File destinationPath = new File(
					System.getProperty("user.dir") + "\\target\\cucumber-reports\\" + (new Date()).getTime() + ".png");
			Files.copy(filePath, destinationPath.toPath());
			scenario.write("<img src='" + destinationPath + "' width='200' height='100'>\n");

		}

		AppDriver.tearDown();
	}

}
