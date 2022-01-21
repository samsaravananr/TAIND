package Selenium_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1_NavigateToGoogle {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		
		//TC
		//0. Maximize the Browser Window
		//1. Open gmail.com
		//2. Capture the title and Print
		//3. Capture Current URL and Print
		//4. Wait for 5 seconds
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
		myD.get("https://www.google.com");
		
		//2. Capture the title and Print
		myprint("Title is :"+myD.getTitle());
		
		//3. Capture Current URL and Print
		myprint("URL is: "+myD.getCurrentUrl());
		
		//4. Wait for 5 seconds
		Thread.sleep(5000);

		//5. Close the Browser
		myD.close();
		
		
		//TESTNG 
		
	}
	
	public static void myprint(String vText)
	{
		System.out.println(vText);
	}
	
	
	
	

}
