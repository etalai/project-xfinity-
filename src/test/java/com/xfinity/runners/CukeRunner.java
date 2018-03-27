package com.xfinity.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/com/xfinity/features/speedtest.feature",
				 glue="step_definitions",
				dryRun=false
		)

public class CukeRunner {

}
