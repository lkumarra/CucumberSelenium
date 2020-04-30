package com.w2a.CucucmberPageObjectModel.pages.actions;

import static com.w2a.CucucmberPageObjectModel.utilities.Utilities.selectByVisibleText;
import org.openqa.selenium.support.PageFactory;
import com.w2a.CucucmberPageObjectModel.pages.locators.UsedCarsSearchPageLocators;
import com.w2a.CucucmberPageObjectModel.utilities.SeleniumDriver;

public class UsedCarSearchPageActions {

	UsedCarsSearchPageLocators usedCarsSearchPageLocators = null;

	public UsedCarSearchPageActions() {
		this.usedCarsSearchPageLocators = new UsedCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchPageLocators);
	}

	/**
	 * Select the cars brand.
	 * 
	 * @param carBrand car brand to select.
	 */
	public void selectCarsMake(String carBrand) {
		selectByVisibleText(usedCarsSearchPageLocators.carMakesDropdown, carBrand);

	}

	/**
	 * Select cars model.
	 * 
	 * @param carModel Car's Model to select.
	 */
	public void selectCarModel(String carModel) {
		selectByVisibleText(usedCarsSearchPageLocators.carModelsDropdown, carModel);
	}

	/**
	 * Select cars Location.
	 * 
	 * @param carLocation Car's Location to select.
	 */
	public void selectCarLocation(String carLocation) {
		selectByVisibleText(usedCarsSearchPageLocators.carLocationsDropdown, carLocation);
	}

	/**
	 * Select cars price.
	 * 
	 * @param carPrice Car's price to select.
	 */
	public void selectCarPrice(String carPrice) {
		selectByVisibleText(usedCarsSearchPageLocators.carPriceDropdown, carPrice);
	}

	/**
	 * Click on Find My Next Cars.
	 */
	public void clickOnFindMyNextCar() {
		usedCarsSearchPageLocators.searchSubmitButton.click();
	}

}
