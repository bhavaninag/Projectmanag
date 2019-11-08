package com.actiTime.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Basepage
{
	@FindBy(id="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pwtb;
	
	@FindBy(xpath="//div(text()='Login ')")
	private WebElement lgbtn;
	
	@FindBy(xpath="//span[contains(text(),invalid)]")
	private WebElement errmsg;
	
	@FindBy(xpath="//nobr[contains(text(),actiTIME )")
	private WebElement version;
	
	//initialization
	
	public Loginpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void verifythetitle(String etitle)
	{
		verifyTitle(etitle);
	}
	
	public void enterusername(String un)
	{
		untb.sendKeys(un);
	}

	public void enterpassword(String un)
	{
		pwtb.sendKeys(un);
	}
	
	public void clickonlogin()
	{
		lgbtn.click();
	}
	
	public String verifyerrmsg(WebElement errmsg)
	{
		verifyElement(errmsg);
		String Eerrmsg=errmsg.getText();
		return Eerrmsg;
	}	
	
	public String verifyversion(WebElement Version)
	{
		verifyElement(Version);
		String Eversion=version.getText();
		return Eversion;
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
