package com.tt.definations;

import com.tt.utilities.SetupDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	@Before
	public void setUp() {
		SetupDriver driversetup = new SetupDriver();
		driversetup.setupUpDriver();
		
	}

	@After
	public void quitBrowser() {
		SetupDriver driversetup = new SetupDriver();
		driversetup.tearDown();
	}
}
