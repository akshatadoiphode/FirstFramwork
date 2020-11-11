package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginFBPage;
import com.learnautomation.utility.browserUtility;
import com.learnautomation.utility.excelDataProvider;

public class LoginFBTest extends BaseClass {
	
	
	
	
@Test
public void loginApp() {
		//new comment
	LoginFBPage page=PageFactory.initElements(driver, LoginFBPage.class);
	excelDataProvider excel= new excelDataProvider();
	

		try {
			page.loginToFB(excel.getStringData("Sheet1", 0, 0),excel.getStringData("Sheet1", 0, 1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
}
	

}
