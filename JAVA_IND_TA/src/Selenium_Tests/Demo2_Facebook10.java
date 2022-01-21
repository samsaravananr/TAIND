package Selenium_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2_Facebook10 
{
	
	public static String vURL;
	public static String vTitle;

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		vURL="https://jqueryui.com/droppable/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get(vURL);
		
		Thread.sleep(2000);
		
				
	
		//myD.switchTo().frame(0);
		//myD.switchTo().frame("IDorName");
		myD.switchTo().frame(myD.findElement(By.xpath("//iframe[@class='demo-frame']")));
		System.out.println(myD.findElement(By.id("draggable")).getText());
		
		//System.out.println(myD.findElements(By.tagName("iframe")).size());
		
		
		
		Thread.sleep(5000);
		myD.close();
		
		
	
	}
	
	
	
	
	

}
