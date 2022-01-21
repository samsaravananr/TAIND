package Selenium_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2_Facebook3 
{
	
	public static String vURL;
	public static String vTitle;

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		vURL="https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		
		
		
		
	
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get(vURL);
		vTitle=myD.getTitle();
		
		if(vTitle.contains("Sign in"))
		{
			System.out.println("PASS: Navigated to Home Page");
		}
		else
		{
			System.out.println("FAIL: Navigated to Wrong Page");
		}
		
		myD.findElement(By.id("username")).sendKeys("samsaravananr");
		Thread.sleep(2000);
		myD.findElement(By.name("session_password")).sendKeys("12345");
		Thread.sleep(2000);
		myD.findElement(By.className("button__password-visibility")).click();
		Thread.sleep(2000);
		myD.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);
		myD.findElement(By.partialLinkText("Join")).click();
		
		myD.close();
		
	
	}
	
	
	
	
	

}
