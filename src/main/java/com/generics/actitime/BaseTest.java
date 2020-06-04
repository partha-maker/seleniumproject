package com.generics.actitime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pages.actitime.POMActitimeLoginPage;

public class BaseTest implements AutoConstant
{
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@BeforeMethod
	public void startExecution() throws IOException
	{
		Reporter.log("Execution of test methodstart");
		POMActitimeLoginPage a=new POMActitimeLoginPage(driver);
		a.Actitime();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	

}
