package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigDataProvider
{
	 Properties pro;
	 
	public ConfigDataProvider() 
	{
		File src= new File("C:\\Users\\aksha\\eclipse-workspace\\FrameworkByMukesh\\Config\\config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			
			 pro= new Properties();
			
			pro.load(fis);
		}
		catch (Exception e) {
			
			System.out.println("Not able to load config file"+e.getMessage());
		} 
	}
	
	public String getBrowser()
	{
		return pro.getProperty("browser");
		
	}
	public String getUrl()
	{
		return pro.getProperty("url");
		
	}

}
