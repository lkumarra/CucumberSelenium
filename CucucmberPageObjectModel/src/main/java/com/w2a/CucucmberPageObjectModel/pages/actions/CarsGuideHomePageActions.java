package com.w2a.CucucmberPageObjectModel.pages.actions;
import org.openqa.selenium.support.PageFactory;

import com.w2a.CucucmberPageObjectModel.pages.locators.CarsGuideHomePageLocators;
import com.w2a.CucucmberPageObjectModel.utilities.SeleniumDriver;
import static com.w2a.CucucmberPageObjectModel.utilities.Utilities.*;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() {

		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}

	/**
	 * Move to buy+sale menu.
	 */
	public void moveToBuyAndSale() {
		moveToElement(carsGuideHomePageLocators.buySell);
	}

	/**
	 * Click on seach cars.
	 * 
	 * @return Object of CarsSearchPageActions class.
	 */
	public CarsSearchPageActions clickedOnSearchCars() {
		clickOnElement(carsGuideHomePageLocators.searchCars);
		return new CarsSearchPageActions();
	}

	/**
	 * Clicked on used cars.
	 * @return 
	 */
	public UsedCarSearchPageActions clickedOnUsedCars() {
		clickOnElement(carsGuideHomePageLocators.usedCarsLink);
		return new UsedCarSearchPageActions();
	}

	/**
	 * Move to reviews menu.
	 */
	public void moveToReviews() {
		moveToElement(carsGuideHomePageLocators.reviews);
	}

}
