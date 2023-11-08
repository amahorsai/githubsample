package Propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class NotepadFetching {
	public static void main(String[] args) throws Throwable {
		// creat object of File Input Stream class
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Sai\\eclipse-workspace\\Selenium\\DRIVERS\\credentials.properties.txt");
		// create object of properties class
		Properties p = new Properties();
		p.load(fis);
		// print username
		String UN = p.getProperty("un");
		System.out.println(UN);
		// print password
		String PWD = p.getProperty("pwd");
		System.out.println(PWD);
		// print the url
		String URL = p.getProperty("url");
		System.out.println(URL);
		// print the browser name
		String BROSWER = p.getProperty("browser");
		System.out.println(BROSWER);
	}

}
