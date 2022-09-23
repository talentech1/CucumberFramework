package com.tt.definations;

import org.testng.Assert;

import com.tt.utilities.SetupDriver;

import io.cucumber.java.en.Then;

public class InventoryPageStepsDefinitions {
	
	@Then("I should be on the Inventory Page")
	public void checkInventoryPage() {
		String currentUrl = SetupDriver.driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
	}
}
