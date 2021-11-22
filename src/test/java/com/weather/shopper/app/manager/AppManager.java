package com.weather.shopper.app.manager;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.weather.shopper.app.constants.Constants;
import com.weather.shopper.app.utils.PropertyReader;

public class AppManager {
	static Logger log = Logger.getLogger(AppManager.class);
	static Properties prop = null;

	public AppManager(String filePath) throws IOException {
		prop = PropertyReader.readProperties(Constants.APP_FILE_PATH);
	}

	public String getWeatherShopperUrl() {
		String weatherShopperUrl = prop.getProperty(Constants.WEATHER_SHOPPER_URL);
		log.info("Able to read weather shopper url from environment.properties");
		return weatherShopperUrl;
	}

	public String getBrowser() {
		String browserName = prop.getProperty(Constants.BROWSER_NAME);
		log.info("Able to read browser name from environment.properties");
		return browserName;
	}

}
