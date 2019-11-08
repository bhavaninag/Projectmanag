package com.actiTime.com.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	public static void getscreenshot(WebDriver driver, String name)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src= ts.getScreenshotAs(OutputType.FILE);
			File dest=new  File("E://Project Management//ActiTime//Screenshots"+name+".png");
			FileUtils.copyFile(src, dest);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
		
		public static void selectByIndex(WebElement ele, int index)
		{
			Select sel=new Select(ele);
			sel.selectByIndex(index);
		}
		
		public static void selectByvalue(WebElement ele, String value)
		{
			Select sel1=new Select(ele);
			sel1.selectByValue(value);
			
		}
		public static void selectByvisibleText(WebElement ele, String text)
		{
			Select sel=new Select(ele);
			sel.selectByVisibleText(text);
		}
	}

