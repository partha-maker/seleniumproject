package com.scripts.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pages.actitime.POMActitimeLoginPage;

public class TestActitimeLoginPage extends BaseTest 
{
	WebDriver driver;
	@Test
	public void login() throws IOException
	{
		Reporter.log("it's done",true);
	}

}
