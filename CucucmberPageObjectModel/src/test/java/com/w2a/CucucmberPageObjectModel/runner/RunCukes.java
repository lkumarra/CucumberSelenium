package com.w2a.CucucmberPageObjectModel.runner;
import org.testng.annotations.Test;

import courgette.api.CourgetteOptions;
import courgette.api.CucumberOptions;
import courgette.api.testng.TestNGCourgette;
import courgette.api.CourgetteRunLevel;


@Test
@CourgetteOptions(
        threads = 10,
        runLevel = CourgetteRunLevel.SCENARIO,
        rerunFailedScenarios = true,
        showTestOutput = true,
        reportTargetDir = "build",
        cucumberOptions = @CucumberOptions(
                features = {"src/test/resources/Features"},
                glue ="com\\w2a\\CucucmberPageObjectModel\\steps",
                tags = {"@Used-Search-Cars", "not @wip"},
                plugin = {
                        "pretty",
                        "json:build/cucumber-report/cucumber.json",
                        "html:build/cucumber-report/cucumber.html"},
				monochrome = true,
				strict = true
        ))
public class RunCukes extends TestNGCourgette {

}
