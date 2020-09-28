package com.atmecs.dataproviderdemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelDataTest {

	
	@Test
	
	public void ExcelData() throws IOException {
		
		String excelpath="C:\\Users\\bhavani.kore\\Desktop\\dataprovider.xlsx";
		
		FileInputStream fis= new FileInputStream(excelpath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		
		//row count
		
		int rowNum=sheet.getLastRowNum()+1;
		
		System.out.println("rowcount" +rowNum);
		
		
		//column count
		
		int colcount=sheet.getRow(0).getLastCellNum();
		
		System.out.println("column count"+colcount);
		
		
		String[][]data= new String[rowNum][colcount];
		
		//iterating
		
		for(int i=1;i<rowNum;i++) {
			
			XSSFRow row= sheet.getRow(i);
			
			for(int j=0;j<colcount;j++) {
				
				XSSFCell cell= row.getCell(j);
				
				//String value=cell.toString();
				
				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				
				data[i][j]=value;
				
				System.out.println("the value is:" +value);
				
				
			}
		}
		workbook.close();
		
		
			
	}
		
		
		}
	

