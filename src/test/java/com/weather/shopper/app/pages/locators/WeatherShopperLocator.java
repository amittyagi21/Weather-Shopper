package com.weather.shopper.app.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This file contains all the application locators
 * @author amit.tyagi
 *
 */
public class WeatherShopperLocator {

	@FindBy(how = How.XPATH, using = "//h2")
	public WebElement headline;

	@FindBy(how = How.XPATH, using = "//span[@id='temperature']")
	public WebElement temprature;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Buy moisturizers')]")
	public WebElement moisturizers;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Buy sunscreens')]")
	public WebElement sunscreens;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Moisturizers')]")
	public WebElement headlineMoisturizers;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Sunscreens')]")
	public WebElement headlineSunscreens;

	@FindBy(how = How.XPATH, using = "//p[@class='font-weight-bold top-space-10']")
	public List<WebElement> items;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Price: ')]")
	public List<WebElement> prices;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add')]")
	public List<WebElement> add;

	@FindBy(how = How.XPATH, using = "//span[@id='cart']")
	public WebElement cart;

	@FindBy(how = How.XPATH, using = "//p[@id='total']")
	public WebElement totalPrice;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Pay with Card')]")
	public WebElement payWithCard;

	@FindBy(how = How.XPATH, using = "//iframe[@frameborder='0']")
	public List<WebElement> iframe;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
	public WebElement email;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='ZIP Code']")
	public WebElement zipCode;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Card number']")
	public WebElement cardNumber;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='MM / YY']")
	public WebElement mmyy;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='CVC']")
	public WebElement cvc;

	@FindBy(how = How.XPATH, using = "//button[@id='submitButton']")
	public WebElement doPayment;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Your payment was successful. You should receive a follow-up call from our sales team.')]")
	public WebElement customerAck;

	@FindBy(how = How.XPATH, using = "//td")
	public List<WebElement> cartItems;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Account')]")
	public WebElement Accountlink;

	@FindBy(how = How.XPATH, using = "//h2[@id='main-heading']")
	public WebElement AccountHeading;

	@FindBy(how = How.XPATH, using = "//button[@class='add-acount-button mat-raised-button mat-primary']")

	public WebElement AddAccount;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='customerGroup']")
	public WebElement customerGroup;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'MACY')]")
	public WebElement GroupMacys;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Customer Name']")
	public WebElement CustomerName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Customer Entity']")
	public WebElement CustomerEntity;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Customer Contact Person']")
	public WebElement CustomerContactPerson;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search Manager (eg. type resource id, resource name, email-id, technology etc.)']")
	public WebElement SearchManager;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Country']")
	public WebElement Country;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='customerEmailId']")
	public WebElement customerEmailId;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='customerContactNumber']")
	public WebElement customerContactNumber;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Create Account')]")
	public WebElement CreateAccount;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Account:')]")
	public WebElement AccountDisplay;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Quick Links')]")
	public WebElement QuickLinks;

	@FindBy(how = How.XPATH, using = "//button[@class='dropdown-item']")
	public WebElement AddProject;

	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-6 topContent']")
	public WebElement AcountId;

	@FindBy(how = How.XPATH, using = "//button[@class='mat-raised-button']//span[1]")
	public WebElement Reset;

	@FindBy(how = How.XPATH, using = "//button[@class='mat-raised-button']")
	public WebElement Resetall;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Manager')]")
	public WebElement row;

	@FindBy(how = How.XPATH, using = "(//*[@class='mat-cell cdk-column-accountCode mat-column-accountCode ng-star-inserted'])[1]")
	public WebElement data;

	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-12']//button[1]")
	public WebElement EditAccount;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Customer Entity']")
	public WebElement EditCustomerEntity;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Customer Name']")
	public WebElement EditCustomerName;

	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-12']//button[2]")
	public WebElement save;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search account (type customer name, account code, etc...)']")
	public WebElement searchAccount;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Manager')]")
	public WebElement tab;

	@FindBy(how = How.XPATH, using = "//a[@class='navbar-brand logo float-left']//img")
	public WebElement logo;

}
