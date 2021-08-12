package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;    

import org.testng.annotations.BeforeClass;

public class TestBase extends AbstractTestNGCucumberTests{
	// 
	public static WebDriver driver;	

	private static ITestContext context;

	public static ITestContext setContext(ITestContext iTestContext, WebDriver driver) {
		iTestContext.setAttribute("driver", driver);
		return iTestContext;
	}
	@BeforeClass
	public void setUp(ITestContext iTestContext)//ITestContext iTestContext
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		context = setContext(iTestContext, driver);
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");	
	}
	/*@Before
public void setup(Scenario scenario) {
		System.out.println("The scenario will start in excuation ...");

	}
	@After 
public void teardown() {
		System.out.println("Close the browser");

	}*/


	@AfterClass
	public void stopDriver() 
	{
		driver.quit();
	}}
