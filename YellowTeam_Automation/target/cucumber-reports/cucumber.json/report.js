$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cucumber_Features/LoginTestCases.feature");
formatter.feature({
  "line": 1,
  "name": "Zoopla users can buy \u0026 sell the property",
  "description": "\r\nDescription: \"User can search the property, check the price, contact with the agent.\"",
  "id": "zoopla-users-can-buy-\u0026-sell-the-property",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Login with valid credential \u0026 Verify the home page",
  "description": "",
  "id": "zoopla-users-can-buy-\u0026-sell-the-property;login-with-valid-credential-\u0026-verify-the-home-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "As a user I am able to open any browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "As a user I am able to enter \"https://www.zoopla.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "As a user I am able to click on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "As a user I am able to enter the valid \"\u003cuserName\u003e\" and \"\u003cpassWord\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "As a user I am able to submit signin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Homepage title should be \"Browse properties by city or town in the UK\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "As a user I can enter the location as \"New York, Lincolnshire\" \u0026 search it",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "As a user I can print all the price values",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "As a user I can select the fifth property on list",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "As a user I can verify the logo, name and phone number of the agent \"Logo,Agent name,phone number\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "As a user I can click on my zoopla button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "As a user I can click on signout button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Loginpage title should be \"Zoopla \u003e Search Property to Buy, Rent, House Prices, Estate Agents\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "As a user I can close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "zoopla-users-can-buy-\u0026-sell-the-property;login-with-valid-credential-\u0026-verify-the-home-page;",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord"
      ],
      "line": 21,
      "id": "zoopla-users-can-buy-\u0026-sell-the-property;login-with-valid-credential-\u0026-verify-the-home-page;;1"
    },
    {
      "cells": [
        "jhumarayyan@gmail.com",
        "Tuktuki2712"
      ],
      "line": 22,
      "id": "zoopla-users-can-buy-\u0026-sell-the-property;login-with-valid-credential-\u0026-verify-the-home-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "Login with valid credential \u0026 Verify the home page",
  "description": "",
  "id": "zoopla-users-can-buy-\u0026-sell-the-property;login-with-valid-credential-\u0026-verify-the-home-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "As a user I am able to open any browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "As a user I am able to enter \"https://www.zoopla.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "As a user I am able to click on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "As a user I am able to enter the valid \"jhumarayyan@gmail.com\" and \"Tuktuki2712\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "As a user I am able to submit signin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Homepage title should be \"Browse properties by city or town in the UK\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "As a user I can enter the location as \"New York, Lincolnshire\" \u0026 search it",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "As a user I can print all the price values",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "As a user I can select the fifth property on list",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "As a user I can verify the logo, name and phone number of the agent \"Logo,Agent name,phone number\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "As a user I can click on my zoopla button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "As a user I can click on signout button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Loginpage title should be \"Zoopla \u003e Search Property to Buy, Rent, House Prices, Estate Agents\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "As a user I can close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ZooplaStepDefinition.as_a_user_I_am_able_to_open_any_browser()"
});
formatter.result({
  "duration": 5573432200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.zoopla.com/",
      "offset": 30
    }
  ],
  "location": "ZooplaStepDefinition.as_a_user_I_am_able_to_enter(String)"
});
formatter.result({
  "duration": 2150100800,
  "status": "passed"
});
formatter.match({
  "location": "ZooplaStepDefinition.as_a_user_I_am_able_to_click_on_signin_button()"
});
formatter.result({
  "duration": 2090171200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jhumarayyan@gmail.com",
      "offset": 40
    },
    {
      "val": "Tuktuki2712",
      "offset": 68
    }
  ],
  "location": "ZooplaStepDefinition.as_a_user_I_am_able_to_enter_the_valid_and(String,String)"
});
formatter.result({
  "duration": 246361600,
  "status": "passed"
});
formatter.match({
  "location": "ZooplaStepDefinition.as_a_user_I_am_able_to_submit_signin_button()"
});
formatter.result({
  "duration": 705377100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Browse properties by city or town in the UK",
      "offset": 26
    }
  ],
  "location": "ZooplaStepDefinition.homepage_title_should_be(String)"
});
formatter.result({
  "duration": 96293300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York, Lincolnshire",
      "offset": 39
    }
  ],
  "location": "ZooplaStepDefinition.as_a_user_I_can_enter_the_location_as_search_it(String)"
});
formatter.result({
  "duration": 2149460800,
  "status": "passed"
});
formatter.match({
  "location": "ZooplaStepDefinition.as_a_user_I_can_print_all_the_price_values()"
});
formatter.result({
  "duration": 165443600,
  "status": "passed"
});
formatter.match({
  "location": "ZooplaStepDefinition.as_a_user_I_can_select_the_fifth_property_on_list()"
});
formatter.result({
  "duration": 1105441600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logo,Agent name,phone number",
      "offset": 69
    }
  ],
  "location": "ZooplaStepDefinition.as_a_user_I_can_verify_the_logo_name_and_phone_number_of_the_agent(String)"
});
formatter.result({
  "duration": 86329100,
  "status": "passed"
});
formatter.match({
  "location": "ZooplaStepDefinition.as_a_user_I_can_click_on_my_zoopla_button()"
});
formatter.result({
  "duration": 189453700,
  "status": "passed"
});
formatter.match({
  "location": "ZooplaStepDefinition.as_a_user_I_can_click_on_signout_button()"
});
formatter.result({
  "duration": 16068500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Zoopla \u003e Search Property to Buy, Rent, House Prices, Estate Agents",
      "offset": 27
    }
  ],
  "location": "ZooplaStepDefinition.loginpage_title_should_be(String)"
});
formatter.result({
  "duration": 35534600,
  "status": "passed"
});
formatter.match({
  "location": "ZooplaStepDefinition.as_a_user_I_can_close_the_browser()"
});
formatter.result({
  "duration": 635466700,
  "status": "passed"
});
});