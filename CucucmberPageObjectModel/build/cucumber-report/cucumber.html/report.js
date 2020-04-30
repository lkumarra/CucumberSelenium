$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/UsedCarSearch.feature");
formatter.feature({
  "name": "Acceptance testing to validate used cars page is working fine",
  "description": "  In order to validate that \n  the used cars page is working fine\n  we will do the acceptance testing",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Used-Search-Cars"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Hompe Page \"https://www.carsguide.com.au/\" of cars guide website to test used search cars",
  "keyword": "Given "
});
formatter.match({
  "location": "com.w2a.CucucmberPageObjectModel.steps.UsedCarsSteps.i_am_on_the_Hompe_Page_of_cars_guide_website_to_test_used_search_cars(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I move to menu to select used cars",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.w2a.CucucmberPageObjectModel.steps.UsedCarsSteps.i_move_to_menu_to_select_used_cars(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate search cars page",
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
formatter.step({
  "name": "I click on \"Used Car\" link on buy and sell menu",
  "keyword": "And "
});
formatter.match({
  "location": "com.w2a.CucucmberPageObjectModel.steps.UsedCarsSteps.i_click_on_link_on_buy_and_sell_menu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select  \"Audi\" as brand",
  "keyword": "And "
});
formatter.match({
  "location": "com.w2a.CucucmberPageObjectModel.steps.UsedCarsSteps.i_select_as_brand(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select  \"A4\" as model",
  "keyword": "And "
});
formatter.match({
  "location": "com.w2a.CucucmberPageObjectModel.steps.UsedCarsSteps.i_select_as_model(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select  \"ACT - All\" as location",
  "keyword": "And "
});
formatter.match({
  "location": "com.w2a.CucucmberPageObjectModel.steps.UsedCarsSteps.i_select_as_location(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select  \"$100,000\" as price",
  "keyword": "And "
});
formatter.match({
  "location": "com.w2a.CucucmberPageObjectModel.steps.UsedCarsSteps.i_select_as_price(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Find My Next Car\" Button on used search cars",
  "keyword": "And "
});
formatter.match({
  "location": "com.w2a.CucucmberPageObjectModel.steps.UsedCarsSteps.i_click_on_Button_on_used_search_cars(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see list of searched cars on used search car",
  "keyword": "Then "
});
formatter.match({
  "location": "com.w2a.CucucmberPageObjectModel.steps.UsedCarsSteps.i_should_see_list_of_searched_cars_on_used_search_car()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The page title should be \"Used Audi A4 Under 100000 for Sale ACT | carsguide\" of used searched car",
  "keyword": "And "
});
formatter.match({
  "location": "com.w2a.CucucmberPageObjectModel.steps.UsedCarsSteps.the_page_title_should_be_of_used_searched_car(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
