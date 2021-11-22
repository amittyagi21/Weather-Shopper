# This is the feature file as a part of the cucumber bdd framework 
# which contains all the steps of the end to end testing of the weather shopper screen
#Positive Scenario
@Weather
Feature: Testing the WeatherShopper Screen

	# Positive scenario	
	
    Scenario Outline: End to End Testing the WeatherShopper Screen
        Given Hit the given Weather shopper screen url
        Given Get the temprature from the screen
        When As per the temprature "<ThreaholdMoisturizersTemprature>" and "<ThreaholdSunscreensTemprature>" select the corressponding buy Moisturizers/Sunscreens
        And Add to the cart the least expensive Moisturizers/Sunscreens
        Then click on cart icon and navigate to transaction page
        Then Verify the cart items and their prices
        Then Click on to the Pay with card button
        Then Enter the customer email id "<CustomerEmailId>" 
        Then Enter the customer card details
        Then Enter the customer zip code "<CustomerZipCode>"
        Then Do the payment
        Then Verify the Customer payment Status "<PaymentStatus>"
        Then Validate the Customer Acknoledgement
        
        Examples:
        
        | CustomerEmailId 			| CustomerZipCode | ThreaholdMoisturizersTemprature | ThreaholdSunscreensTemprature | PaymentStatus   |
        | amit.tyagi.java@gmail.com |     250002 	  |              19                 |              34               | PAYMENT SUCCESS |
        | amit.tyagi.qa@gmail.com |     251102 	  |              19                 |              34               | PAYMENT SUCCESS |
        | amit.tyagi.qa@gmail.com |     251102 	  |              19                 |              34               | PAYMENT SUCCESS |


	
	#Negative Scenarios
	
	# When customer enter the invalid card details
    Scenario Outline: Negative scenario when customer enter the invalid card details
        Given Hit the given Weather shopper screen url
        Given Get the temprature from the screen
        When As per the temprature "<ThreaholdMoisturizersTemprature>" and "<ThreaholdSunscreensTemprature>" select the corressponding buy Moisturizers/Sunscreens
        And Add to the cart the least expensive Moisturizers/Sunscreens
        Then click on cart icon and navigate to transaction page
        Then Verify the cart items and their prices
        Then Click on to the Pay with card button
        Then Enter the customer email id "<CustomerEmailId>" 
        Then Enter the customer invalid card details
        Then Enter the customer zip code "<CustomerZipCode>"
        Then Do the payment
        Then Verify that the payment should not be processed and control remains on the same page
        
        Examples:
        
        | CustomerEmailId 			| CustomerZipCode | ThreaholdMoisturizersTemprature | ThreaholdSunscreensTemprature |
        | amit.tyagi.java@gmail.com |     250002 	  |              19                 |              34               |


	# When customer do not enter any details in the card pop up dialog
    Scenario Outline: Negative scenario when customer do not enter any details in the card pop up dialog
        Given Hit the given Weather shopper screen url
        Given Get the temprature from the screen
        When As per the temprature "<ThreaholdMoisturizersTemprature>" and "<ThreaholdSunscreensTemprature>" select the corressponding buy Moisturizers/Sunscreens
        And Add to the cart the least expensive Moisturizers/Sunscreens
        Then click on cart icon and navigate to transaction page
        Then Verify the cart items and their prices
        Then Click on to the Pay with card button
        Then Do the payment
        Then Verify that the payment should not be processed and control remains on the same page
        
        Examples:
        
        | ThreaholdMoisturizersTemprature | ThreaholdSunscreensTemprature |
        |              19                 |              34               |
