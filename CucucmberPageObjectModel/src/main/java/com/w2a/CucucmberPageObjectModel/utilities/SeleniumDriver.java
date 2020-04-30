package com.w2a.CucucmberPageObjectModel.utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;

	private SeleniumDriver() {

		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

	}

	/**
	 * Open the url.
	 * 
	 * @param url Url of the website to enter.
	 */
	public static void openPage(String url) {
		driver.get(url);
	}

	/**
	 * Return the driver instance.
	 * 
	 * @return driver instance.
	 */
	public static WebDriver getDriver() {
		return driver;
	}

	/**
	 * Create the of object of SeleniumDriver class.
	 */
	public static void setUpDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}

	/**
	 * Quit the session.
	 */
	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}

}
