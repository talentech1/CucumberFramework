package com.tt.definations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class InventoryPageStepsDefinitions {
	public static WebDriver driver;
	@Then("I should be on the Inventory Page")
	public void checkInventoryPage() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
	}
}
