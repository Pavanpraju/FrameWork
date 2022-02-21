package com.projectname.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {
	
	XSSFWorkbook wb;
	public Exceldataprovider() throws Exception  {
		
		String Excelpath=System.getProperty("user.dir")+"\\Testdata\\Testdata.xlsx";
		File src=new File(Excelpath);
		try {
			FileInputStream file = new FileInputStream(src);
			wb=new XSSFWorkbook(file);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String getStringData(String sheetname,int row, int colum) {
		return wb.getSheet(sheetname).getRow(row).getCell(colum).getStringCellValue();
		
	}
	
	public double getNumericData(String sheetname,int row, int colum) {
		return wb.getSheet(sheetname).getRow(row).getCell(colum).getNumericCellValue();
		
	}

}
