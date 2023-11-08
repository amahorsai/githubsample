package Propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Notepad {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Sai\\eclipse-workspace\\Selenium\\ajay fb.txt");
		Properties p=new Properties();
		p.load(fis);
		String username = p.getProperty("user");
		System.out.println(username);
		
		String Password = p.getProperty("pass");
		System.out.println(Password);
		
		String URL = p.getProperty("url");
		System.out.println(URL);
	}

}
