package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDataProvider 
{
	
	XSSFWorkbook wb;
    public excelDataProvider()
    {
	File src=new File("C:\\Users\\aksha\\eclipse-workspace\\FrameworkByMukesh\\TestData\\FBtestData.xlsx");
	
	try {
		FileInputStream fis=new FileInputStream(src);
		
		 wb=new XSSFWorkbook(fis);
	    } 
	 catch (IOException e)
	{
		System.out.println("Unable to read excel file" +e.getMessage());
	}
	
}
    
    public String getStringData(String Sheet1,int row,int column)
    {
    	return wb.getSheet("Sheet1").getRow(row).getCell(column).getStringCellValue();
    }
    
    public double getNumericData(String Sheet1,int row,int column)
    {
    	return wb.getSheet("Sheet1").getRow(row).getCell(column).getNumericCellValue();
    }
    
}