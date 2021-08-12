@Smoke
Feature: User Login

	Scenario: Want to check that the user not be able to login in swiggy app with invalid OTP.
	Given the user in the home page
	When clicks on login button
	And entered the invalid user data 
	Then The login page displayed error message 



