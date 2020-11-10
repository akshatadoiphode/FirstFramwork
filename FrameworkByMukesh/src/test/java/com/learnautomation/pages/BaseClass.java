package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.browserUtility;
import com.learnautomation.utility.excelDataProvider;

public class BaseClass {
	 public WebDriver driver;
	 public excelDataProvider excel;
	 public ConfigDataProvider config;
	 
	 @BeforeSuite
	 public void setUpSuite()
	 {
		  excel= new excelDataProvider();
		 
		  config=new ConfigDataProvider(); 
	 }
	
	@BeforeTest
	public void setUp()
	{
		driver=browserUtility.initilizeBrowser(driver,config.getBrowser(),config.getUrl());
		
		System.out.println(driver.getTitle());
		}
	
	@AfterTest
	public void teatDown() 
	{
	browserUtility.quitBrowser(driver);
	}



}
