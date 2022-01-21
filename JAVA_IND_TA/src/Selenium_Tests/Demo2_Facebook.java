package Selenium_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2_Facebook 
{
	
	public static String vURL;
	//public static String[] vPassword;

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		vURL="https://www.facebook.com";
		String vPassword[]= {"12345","4444","8888"};
		
		
		//TC
		//0. Maximize the Browser Window
		//1. Open Facebook.com
		//2. Capture the title and Print
		//3. Capture Current URL and Print
		//4. Wait for 5 seconds
		//5. Enter UserName
		//6. Enter Password
		//7. Click Login Button
		//8. Capture the Error Message
		//5. Close the Browser
		
		
		//This is For ChromeDriver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		
		
		//This is for FirefoxDriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\geckodriver.exe");
		
		//WebDriver myD=new ChromeDriver();
		WebDriver myD=new FirefoxDriver();
		
		//0. Maximize the Browser Window
		myD.manage().window().maximize();
		
		//1. Open gmail.com
		myD.get(vURL);
		
		//2. Capture the title and Print
		myprint("Title is :"+myD.getTitle());
		
		//3. Capture Current URL and Print
		myprint("URL is: "+myD.getCurrentUrl());
		
		//4. Wait for 5 seconds
		//Thread.sleep(5000);
		
		myD.findElement(By.id("email")).sendKeys("samsaravanananr");
		for (int i=0;i<vPassword.length;i++)
		{
		myD.findElement(By.id("pass")).sendKeys(vPassword[i]);
		Thread.sleep(2000);
		myD.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		}
		myD.findElement(By.name("login")).click();
		String vError=myD.findElement(By.className("_9ay7")).getText();
		myprint(vError);
		
		
		

		//5. Close the Browser
		myD.close();
		
		
		//TESTNG 
		
	}
	
	public static void myprint(String vText)
	{
		System.out.println(vText);
	}
	
	
	
	

}
