package com.weather.shopper.app.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.weather.shopper.app.constants.Constants;
import com.weather.shopper.app.manager.AppManager;
import com.weather.shopper.app.manager.CustomerManager;
import com.weather.shopper.app.pages.locators.WeatherShopperLocator;
import com.weather.shopper.app.utils.AppDriver;

/**
 * This class contains all the step definitions of the steps in
 * WeatherShopper.feature feature file
 * 
 * @author amit.tyagi
 *
 */
public class WeatherShopperDefinition {

	WebDriver driver;

	Logger log = Logger.getLogger("CartStateDefinition.class");
	Long timeInmillis = System.currentTimeMillis();

	WeatherShopperLocator al = null;
	CustomerManager custManager = null;
	TreeMap<Integer, Map<String, WebElement>> tmAloe = null;
	TreeMap<Integer, Map<String, WebElement>> tmAlmond = null;
	TreeMap<Integer, Map<String, WebElement>> tmSPF50 = null;
	TreeMap<Integer, Map<String, WebElement>> tmSPF30 = null;
	String headline;

	int totalItemsPrice = 0;
	int temp = 0;

	public WeatherShopperDefinition() {
		this.al = new WeatherShopperLocator();
		PageFactory.initElements(AppDriver.getDriver(), al);
	}

	@Given("^Hit the given Weather shopper screen url$")
	public void hit_the_given_Weather_shopper_screen_url() throws Throwable {
		driver = AppDriver.getDriver();
		AppManager appManager = new AppManager(Constants.APP_FILE_PATH);
		driver.get(appManager.getWeatherShopperUrl());
		Assert.assertEquals(driver.getTitle(), Constants.CURRENT_TEMPRATURE_TITLE);
		Assert.assertEquals(this.al.headline.getText(), Constants.CURRENT_TEMPRATURE);
	}

	@Given("^Get the temprature from the screen$")
	public void get_the_temprature_from_the_screen() throws InterruptedException {
		String temprature = this.al.temprature.getText();
		String[] tempArr = temprature.split(" ");
		temp = Integer.parseInt(tempArr[0]);
		Thread.sleep(2000);
	}

	@When("^As per the temprature \"([^\"]*)\" and \"([^\"]*)\" select the corressponding buy Moisturizers/Sunscreens$")
	public void as_per_the_temprature_and_select_the_corressponding_buy_Moisturizers_Sunscreens(String arg1, String arg2) throws InterruptedException {
		if (temp < Integer.parseInt(arg1)) {
			this.al.moisturizers.click();
		} else if (temp > Integer.parseInt(arg2)) {
			this.al.sunscreens.click();
		}		
	}

