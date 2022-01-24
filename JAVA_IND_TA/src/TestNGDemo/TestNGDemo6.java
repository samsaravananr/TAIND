package TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDemo6 
{
	
	
	@Test
	public void OpenBrowser()
	{
		clearCookies();
		System.out.println("Opening Browser.......");
		Reporter.log("Opening Browser.......");
	}
	
	@Test (dependsOnMethods = {"OpenBrowser"})
	public void CloseBrowser()
	{
		System.out.println("Closing Browser.......");
		Reporter.log("Closing Browser.......");
	}
	
	public void clearCookies()
	{
		System.out.println("Clearning Cookies......");
	}
	
	
	

}
