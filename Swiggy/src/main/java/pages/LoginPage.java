package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="mobile")
	WebElement phonenumberfield;
	 
	@FindBy(xpath = "//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a")
	WebElement loginbt;
	
	@FindBy (id = "otp")
	WebElement otpfield;
	
	@FindBy (xpath = "//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/div[2]/a")
	WebElement verifyotp;
	
	@FindBy(css = "label._1Cvlf._2tL9P.A7Y41")
	public WebElement errormessage;
	
	@FindBy(css = "div._1Tg1D")
	public WebElement logintext;
	
	public void UserLogin(String mobile, String onetimepass) throws InterruptedException
	{
		setTextElementText(phonenumberfield, mobile);
		Thread.sleep(4000);
		clickButton(loginbt);
		Thread.sleep(4000);
		setTextElementText(otpfield, onetimepass);
		Thread.sleep(4000);
		clickButton(verifyotp);
	}
	}
	
	


