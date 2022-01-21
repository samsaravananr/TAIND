package Selenium_Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2_Facebook11 
{
	
	public static String vURL;
	public static String vTitle;

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		vURL="https://www.gmail.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get(vURL);
		//System.out.println(myD.getTitle());
		myD.findElement(By.linkText("Help")).click();
		
		String WinHandle=myD.getWindowHandle();
		System.out.println("Window Handle "+WinHandle);
		
		Set<String> ids=myD.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		System.out.println(ids);
		
		
		String vParentWindow=it.next();
		String vChildWindow=it.next();
		
		
		myD.switchTo().window(vChildWindow);
		//System.out.println(ids);
		
		
		//System.out.println(myD.getTitle());

		
		
		Thread.sleep(5000);
		myD.quit();
		
		
	
	}
	
	
	
	
	

}
