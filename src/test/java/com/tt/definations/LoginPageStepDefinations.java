package com.tt.definations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepDefinations {
	private static WebDriver driver;
	public final static int TIMEOUT = 10;

	@Before
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	
	@After
	public void quitBrowser() {
		driver.quit();
	}
	
	@Given("I am on the Home page")
    public void goToHomepage() {
        driver.get("https://www.saucedemo.com/");
	}
	
	@When("I login using valid credentials")
	public void validLogin() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Then("I should be on the Inventory Page")
	public void checkInventoryPage() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
	}
	
	@When("I login using invalid credentials")
	public void i_login_using_invalid_credentials() {
		driver.findElement(By.id("user-name")).sendKeys("xyz");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@Then("I should be on the Home page")
	public void i_should_be_on_the_home_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.saucedemo.com/");
	}
}
