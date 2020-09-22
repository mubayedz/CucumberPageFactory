$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SearchCars.feature");
formatter.feature({
  "name": "Acceptance testing to validate Search page is working fine.",
  "description": "\tIn order to validate that\nthe search cars page is working fine\nwe will do the acceptance testing",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Search-Cars"
    }
  ]
});
formatter.scenario({
  "name": "Validate search cars page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Search-Cars"
    },
    {
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page \"https://www.carsguide.com.au\" of Carsguide",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchCarsSteps.i_am_on_the_home_page_of_Carsguide(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I move to the menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ]
    },
    {
      "cells": [
        "buy + sell"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchCarsSteps.i_move_to_the_menu(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.click_on_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select carbrand as \"BMW\" from Anymake dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_carbrand_as_from_Anymake_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Any Model dropdown as \"1 Series\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_Any_Model_dropdown_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Any Location dropdown as \"NSW - New England\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_Any_Location_dropdown_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Any Price (max) dropdown as \"$45,000\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_Any_Price_max_dropdown_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \"Find My Next Car\" button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.click_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchCarsSteps.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Bmw 1 Series Under 45000 for Sale New England NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.the_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/UsedCarsSearch.feature");
formatter.feature({
  "name": "Acceptance testing to validate Used Search cars page is working fine.",
  "description": "\tIn order to validate that\nthe search cars page is working fine\nwe will do the acceptance testing",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Used-Search-Cars"
    }
  ]
});
formatter.scenario({
  "name": "Validate used search cars page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Used-Search-Cars"
    },
    {
      "name": "@Used-Search-Cars-Positive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I\u0027m on the home page \"https://www.carsguide.com.au\" of Carsguide",
  "keyword": "Given "
});
formatter.match({
  "location": "UsedCarsSearchSteps.i_m_on_the_home_page_of_Carsguide(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hover over the menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ]
    },
    {
      "cells": [
        "buy + sell"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "UsedCarsSearchSteps.i_hover_over_the_menu(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the \"Used\" link",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.click_on_the_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select car brand as \"Ford\" from Anymake dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.select_car_brand_as_from_Anymake_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Any_Model dropdown as \"Mustang\"",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.select_Any_Model_dropdown_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Any_Location dropdown as \"WA - All\"",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.select_Any_Location_dropdown_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Any_Price (max)",
  "rows": [
    {
      "cells": [
        "Price"
      ]
    },
    {
      "cells": [
        "$200,000"
      ]
    },
    {
      "cells": [
        "$55.000"
      ]
    },
    {
      "cells": [
        "$25.000"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.select_Any_Price_max(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \"Find My Next Car\" blue button",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.click_on_blue_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see a list of used cars",
  "keyword": "Then "
});
formatter.match({
  "location": "UsedCarsSearchSteps.i_should_see_a_list_of_used_cars()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page titles should be \"Used Ford Mustang Under 200000 for Sale WA | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.the_page_titles_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});