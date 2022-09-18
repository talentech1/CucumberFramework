package com.tt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(id="user-name")
	public WebElement userNameFiled;
	
	@FindBy(id="password")
	public WebElement passwordFiled;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String userName, String password) {
		userNameFiled.sendKeys(userName);
		passwordFiled.sendKeys(password);
		loginButton.click();
	}

}
