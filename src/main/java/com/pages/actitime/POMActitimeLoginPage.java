package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;
import com.generics.actitime.ExcelLibrary;

public class POMActitimeLoginPage extends BasePage implements AutoConstant
{
	@FindBy(id = "username")
	private WebElement usernametextfeild;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	
	public POMActitimeLoginPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver,this);
	}
	
	public void Actitime() throws IOException
	{
		usernametextfeild.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 1));
		
	}

}
