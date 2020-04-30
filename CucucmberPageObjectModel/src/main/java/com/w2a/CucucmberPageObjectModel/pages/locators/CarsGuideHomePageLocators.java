package com.w2a.CucucmberPageObjectModel.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsGuideHomePageLocators {
	
	@FindBy(xpath = "//a[@data-gtm-label = 'top nav car buy and sell']")
	public WebElement buySell;

	@FindBy(linkText = "reviews")
	public WebElement reviews;

	@FindBy(linkText = "news")
	public WebElement news;

	@FindBy(linkText = "advice")
	public WebElement advice;

	@FindBy(linkText = "pricing + specs")
	public WebElement pricingAndSpecs;

	@FindBy(linkText = "guides")
	public WebElement guides;

	@FindBy(linkText = "Search Cars")
	public WebElement searchCars;
	
	@FindBy(linkText = "Used")
	public WebElement usedCarsLink;
}
