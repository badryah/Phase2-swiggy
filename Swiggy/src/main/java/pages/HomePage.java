package pages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{


	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText  = "Login")
	WebElement LoginButton;

	public void OpenLoginPage() 
	{
		clickButton(LoginButton);
	}
}
