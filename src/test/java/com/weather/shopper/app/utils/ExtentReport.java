package com.weather.shopper.app.utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentBDDReporter;

/**
 * This class is responsible to generate the extent report at weather-shopper\target\Extent_Reports location with latest date and time
 * @author amit.tyagi
 *
 */
public class ExtentReport extends BaseUtil {
	String fileName = reportLocation + "//extentReports.html";
	private ExtentBDDReporter extentHtmlReporter;
	private ExtentReports extentReports;

	public ExtentReport(String reportLocation) {
		extentHtmlReporter = new ExtentBDDReporter(new File(reportLocation));
		extentReports = new ExtentReports();

		try {
			extentReports.setSystemInfo("Browser Name", "Chrome");
			extentReports.setSystemInfo("Browser version", "v76.0");
			extentReports.setSystemInfo("Selenium version", "v3.14.1");
			extentReports.setSystemInfo("Cucumber version", "v1.2.3");
			extentReports.setSystemInfo("Extent Cucumber Reporter version", "v1.1.0");
		} catch (Exception ex) {
		}

		extentReports.attachReporter(extentHtmlReporter);
	}

	public void writeToReport() {
		if (extentReports != null) {
			extentReports.flush();
		}
	}

}
