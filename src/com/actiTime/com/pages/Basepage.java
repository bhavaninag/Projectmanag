package com.actiTime.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Basepage 
{
	public WebDriver driver;
	
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("title is matching", true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matchingd and expected title is" +eTitle);
			Reporter.log("Actual title is" +driver.getTitle(),true);
		}
	}
	
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not present", true);
		}
		
	}
}
