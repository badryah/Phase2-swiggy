package steps;


import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import tests.TestBase;
public class Login  extends TestBase{
	HomePage homepage;
	LoginPage login;


	@Given("^the user in the home page$")
	public void the_user_in_the_home_page() throws Throwable {
		homepage = new HomePage(driver); 
	}
	/*@When("^I entered \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_entered(String firstname, String lastname, String email, String password) {
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(firstname, lastname,email,password);
	}*/

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		homepage = new HomePage(driver); 
		homepage.OpenLoginPage();
	}

	@When("^entered the invalid user data$")
	public void entered_the_invalid_user_data() throws Throwable {
		login = new LoginPage(driver);
		login.UserLogin("1111111111", "22");
	}

	@Then("^The login page displayed error message$")
	public void the_login_page_displayed_error_message() throws Throwable {
		Assert.assertTrue(login.errormessage.getText().contains("Enter valid OTP"));

	}}
