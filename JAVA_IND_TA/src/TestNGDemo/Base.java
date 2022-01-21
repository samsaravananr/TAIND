package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base 
{
	public WebDriver myD;
	
	@BeforeTest
	public void SetUp()
	{
		
		System.out.println("Inside Before Test Method.................................");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		myD=new ChromeDriver();
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("Inside After Test Method.................................");
		myD.close();
	}
	
	@BeforeSuite
	public void SuiteStart()
	{
		System.out.println("Suite Execution Started...............................");
		//
		
	}
	
	@AfterSuite
	public void SuiteEnd()
	{
		myD.manage().deleteAllCookies();
		System.out.println("Suite Execution Ended...............................");
		
	}
	
	
	
	
	

}
