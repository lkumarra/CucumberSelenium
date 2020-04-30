package com.w2a.CucucmberPageObjectModel.steps;

import static org.testng.Assert.assertEquals;

import java.util.List;

import com.w2a.CucucmberPageObjectModel.pages.actions.CarsGuideHomePageActions;
import com.w2a.CucucmberPageObjectModel.pages.actions.UsedCarSearchPageActions;
import com.w2a.CucucmberPageObjectModel.utilities.SeleniumDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UsedCarsSteps {
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarSearchPageActions usedCarSearchPageActions;

	@Given("I am on the Hompe Page {string} of cars guide website to test used search cars")
	public void i_am_on_the_Hompe_Page_of_cars_guide_website_to_test_used_search_cars(String url) {
		SeleniumDriver.openPage(url);
	}

	@When("I move to menu to select used cars")
	public void i_move_to_menu_to_select_used_cars(List<String> list) {
		carsGuideHomePageActions.moveToBuyAndSale();
	}

	@When("I click on {string} link on buy and sell menu")
	public void i_click_on_link_on_buy_and_sell_menu(String string) {
		usedCarSearchPageActions = carsGuideHomePageActions.clickedOnUsedCars();

	}

	@When("I select  {string} as brand")
	public void i_select_as_brand(String brand) {
		usedCarSearchPageActions.selectCarsMake(brand);

	}

	@When("I select  {string} as model")
	public void i_select_as_model(String model) {
		usedCarSearchPageActions.selectCarModel(model);

	}

	@When("I select  {string} as location")
	public void i_select_as_location(String locations) {
		usedCarSearchPageActions.selectCarLocation(locations);

	}

	@When("I select  {string} as price")
	public void i_select_as_price(String price) {
		usedCarSearchPageActions.selectCarPrice(price);

	}

	@When("I click on {string} Button on used search cars")
	public void i_click_on_Button_on_used_search_cars(String string) {
		usedCarSearchPageActions.clickOnFindMyNextCar();

	}

	@Then("I should see list of searched cars on used search car")
	public void i_should_see_list_of_searched_cars_on_used_search_car() {

	}

	@Then("The page title should be {string} of used searched car")
	public void the_page_title_should_be_of_used_searched_car(String title) {
		assertEquals(SeleniumDriver.getDriver().getTitle(), title);

	}

}
