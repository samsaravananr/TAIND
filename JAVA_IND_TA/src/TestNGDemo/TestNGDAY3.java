package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;



public class TestNGDAY3 extends Base 
{
	
	public static String vURL;
	public static String vTitle;
	//public static WebDriver myD;
	
	
	@Test
	public void TS001() throws InterruptedException
	{
		vURL="https://www.google.com";
		//myD.manage().window().maximize();
		myD.get(vURL);
		
	
		int vCount=myD.findElements(By.tagName("a")).size();
		System.out.println("Total Links "+vCount);
		
		for (int i=0;i<vCount;i++)
		{
			System.out.print(myD.findElements(By.tagName("a")).get(i).getText()+"      ");
			System.out.println(myD.findElements(By.tagName("a")).get(i).getAttribute("href"));
			
		}
		Thread.sleep(2000);
		
		//Assert.assertEquals("Sam", "Sam");
		
		
	}
	
	
	

}
