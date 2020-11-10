package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserUtility {
	

	public static WebDriver initilizeBrowser( WebDriver driver,String browserName, String url)
	{
		
		 if(browserName.equals("Chrome"))
		 {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aksha\\eclipse-workspace\\FrameworkByMukesh\\Drivers\\chromedriver.exe");
						
			 driver= new ChromeDriver();
		 }
		 else
		 {
			 System.out.println("we don't support this driver");
		 }
		
			 
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		      driver.get(url);
				
		      return driver;
			
	}
		
		public static void quitBrowser(WebDriver driver)
		{
			
			driver.quit();
		}
			
		

}

