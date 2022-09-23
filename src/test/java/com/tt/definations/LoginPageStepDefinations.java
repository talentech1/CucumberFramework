package com.tt.definations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.tt.pages.HomePage;
import com.tt.utilities.SetupDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepDefinations {
	HomePage homePage;
	
	@Given("I am on the Home page")
    public void goToHomepage() {
		SetupDriver.driver.get("https://www.saucedemo.com/");
        homePage = new HomePage();
        
	}
	
	@When("I login using valid credentials")
	public void validLogin() {
		homePage.login("standard_user", "secret_sauce");
	}
	
	@When("I login using invalid credentials")
	public void i_login_using_invalid_credentials() {
		homePage.login("xyz", "secret_sauce");
	}
	@Then("I should be on the Home page")
	public void i_should_be_on_the_home_page() {
		String currentUrl = SetupDriver.driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.saucedemo.com/");
	}
}
