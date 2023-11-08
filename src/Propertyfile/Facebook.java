package Propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\eclipse-workspace\\Selenium\\DRIVERS\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		FileInputStream fis=new FileInputStream("C:\\Users\\Sai\\eclipse-workspace\\Selenium\\ajay fb.txt");
		Properties p = new Properties();
		p.load(fis);
		Thread.sleep(2000);
	//	driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String URL = p.getProperty("url");
		driver.get(URL);
		String mail = p.getProperty("user");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mail);
		String PWD = p.getProperty("pass");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(PWD);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

	
		
	}

}
