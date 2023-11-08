package Propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetching {
	public static void main(String[] args) throws Throwable {
		//create object of File Input Stream class
		FileInputStream fis=new FileInputStream("C:\\Users\\Sai\\eclipse-workspace\\Selenium\\DRIVERS\\Excel.xlsx");
		//use create methods
		Workbook wb = WorkbookFactory.create(fis);
		//print ajay
		String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    System.out.println(data);
	    //print Rajesh
	    String data1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	    System.out.println(data1);
	    
	}

}
