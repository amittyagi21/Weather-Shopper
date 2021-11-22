$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/WeatherShopper.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# This is the feature file as a part of the cucumber bdd framework"
    },
    {
      "line": 2,
      "value": "# which contains all the steps of the end to end testing of the weather shopper screen"
    },
    {
      "line": 3,
      "value": "#Positive Scenario"
    }
  ],
  "line": 5,
  "name": "Testing the WeatherShopper Screen",
  "description": "",
  "id": "testing-the-weathershopper-screen",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@Weather"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 7,
      "value": "# Positive scenario"
    }
  ],
  "line": 9,
  "name": "End to End Testing the WeatherShopper Screen",
  "description": "",
  "id": "testing-the-weathershopper-screen;end-to-end-testing-the-weathershopper-screen",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "Hit the given Weather shopper screen url",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Get the temprature from the screen",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "As per the temprature \"\u003cThreaholdMoisturizersTemprature\u003e\" and \"\u003cThreaholdSunscreensTemprature\u003e\" select the corressponding buy Moisturizers/Sunscreens",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Add to the cart the least expensive Moisturizers/Sunscreens",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on cart icon and navigate to transaction page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Verify the cart items and their prices",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click on to the Pay with card button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the customer email id \"\u003cCustomerEmailId\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Enter the customer card details",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Enter the customer zip code \"\u003cCustomerZipCode\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Do the payment",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify the Customer payment Status \"\u003cPaymentStatus\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Validate the Customer Acknoledgement",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "testing-the-weathershopper-screen;end-to-end-testing-the-weathershopper-screen;",
  "rows": [
    {
      "cells": [
        "CustomerEmailId",
        "CustomerZipCode",
        "ThreaholdMoisturizersTemprature",
        "ThreaholdSunscreensTemprature",
        "PaymentStatus"
      ],
      "line": 26,
      "id": "testing-the-weathershopper-screen;end-to-end-testing-the-weathershopper-screen;;1"
    },
    {
      "cells": [
        "amit.tyagi.java@gmail.com",
        "250002",
        "19",
        "34",
        "PAYMENT SUCCESS"
      ],
      "line": 27,
      "id": "testing-the-weathershopper-screen;end-to-end-testing-the-weathershopper-screen;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9204339500,
  "status": "passed"
});
formatter.before({
  "duration": 71199,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "End to End Testing the WeatherShopper Screen",
  "description": "",
  "id": "testing-the-weathershopper-screen;end-to-end-testing-the-weathershopper-screen;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Weather"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Hit the given Weather shopper screen url",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Get the temprature from the screen",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "As per the temprature \"19\" and \"34\" select the corressponding buy Moisturizers/Sunscreens",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Add to the cart the least expensive Moisturizers/Sunscreens",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on cart icon and navigate to transaction page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Verify the cart items and their prices",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click on to the Pay with card button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the customer email id \"amit.tyagi.java@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Enter the customer card details",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Enter the customer zip code \"250002\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Do the payment",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify the Customer payment Status \"PAYMENT SUCCESS\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Validate the Customer Acknoledgement",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherShopperDefinition.hit_the_given_Weather_shopper_screen_url()"
});
formatter.result({
  "duration": 5450843400,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.get_the_temprature_from_the_screen()"
});
formatter.result({
  "duration": 2319223499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "19",
      "offset": 23
    },
    {
      "val": "34",
      "offset": 32
    }
  ],
  "location": "WeatherShopperDefinition.as_per_the_temprature_and_select_the_corressponding_buy_Moisturizers_Sunscreens(String,String)"
});
formatter.result({
  "duration": 7117667500,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.add_to_the_cart_the_least_expensive_Moisturizers_Sunscreens()"
});
formatter.result({
  "duration": 3707106800,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.click_on_cart_icon_and_navigate_to_transaction_page()"
});
formatter.result({
  "duration": 37778861100,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.verify_the_cart_items_and_their_prices()"
});
formatter.result({
  "duration": 362943601,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.click_on_to_the_Pay_with_card_button()"
});
formatter.result({
  "duration": 7392037600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amit.tyagi.java@gmail.com",
      "offset": 29
    }
  ],
  "location": "WeatherShopperDefinition.enter_the_customer_email_id(String)"
});
formatter.result({
  "duration": 897293200,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.enter_the_customer_card_details()"
});
formatter.result({
  "duration": 5170836800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "250002",
      "offset": 29
    }
  ],
  "location": "WeatherShopperDefinition.enter_the_customer_zip_code(String)"
});
formatter.result({
  "duration": 923458199,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.do_the_payment()"
});
formatter.result({
  "duration": 9041051401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PAYMENT SUCCESS",
      "offset": 36
    }
  ],
  "location": "WeatherShopperDefinition.verify_the_Customer_payment_Status(String)"
});
formatter.result({
  "duration": 200014800,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.validate_the_Customer_Acknoledgement()"
});
formatter.result({
  "duration": 142906600,
  "status": "passed"
});
formatter.after({
  "duration": 7436681599,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 31,
      "value": "#Negative Scenarios"
    },
    {
      "line": 33,
      "value": "# When customer enter the invalid card details"
    }
  ],
  "line": 34,
  "name": "Negative scenario when customer enter the invalid card details",
  "description": "",
  "id": "testing-the-weathershopper-screen;negative-scenario-when-customer-enter-the-invalid-card-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 35,
  "name": "Hit the given Weather shopper screen url",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Get the temprature from the screen",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "As per the temprature \"\u003cThreaholdMoisturizersTemprature\u003e\" and \"\u003cThreaholdSunscreensTemprature\u003e\" select the corressponding buy Moisturizers/Sunscreens",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Add to the cart the least expensive Moisturizers/Sunscreens",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "click on cart icon and navigate to transaction page",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Verify the cart items and their prices",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Click on to the Pay with card button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Enter the customer email id \"\u003cCustomerEmailId\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Enter the customer invalid card details",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Enter the customer zip code \"\u003cCustomerZipCode\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Do the payment",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Verify that the payment should not be processed and control remains on the same page",
  "keyword": "Then "
});
formatter.examples({
  "line": 48,
  "name": "",
  "description": "",
  "id": "testing-the-weathershopper-screen;negative-scenario-when-customer-enter-the-invalid-card-details;",
  "rows": [
    {
      "cells": [
        "CustomerEmailId",
        "CustomerZipCode",
        "ThreaholdMoisturizersTemprature",
        "ThreaholdSunscreensTemprature"
      ],
      "line": 50,
      "id": "testing-the-weathershopper-screen;negative-scenario-when-customer-enter-the-invalid-card-details;;1"
    },
    {
      "cells": [
        "amit.tyagi.java@gmail.com",
        "250002",
        "19",
        "34"
      ],
      "line": 51,
      "id": "testing-the-weathershopper-screen;negative-scenario-when-customer-enter-the-invalid-card-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7822725400,
  "status": "passed"
});
formatter.before({
  "duration": 124300,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Negative scenario when customer enter the invalid card details",
  "description": "",
  "id": "testing-the-weathershopper-screen;negative-scenario-when-customer-enter-the-invalid-card-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Weather"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "Hit the given Weather shopper screen url",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Get the temprature from the screen",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "As per the temprature \"19\" and \"34\" select the corressponding buy Moisturizers/Sunscreens",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Add to the cart the least expensive Moisturizers/Sunscreens",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "click on cart icon and navigate to transaction page",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Verify the cart items and their prices",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Click on to the Pay with card button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Enter the customer email id \"amit.tyagi.java@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Enter the customer invalid card details",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Enter the customer zip code \"250002\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Do the payment",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Verify that the payment should not be processed and control remains on the same page",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherShopperDefinition.hit_the_given_Weather_shopper_screen_url()"
});
formatter.result({
  "duration": 2051045100,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.get_the_temprature_from_the_screen()"
});
formatter.result({
  "duration": 2105136101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "19",
      "offset": 23
    },
    {
      "val": "34",
      "offset": 32
    }
  ],
  "location": "WeatherShopperDefinition.as_per_the_temprature_and_select_the_corressponding_buy_Moisturizers_Sunscreens(String,String)"
});
formatter.result({
  "duration": 5340017600,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.add_to_the_cart_the_least_expensive_Moisturizers_Sunscreens()"
});
formatter.result({
  "duration": 4216835900,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.click_on_cart_icon_and_navigate_to_transaction_page()"
});
formatter.result({
  "duration": 59184153800,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.verify_the_cart_items_and_their_prices()"
});
formatter.result({
  "duration": 304038800,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.click_on_to_the_Pay_with_card_button()"
});
formatter.result({
  "duration": 7270440200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amit.tyagi.java@gmail.com",
      "offset": 29
    }
  ],
  "location": "WeatherShopperDefinition.enter_the_customer_email_id(String)"
});
formatter.result({
  "duration": 554504100,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.enter_the_customer_invalid_card_details()"
});
formatter.result({
  "duration": 3767664100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "250002",
      "offset": 29
    }
  ],
  "location": "WeatherShopperDefinition.enter_the_customer_zip_code(String)"
});
formatter.result({
  "duration": 680844301,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.do_the_payment()"
});
formatter.result({
  "duration": 8669135501,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.verify_that_the_payment_should_not_be_processed_and_control_remains_on_the_same_page()"
});
formatter.result({
  "duration": 139907499,
  "status": "passed"
});
formatter.after({
  "duration": 9043641900,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 54,
      "value": "# When customer do not enter any details in the card pop up dialog"
    }
  ],
  "line": 55,
  "name": "Negative scenario when customer do not enter any details in the card pop up dialog",
  "description": "",
  "id": "testing-the-weathershopper-screen;negative-scenario-when-customer-do-not-enter-any-details-in-the-card-pop-up-dialog",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 56,
  "name": "Hit the given Weather shopper screen url",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "Get the temprature from the screen",
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "As per the temprature \"\u003cThreaholdMoisturizersTemprature\u003e\" and \"\u003cThreaholdSunscreensTemprature\u003e\" select the corressponding buy Moisturizers/Sunscreens",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "Add to the cart the least expensive Moisturizers/Sunscreens",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "click on cart icon and navigate to transaction page",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "Verify the cart items and their prices",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "Click on to the Pay with card button",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "Do the payment",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "Verify that the payment should not be processed and control remains on the same page",
  "keyword": "Then "
});
formatter.examples({
  "line": 66,
  "name": "",
  "description": "",
  "id": "testing-the-weathershopper-screen;negative-scenario-when-customer-do-not-enter-any-details-in-the-card-pop-up-dialog;",
  "rows": [
    {
      "cells": [
        "ThreaholdMoisturizersTemprature",
        "ThreaholdSunscreensTemprature"
      ],
      "line": 68,
      "id": "testing-the-weathershopper-screen;negative-scenario-when-customer-do-not-enter-any-details-in-the-card-pop-up-dialog;;1"
    },
    {
      "cells": [
        "19",
        "34"
      ],
      "line": 69,
      "id": "testing-the-weathershopper-screen;negative-scenario-when-customer-do-not-enter-any-details-in-the-card-pop-up-dialog;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13039610401,
  "status": "passed"
});
formatter.before({
  "duration": 24900,
  "status": "passed"
});
formatter.scenario({
  "line": 69,
  "name": "Negative scenario when customer do not enter any details in the card pop up dialog",
  "description": "",
  "id": "testing-the-weathershopper-screen;negative-scenario-when-customer-do-not-enter-any-details-in-the-card-pop-up-dialog;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Weather"
    }
  ]
});
formatter.step({
  "line": 56,
  "name": "Hit the given Weather shopper screen url",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "Get the temprature from the screen",
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "As per the temprature \"19\" and \"34\" select the corressponding buy Moisturizers/Sunscreens",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "Add to the cart the least expensive Moisturizers/Sunscreens",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "click on cart icon and navigate to transaction page",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "Verify the cart items and their prices",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "Click on to the Pay with card button",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "Do the payment",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "Verify that the payment should not be processed and control remains on the same page",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherShopperDefinition.hit_the_given_Weather_shopper_screen_url()"
});
formatter.result({
  "duration": 2106659901,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.get_the_temprature_from_the_screen()"
});
formatter.result({
  "duration": 2092521300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "19",
      "offset": 23
    },
    {
      "val": "34",
      "offset": 32
    }
  ],
  "location": "WeatherShopperDefinition.as_per_the_temprature_and_select_the_corressponding_buy_Moisturizers_Sunscreens(String,String)"
});
formatter.result({
  "duration": 4577882800,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.add_to_the_cart_the_least_expensive_Moisturizers_Sunscreens()"
});
formatter.result({
  "duration": 8115638400,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.click_on_cart_icon_and_navigate_to_transaction_page()"
});
formatter.result({
  "duration": 29345566201,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.verify_the_cart_items_and_their_prices()"
});
formatter.result({
  "duration": 257863000,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.click_on_to_the_Pay_with_card_button()"
});
formatter.result({
  "duration": 7319633101,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.do_the_payment()"
});
formatter.result({
  "duration": 8985668000,
  "status": "passed"
});
formatter.match({
  "location": "WeatherShopperDefinition.verify_that_the_payment_should_not_be_processed_and_control_remains_on_the_same_page()"
});
formatter.result({
  "duration": 236281701,
  "status": "passed"
});
formatter.after({
  "duration": 6338778500,
  "status": "passed"
});
});