package com.tt.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
	public static WebDriver driver;
	public final static int TIMEOUT = 10;
	
	public void setupUpDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void tearDown() {
		driver.quit();
	}
}
