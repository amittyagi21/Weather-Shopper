package com.weather.shopper.app.manager;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.weather.shopper.app.constants.Constants;
import com.weather.shopper.app.utils.PropertyReader;

public class CustomerManager {
	static Logger log = Logger.getLogger(CustomerManager.class);
	static Properties prop = null;

	public CustomerManager(String filePath) throws IOException {
		prop = PropertyReader.readProperties(Constants.CUST_FILE_PATH);
	}

	public String getCustomerCardNo() throws IOException {
		String cardNo = prop.getProperty(Constants.CUST_CARD_NO);
		log.info("Able to read customer card Number");
		return cardNo;
	}

	public String getCustomerCardExpiryDate() throws IOException {
		String expiryDate = prop.getProperty(Constants.CUST_CARD_EXPIRY_DATE);
		log.info("Able to read customer card expiry date");
		return expiryDate;
	}

	public String getCustomerCardCVC() throws IOException {
		String cvc = prop.getProperty(Constants.CUST_CARD_CVC_NO);
		log.info("Able to read customer card cvc no");
		return cvc;
	}
}
