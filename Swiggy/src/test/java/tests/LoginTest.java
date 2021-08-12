package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase{
	HomePage homepage;
	LoginPage login;

	@Test
	public void Login() throws InterruptedException
	{
		homepage = new HomePage(driver); 
		homepage.OpenLoginPage();
		login = new LoginPage(driver);
		login.UserLogin("1111111111", "22");
		Assert.assertTrue(login.errormessage.getText().contains("Enter valid OTP"));
		
	}
	}


