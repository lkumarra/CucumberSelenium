package com.w2a.CucucmberPageObjectModel.pages.actions;

import org.openqa.selenium.support.PageFactory;
import com.w2a.CucucmberPageObjectModel.pages.locators.CarsSearchPageLocator;
import com.w2a.CucucmberPageObjectModel.utilities.SeleniumDriver;
import static com.w2a.CucucmberPageObjectModel.utilities.Utilities.*;

public class CarsSearchPageActions {

	CarsSearchPageLocator carsSearchPageLocator = null;

	public CarsSearchPageActions() {
		this.carsSearchPageLocator = new CarsSearchPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsSearchPageLocator);
	}

	/**
	 * Select the cars brand.
	 * 
	 * @param carBrand car brand to select.
	 */
	public void selectCarsMake(String carBrand) {
		selectByVisibleText(carsSearchPageLocator.carMakesDropdown, carBrand);

	}

	/**
	 * Select cars model.
	 * 
	 * @param carModel Car's Model to select.
	 */
	public void selectCarModel(String carModel) {
		selectByVisibleText(carsSearchPageLocator.carModelsDropdown, carModel);
	}

	/**
	 * Select cars Location.
	 * 
	 * @param carLocation Car's Location to select.
	 */
	public void selectCarLocation(String carLocation) {
		selectByVisibleText(carsSearchPageLocator.carLocationsDropdown, carLocation);
	}

	/**
	 * Select cars price.
	 * 
	 * @param carPrice Car's price to select.
	 */
	public void selectCarPrice(String carPrice) {
		selectByVisibleText(carsSearchPageLocator.carPriceDropdown, carPrice);
	}

	/**
	 * Click on Find My Next Cars.
	 */
	public void clickOnFindMyNextCar() {
		carsSearchPageLocator.searchSubmitButton.click();
	}

}
