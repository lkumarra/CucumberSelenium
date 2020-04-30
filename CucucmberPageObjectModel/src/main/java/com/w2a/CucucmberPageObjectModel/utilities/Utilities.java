package com.w2a.CucucmberPageObjectModel.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	private static WebDriverWait waitDriver;

	/**
	 * Exlplicitly wait until a element in a clickable state for a given time.
	 * 
	 * @param element Element for which wait.
	 */
	private static void waitUntilElementIsClickable(WebElement element) {
		waitDriver = new WebDriverWait(SeleniumDriver.getDriver(), SeleniumDriver.TIMEOUT);
		waitDriver.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * Explicitly wait until a element is visible.
	 * 
	 * @param element Element for which wait.
	 */
	private static void waitUntilElementIsVisible(WebElement element) {
		waitDriver = new WebDriverWait(SeleniumDriver.getDriver(), SeleniumDriver.TIMEOUT);
		waitDriver.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Perform click action on the element.
	 * 
	 * @param element Element on which click action performed.
	 */
	public static void clickOnElement(WebElement element) {
		waitUntilElementIsClickable(element);
		element.click();
	}

	/**
	 * Enter text into element after clear.
	 * 
	 * @param element Element to enter text.
	 */
	public static void enterTextIntoElementWithClear(WebElement element) {
		waitUntilElementIsClickable(element);
		element.clear();
		element.click();
	}

	/**
	 * Enter text into element without clear.
	 * 
	 * @param element Element to enter text.
	 */
	public static void enterTextIntoElement(WebElement element) {
		waitUntilElementIsClickable(element);
		element.click();
	}

	/**
	 * Return the text of the webelement.
	 * 
	 * @param element Element to get the text.
	 * @return Text of webelement.
	 */
	public static String getElementText(WebElement element) {
		waitUntilElementIsVisible(element);
		return element.getText();
	}

	/**
	 * Return the attribute of the weblement.
	 * 
	 * @param element   Element to get attribute
	 * @param attribute Attribute to find value.
	 * @return Attribute value of the webelement.
	 */
	public static String getElementAttribute(WebElement element, String attribute) {
		waitUntilElementIsVisible(element);
		return element.getAttribute(attribute);
	}

	/**
	 * Perform mouse move action on the element.
	 * 
	 * @param element element on which mouse move action has performed.
	 */
	public static void moveToElement(WebElement element) {
		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(element).build().perform();
	}

	/**
	 * Select a value from dropdown using text.
	 * 
	 * @param element Dropdown element on which select operation has performed.
	 * @param text    Text for selecting the value.
	 */
	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * Perform the enter key operation.
	 * 
	 * @param element element on which enter operation has performed.
	 */
	public static void pressEnterKey(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}

	/**
	 * Return the alert text and accept the alert.
	 * 
	 * @return Text of the alert.
	 */
	public static String getAlertTextAndAccept() {
		Alert alert = SeleniumDriver.getDriver().switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	/**
	 * Accept the alert.
	 */
	public static void acceptAlert() {
		SeleniumDriver.getDriver().switchTo().alert().accept();
	}

	/**
	 * Dismiss the alert..
	 */
	public static void disMissAlert() {
		SeleniumDriver.getDriver().switchTo().alert().dismiss();
	}

}
