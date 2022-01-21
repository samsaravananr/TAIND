package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDAY6 
{
	
	public WebDriver myD;
	
	@Test (groups = "R2")
	public void TS001() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		myD=new ChromeDriver();
		String vURL="https://www.amazon.in";
		//myD.manage().window().maximize();
		myD.get(vURL);
		Thread.sleep(5000);
		System.out.println(myD.getTitle());
		myD.close();
	}
}