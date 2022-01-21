package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo2 
{
	
	public static String vURL;
	public static String vTitle;

	@Test
	public void TS002() throws InterruptedException
	{
		vURL="https://www.amazon.in";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		//myD.manage().window().maximize();
		myD.get(vURL);
		
		//XPATH two ways 
		
		// 1. Absolute : /html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]
		// 2. Relative : 
			//tagname[@attribute='value']
			//tagname[@attribute='value' and @attribute='value']
		
		myD.findElement(By.xpath("//span[@class='nav-line-2 nav-progressive-content']")).click();

		Assert.assertEquals("Saravananr", "Sam");
		Thread.sleep(2000);
		myD.close();
		
		
		
		
		
		
	
	}
	
	
	
	
	

}
