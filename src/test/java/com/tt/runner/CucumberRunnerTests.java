package com.tt.runner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tt.utilities.SetupDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(tags = "@automated", features = { "src/test/resources/features/Login.feature" }, glue = {
		"com.tt.definations" }, plugin = { "pretty", "html:target/cucumber-reports.html" })
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
