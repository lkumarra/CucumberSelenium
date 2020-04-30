package com.w2a.CucucmberPageObjectModel.steps;

import static org.testng.Assert.assertEquals;

import java.util.List;

import com.w2a.CucucmberPageObjectModel.pages.actions.CarsGuideHomePageActions;
import com.w2a.CucucmberPageObjectModel.pages.actions.CarsSearchPageActions;
import com.w2a.CucucmberPageObjectModel.utilities.SeleniumDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchCarSteps {

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carSearchPageActions;

	@Given("I am on the Hompe Page {string} of cars guide website")
	public void i_am_on_the_Hompe_Page_of_cars_guide_website(String webSiteUrl) {
		SeleniumDriver.openPage(webSiteUrl);
	}

	@When("I move to menu")
	public void i_move_to_menu(List<String> list) {
		String menu = list.get(1);
		System.out.println("The menu option selected is: " + menu);
		carsGuideHomePageActions.moveToBuyAndSale();
	}

	@When("I click on {string} link")
	public void i_click_on_link(String string) {
		carSearchPageActions = carsGuideHomePageActions.clickedOnSearchCars();
	}
	
	@When("I select Make as {string}")
	public void i_select_Make_as(String selectMake) {
		carSearchPageActions.selectCarsMake(selectMake);
	}

	@When("I select model as {string}")
	public void i_select_model_as(String selectModel) {
		carSearchPageActions.selectCarModel(selectModel);
	}

	@When("I select location as {string}")
	public void i_select_location_as(String selectLocation) {
		carSearchPageActions.selectCarLocation(selectLocation);
	}

	@When("I select price as {string}")
	public void i_select_price_as(String selectPrice) {
		carSearchPageActions.selectCarPrice(selectPrice);
	}

	@When("I click on {string} Button")
	public void i_click_on_Button(String string) {
		carSearchPageActions.clickOnFindMyNextCar();
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
		System.out.println("List of cars");
	}

	@Then("The page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {
		assertEquals(SeleniumDriver.getDriver().getTitle(), expectedTitle);
	}

}
