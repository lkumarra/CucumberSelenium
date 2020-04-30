package com.w2a.CucucmberPageObjectModel.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsSearchPageLocator {

	@FindBy(css = "#makes")
	public WebElement carMakesDropdown;

	@FindBy(css = "#models")
	public WebElement carModelsDropdown;

	@FindBy(css = "#locations")
	public WebElement carLocationsDropdown;

	@FindBy(css = "#priceTo")
	public WebElement carPriceDropdown;

	@FindBy(css = "#search-submit")
	public WebElement searchSubmitButton;

}
