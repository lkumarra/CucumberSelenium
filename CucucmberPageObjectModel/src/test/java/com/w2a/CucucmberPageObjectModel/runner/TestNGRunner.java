package com.w2a.CucucmberPageObjectModel.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/Resources/Features"} , plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
glue = "com\\w2a\\CucucmberPageObjectModel\\steps")
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
