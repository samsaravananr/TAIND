package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo1 
{
	
	public static String vURL;
	public static String vTitle;
	
	
	@Test
	public void TS001() throws InterruptedException
	{
		vURL="https://www.google.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
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
		myD.close();
	}
	

	

}
