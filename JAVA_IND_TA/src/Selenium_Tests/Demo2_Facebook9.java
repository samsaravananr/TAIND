package Selenium_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2_Facebook9 
{
	
	public static String vURL;
	public static String vTitle;

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		vURL="http://demo.automationtesting.in/Alerts.html";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get(vURL);
		
		Thread.sleep(2000);
		
		//Alert BOX
		myD.findElement(By.xpath("(//*[@class='analystic'])[1]")).click();
		myD.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		myD.switchTo().alert().accept();
		
		//Confirm Box
		myD.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
		myD.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		myD.switchTo().alert().dismiss();
		
		
		
		
		myD.findElement(By.xpath("(//*[@class='analystic'])[3]")).click();
		myD.findElement(By.xpath("//*[@class='btn btn-info']")).click();
		
	
		myD.switchTo().alert().sendKeys("Sam");
		Thread.sleep(5000);
		myD.switchTo().alert().accept();
		
		
		
		Thread.sleep(5000);
		myD.close();
		
		
	
	}
	
	
	
	
	

}
