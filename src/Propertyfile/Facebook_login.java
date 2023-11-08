package Propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook_login {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\Sai\\\\Downloads\\\\edgedriver_win32\\\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	FileInputStream file = new FileInputStream("C:\\Users\\Sai\\eclipse-workspace\\Selenium\\FB Credential.txt");
	Properties prop = new Properties();
	prop.load(file);
	Thread.sleep(2000);
	String mail = prop.getProperty("UserName");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mail);
	Thread.sleep(2000);
	String password = prop.getProperty("Pass");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	
}
}