	@When("^Add to the cart the least expensive Moisturizers/Sunscreens$")
	public void add_to_the_cart_the_least_expensive_Moisturizers_Sunscreens() throws InterruptedException {
		headline = this.al.headline.getText();
		if (headline.equalsIgnoreCase(Constants.MOISTURIZERS)) {
			Assert.assertEquals(driver.getTitle(), Constants.MOISTURIZERS_PAGE_TITLE);
			Assert.assertEquals(this.al.headline.getText(), Constants.MOISTURIZERS);
			Map<String, WebElement> hmAloe = null;
			Map<String, WebElement> hmAlmond = null;

			tmAloe = new TreeMap<>();
			tmAlmond = new TreeMap<>();

			List<WebElement> items = this.al.items;
			List<WebElement> prices = this.al.prices;
			List<WebElement> addButtons = this.al.add;
			Iterator<WebElement> itrItems = items.iterator();
			Iterator<WebElement> itrPrices = prices.iterator();
			Iterator<WebElement> itrAddBtn = addButtons.iterator();
			while (itrItems.hasNext() && (itrPrices.hasNext()) && (itrAddBtn.hasNext())) {
				int itemPrice = 0;
				String itemName = itrItems.next().getText();
				String fullPriceFirstRow = itrPrices.next().getText();
				WebElement addBtn = itrAddBtn.next();
				itemPrice = Integer.parseInt(fullPriceFirstRow.substring(fullPriceFirstRow.lastIndexOf(' ') + 1,
						fullPriceFirstRow.length()));
				if (itemName.contains("Aloe") || itemName.contains("aloe")) {
					hmAloe = new HashMap<String, WebElement>();
					hmAloe.put(itemName, addBtn);
					tmAloe.put(itemPrice, hmAloe);
				} else if (itemName.contains("Almond") || itemName.contains("almond")) {
					hmAlmond = new HashMap<String, WebElement>();
					hmAlmond.put(itemName, addBtn);
					tmAlmond.put(itemPrice, hmAlmond);
				}

			}
			totalItemsPrice = tmAloe.firstKey() + tmAlmond.firstKey();
			tmAloe.firstEntry().getValue().entrySet().iterator().next().getValue().click();
			tmAlmond.firstEntry().getValue().entrySet().iterator().next().getValue().click();
		} else if (headline.equalsIgnoreCase(Constants.SUNSCREENS)) {
			Assert.assertEquals(driver.getTitle(), Constants.SUNSCREENS_PAGE_TITLE);
			Assert.assertEquals(this.al.headline.getText(), Constants.SUNSCREENS);
			Map<String, WebElement> hmSPF50 = null;
			Map<String, WebElement> hmSPF30 = null;

			tmSPF50 = new TreeMap<>();
			tmSPF30 = new TreeMap<>();

			List<WebElement> items = this.al.items;
			List<WebElement> prices = this.al.prices;
			List<WebElement> addButtons = this.al.add;
			Iterator<WebElement> itrItems = items.iterator();
			Iterator<WebElement> itrPrices = prices.iterator();
			Iterator<WebElement> itrAddBtn = addButtons.iterator();
			while (itrItems.hasNext() && (itrPrices.hasNext()) && (itrAddBtn.hasNext())) {
				int itemPrice = 0;
				String itemName = itrItems.next().getText();
				String fullPriceFirstRow = itrPrices.next().getText();
				WebElement addBtn = itrAddBtn.next();
				itemPrice = Integer.parseInt(fullPriceFirstRow.substring(fullPriceFirstRow.lastIndexOf(' ') + 1,
						fullPriceFirstRow.length()));
				if (itemName.contains("SPF-50") || itemName.contains("spf-50")) {
					hmSPF50 = new HashMap<String, WebElement>();
					hmSPF50.put(itemName, addBtn);
					tmSPF50.put(itemPrice, hmSPF50);
				} else if (itemName.contains("SPF-30") || itemName.contains("spf-30")) {
					hmSPF30 = new HashMap<String, WebElement>();
					hmSPF30.put(itemName, addBtn);
					tmSPF30.put(itemPrice, hmSPF30);
				}

			}
			tmSPF50.firstEntry().getValue().entrySet().iterator().next().getValue().click();
			tmSPF30.firstEntry().getValue().entrySet().iterator().next().getValue().click();
		}
		Thread.sleep(2000);

	}

	@Then("^click on cart icon and navigate to transaction page$")
	public void click_on_cart_icon_and_navigate_to_transaction_page() {
		this.al.cart.click();
	}

	@Then("^Verify the cart items and their prices$")
	public void verify_the_cart_items_and_their_prices() {
		Assert.assertEquals(driver.getTitle(), Constants.CART_ITEMS);
		Assert.assertEquals(this.al.headline.getText(), Constants.CHHECKOUT);
		Map<String, Integer> cartMap = new HashMap<>();
		cartMap.put(this.al.cartItems.get(0).getText(), Integer.parseInt(this.al.cartItems.get(1).getText()));
		cartMap.put(this.al.cartItems.get(2).getText(), Integer.parseInt(this.al.cartItems.get(3).getText()));

		if (headline.equalsIgnoreCase("Moisturizers")) {
			if (cartMap.get(tmAlmond.firstEntry().getValue().entrySet().iterator().next().getKey()) != null) {
				Assert.assertEquals(tmAlmond.firstKey(),
						cartMap.get(tmAlmond.firstEntry().getValue().entrySet().iterator().next().getKey()));
			}

			if (cartMap.get(tmAloe.firstEntry().getValue().entrySet().iterator().next().getKey()) != null) {
				Assert.assertEquals(tmAloe.firstKey(),
						cartMap.get(tmAloe.firstEntry().getValue().entrySet().iterator().next().getKey()));
			}

			totalItemsPrice = tmAloe.firstKey() + tmAlmond.firstKey();
			String totalPrice = this.al.totalPrice.getText();
			Assert.assertEquals(totalItemsPrice,
					Integer.parseInt(totalPrice.substring(totalPrice.lastIndexOf(' ') + 1, totalPrice.length())));
		} else {
			if (cartMap.get(tmSPF50.firstEntry().getValue().entrySet().iterator().next().getKey()) != null) {
				Assert.assertEquals(tmSPF50.firstKey(),
						cartMap.get(tmSPF50.firstEntry().getValue().entrySet().iterator().next().getKey()));
			}

			if (cartMap.get(tmSPF30.firstEntry().getValue().entrySet().iterator().next().getKey()) != null) {
				Assert.assertEquals(tmSPF30.firstKey(),
						cartMap.get(tmSPF30.firstEntry().getValue().entrySet().iterator().next().getKey()));
			}

			totalItemsPrice = tmSPF50.firstKey() + tmSPF30.firstKey();
			String totalPrice = this.al.totalPrice.getText();
			Assert.assertEquals(totalItemsPrice,
					Integer.parseInt(totalPrice.substring(totalPrice.lastIndexOf(' ') + 1, totalPrice.length())));
		}

	}

