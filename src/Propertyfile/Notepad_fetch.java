package Propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Notepad_fetch {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\Sai\\eclipse-workspace\\Selenium\\DRIVERS\\credentials.properties.txt");
		Properties p =new Properties();
		p.load(fis);
		String UN = p.getProperty("un");
		System.out.println(UN);
		
		String PWD = p.getProperty("pwd");
		System.out.println(PWD);
		
		String URL = p.getProperty("url");
		System.out.println(URL);
		
		String BROWSER = p.getProperty("browser");
		System.out.println(BROWSER);
		
		
	}
	

}
