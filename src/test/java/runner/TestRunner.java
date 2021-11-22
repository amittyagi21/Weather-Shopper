package runner;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Date;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.weather.shopper.app.constants.Constants;
import com.weather.shopper.app.utils.PropertyReader;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter" }, 
		features = "src/test/resources/features/WeatherShopper.feature", 
		tags= {"@Weather"},
		glue = "com/weather/shopper/app/steps",
		format= {"pretty","html:test-output",
        "json:target/cucumber-reports/CucumberTestReport.json"}
)

/**
 * The runner file which start executing all the test cases available in feature files
 * This class is triggered by the testng.xml file
 * @author amit.tyagi
 *
 */
public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeClass
	public static void setup() throws IOException {
		// Initiates the extent report and generates the output in the
		Properties prop = PropertyReader.readProperties(Constants.APP_FILE_PATH);
		String weatherShopperUrl = prop.getProperty(Constants.WEATHER_SHOPPER_URL);
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir") + "\\target\\Extent_Reports\\" + strDate + ".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile, false);
		
		// These system info will be populated in extent report
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser version", "v76.0");
		ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.14.1");
		ExtentCucumberFormatter.addSystemInfo("Environment", weatherShopperUrl);

		
		Map<String, String> systemInfo = new HashMap<>();
		systemInfo.put("Cucumber version", "v1.2.3");
		systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
		ExtentCucumberFormatter.addSystemInfo(systemInfo);
	}

	
}
