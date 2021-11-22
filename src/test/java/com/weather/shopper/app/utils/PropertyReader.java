package com.weather.shopper.app.utils;

import java.util.*;
import java.io.*;


/**
 * This class is responsible to read the property files i.e environment.properties and customer-secret-keys.properties
 * @author amit.tyagi
 *
 */
public class PropertyReader {
	public static Properties readProperties(String configFile) throws IOException {
		FileReader reader = new FileReader(configFile);
		Properties prop = new Properties();
		prop.load(reader);
		return prop;
	}
}