package com.w2a.CucucmberPageObjectModel.steps;

import com.w2a.CucucmberPageObjectModel.utilities.SeleniumDriver;

import io.cucumber.java.Before;

public class BeforeActions {
	
	@Before
	public static void setUp() {
		SeleniumDriver.setUpDriver();
	}

}
