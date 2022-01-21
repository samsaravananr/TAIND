package Selenium_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2_Facebook8 
{
	
	public static String vURL;
	public static String vTitle;

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		
		
		vURL="http://www.youcandealwithit.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		myD.manage().window().maximize();
		myD.get(vURL);
		
		Thread.sleep(2000);
		
		Actions act=new Actions(myD);
		act.moveToElement(myD.findElement(By.linkText("BORROWERS"))).build().perform();
		
		myD.findElement(By.linkText("Calculators & Resources")).click();
		
		myD.findElement(By.linkText("Calculators")).click();
		
		try
		{
		myD.findElement(By.linkText("Budget Calculatorsssss")).click();
		myD.close();
		}
		catch (Exception e)
		{
			System.out.println("Unable to Idenfy the element "+e);
			myD.close();
			
			System.out.println("Browser Closed");
		}
		
	
	}
	
	
	
	
	

}