	@Then("^Click on to the Pay with card button$")
	public void click_on_to_the_Pay_with_card_button() throws Throwable {
		this.al.payWithCard.click();
		Thread.sleep(7000);
		driver.switchTo().frame(this.al.iframe.get(0));
	}

	@Then("^Enter the customer email id \"([^\"]*)\"$")
	public void enter_the_customer_email_id(String arg1) {
		this.al.email.sendKeys(arg1);
	}

	@Then("^Enter the customer card details$")
	public void enter_the_customer_card_details() throws Throwable {
		custManager = new CustomerManager(Constants.CUST_FILE_PATH);
		String cardNo = custManager.getCustomerCardNo();
		String[] cardNoArray = cardNo.split(" ");
		this.al.cardNumber.sendKeys(cardNoArray[0]);
		this.al.cardNumber.sendKeys(cardNoArray[1].substring(0, 1));
		this.al.cardNumber.sendKeys(cardNoArray[1].substring(1, 4));
		this.al.cardNumber.sendKeys(cardNoArray[2].substring(0, 1));
		this.al.cardNumber.sendKeys(cardNoArray[2].substring(1, 4));
		this.al.cardNumber.sendKeys(cardNoArray[3].substring(0, 1));
		this.al.cardNumber.sendKeys(cardNoArray[3].substring(1, 4));
		String cardExpiryDate = custManager.getCustomerCardExpiryDate();
		String[] cardExpiryDateArr = cardExpiryDate.split("/");
		this.al.mmyy.sendKeys(cardExpiryDateArr[0]);
		this.al.mmyy.sendKeys(cardExpiryDateArr[1]);
		String cardCVCNo = custManager.getCustomerCardCVC();
		this.al.cvc.sendKeys(cardCVCNo);
	}

	@Then("^Enter the customer zip code \"([^\"]*)\"$")
	public void enter_the_customer_zip_code(String arg1) {
		this.al.zipCode.sendKeys(arg1);
	}

	@Then("^Do the payment$")
	public void do_the_payment() throws Throwable {
		this.al.doPayment.click();
		Thread.sleep(8000);		
	}

	@Then("^Verify the Customer payment Status \"([^\"]*)\"$")
	public void verify_the_Customer_payment_Status(String arg1) {
		Assert.assertEquals(driver.getTitle(), Constants.CONFIRMATION);
		Assert.assertEquals(this.al.headline.getText(), arg1);
	}

	@Then("^Validate the Customer Acknoledgement$")
	public void validate_the_Customer_Acknoledgement() {
		Assert.assertEquals(this.al.customerAck.getText(), Constants.CUST_ACK);
	}
	
	@Then("^Enter the customer invalid card details$")
	public void enter_the_customer_invalid_card_details() throws IOException {
		custManager = new CustomerManager(Constants.CUST_FILE_PATH);
		String cardNo = custManager.getCustomerCardNo();
		String[] cardNoArray = cardNo.split(" ");
		this.al.cardNumber.sendKeys(cardNoArray[0]);
		this.al.cardNumber.sendKeys(cardNoArray[1].substring(0, 1));
		this.al.cardNumber.sendKeys(cardNoArray[1].substring(1, 4));
		this.al.cardNumber.sendKeys(cardNoArray[2].substring(0, 1));
		this.al.cardNumber.sendKeys(cardNoArray[2].substring(1, 4));
		this.al.cardNumber.sendKeys(cardNoArray[3].substring(0, 1));
		this.al.cardNumber.sendKeys("000");
		String cardExpiryDate = custManager.getCustomerCardExpiryDate();
		String[] cardExpiryDateArr = cardExpiryDate.split("/");
		this.al.mmyy.sendKeys(cardExpiryDateArr[0]);
		this.al.mmyy.sendKeys(cardExpiryDateArr[1]);
		String cardCVCNo = custManager.getCustomerCardCVC();
		this.al.cvc.sendKeys(cardCVCNo);
	}
	
	@Then("^Verify that the payment should not be processed and control remains on the same page$")
	public void verify_that_the_payment_should_not_be_processed_and_control_remains_on_the_same_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), Constants.CART_ITEMS);
		Assert.assertEquals(this.al.headline.getText(), Constants.EXAMPLE_CHANGE);
	}

}
