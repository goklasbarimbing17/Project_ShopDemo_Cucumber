package com.juaracoding.shopdemo.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"com.juaracoding.shopdemo"}
)

public class TestRun extends AbstractTestNGCucumberTests {


}
