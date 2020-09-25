package com.test.utility;

import java.util.ArrayList;
import com.excel.utility.Xls_Reader;
public class TestUtil {

	static Xls_Reader reader;
	public static ArrayList<Object[]> getExceldata() {
		
		reader=new Xls_Reader(System.getProperty("C:\\Users\\bhavani.kore\\Desktop\\dataprovider.xlsx"));
		
		ArrayList<Object[]> mydata= new ArrayList<Object[]>();
		
		for(int rownum=2;rownum<=reader.getRowCount(sheet1); rownum++) {
			
			//getting data from excel 
			String FirstName=reader.getCellData(dataprovider,FirstName,rownum);
			
			String LastName=reader.getCellData(dataprovider,LastName,rownum);
			
			String Address=reader.getCellData(dataprovider,Address,rownum);
			
			String Email=reader.getCellData(dataprovider,Email,rownum);
			
			String phno=reader.getCellData(dataprovider,Email,phno);
			
			Object ob= {FirstName,LastName,Address,Email,phno};
			
			mydata.add(ob);
			
			}
		
		return mydata;
	}
	
	
	
}
