package Propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EX_data_fetching {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\Sai\\eclipse-workspace\\Selenium\\DRIVERS\\Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String store = wb.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
		System.out.println(store);
		
		String store1 = wb.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
		System.out.println(store1);
		
		String A = wb.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		System.out.println(A);
		
		String B = wb.getSheet("Sheet1").getRow(3).getCell(4).getStringCellValue();
		System.out.println(B);
	}

}
