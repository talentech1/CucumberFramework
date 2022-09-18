Feature: Login Features
	
	@automated
	Scenario: Logging in using valid credentials
		Given I am on the Home page
		When I login using valid credentials
		Then I should be on the Inventory Page

	Scenario: Invalid login
		Given I am on the Home Page
		When I login using invalid credentials
		Then I should be on the Home page
