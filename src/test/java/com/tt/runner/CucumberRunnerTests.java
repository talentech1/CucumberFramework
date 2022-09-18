package com.tt.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features/Login.feature"}, glue = {"com.tt.definations"},
plugin = {})
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
