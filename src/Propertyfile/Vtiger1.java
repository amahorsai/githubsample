package Propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Vtiger1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\eclipse-workspace\\Selenium\\DRIVERS\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.get("http://localhost:8888/");
		//fetch the url from the properties file
		FileInputStream fis = new FileInputStream("C:\\Users\\Sai\\eclipse-workspace\\Selenium\\DRIVERS\\credentials.properties.txt");
		Properties p = new Properties();
		p.load(fis);
		String URL = p.getProperty("url");
		driver.get(URL);
		driver.manage().window().maximize();
		String username = p.getProperty("un");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		String pass = p.getProperty("pwd");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		
	}

}
