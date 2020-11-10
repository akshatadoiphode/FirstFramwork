package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFBPage {
	
	WebDriver driver;
	
	public LoginFBPage(WebDriver driver)
	{
	this.driver=driver;		
	}
	
	
	@FindBy(name="email") WebElement uname;
	
	@FindBy(name="pass") WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']") WebElement login;
	
	public void loginToFB(String customername,String customerpwd) throws Exception
		{
		
		
	  uname.sendKeys(customername);
	  
	  pwd.sendKeys(customerpwd);
	  
	  login.click();
	}
	

}
