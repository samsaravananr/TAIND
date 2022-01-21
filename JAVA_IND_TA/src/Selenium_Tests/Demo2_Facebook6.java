package Selenium_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2_Facebook6 
{
	
	public static String vURL;
	public static String vTitle;

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		vURL="https://www.mortgagecalculator.org/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get(vURL);
		
		//XPATH two ways 
		
		// 1. Absolute : /html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]
		// 2. Relative : 
			//tagname[@attribute='value']
			//tagname[@attribute='value' and @attribute='value']
		
		String vText=myD.findElement(By.xpath("//div[@class='repayment-block']/div[1]/div[1]/h3")).getText();
		System.out.println(vText);
		
		
		Thread.sleep(2000);
		myD.close();
		
		
	
	}
	
	
	
	
	

}
