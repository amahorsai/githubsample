package Propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AjayFbLogin {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver",
				"C:\\\\Users\\\\Sai\\\\Downloads\\\\edgedriver_win32\\\\msedgedriver.exe");
		FileInputStream file = new FileInputStream("C:\\Users\\Sai\\eclipse-workspace\\Selenium\\ajay fb.txt");
		Properties prs = new Properties();
		prs.load(file);
		String URL = prs.getProperty("url");
		WebDriver driver = new EdgeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		String mail = prs.getProperty("user");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mail);
		Thread.sleep(2000);
		String password = prs.getProperty("pass");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}
