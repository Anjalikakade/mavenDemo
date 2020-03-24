package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AssOnGoggle 
{
	WebDriver driver;
	@BeforeMethod
	public void setbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Start Application:");
	
	}
	@Test()
	public void checkurl()
	{
		String url=driver.getCurrentUrl();
		System.out.println("URL is:"+url);
		Assert.assertEquals(url, "https://www.google.com/");
		
	}
	@Test()
	public void checklog()
	{
		 boolean logo=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		 System.out.println("Display logo is :"+logo);
		 Assert.assertTrue(logo);
		 
		
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();;
		System.out.println("Close Browser.");
	}
	
}
