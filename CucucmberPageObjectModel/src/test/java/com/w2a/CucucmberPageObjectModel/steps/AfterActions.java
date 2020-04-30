package com.w2a.CucucmberPageObjectModel.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.w2a.CucucmberPageObjectModel.utilities.SeleniumDriver;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;

public class AfterActions {
	
	@After
	public static void tearDown(Scenario scenario) {
		WebDriver driver = SeleniumDriver.getDriver();
		System.out.println(scenario.isFailed());
		if (scenario.isFailed()) {
			byte[] screenshotByte = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotByte, "image/png", scenario.getName());
		}
		SeleniumDriver.tearDown();
	}

}
