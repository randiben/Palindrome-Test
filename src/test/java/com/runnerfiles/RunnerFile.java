package com.runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/test/resources/Features", glue="com.stepdef")


public class RunnerFile extends AbstractTestNGCucumberTests {

}
