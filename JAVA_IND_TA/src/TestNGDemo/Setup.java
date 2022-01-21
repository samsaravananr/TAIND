package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup 
{
	
	public WebDriver myD;
	
	
	@BeforeTest
	public void OPENB()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		myD=new ChromeDriver();
	}
	
	
	@AfterTest
	public void OPENC() 
	{
		myD.close();
	}

}
