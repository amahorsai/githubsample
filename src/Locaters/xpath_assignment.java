package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_assignment {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//click on creat new account 
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		//fill the first name
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ajay");
		
		//fill the lastname
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mahor");
		
		//fill the mob nm
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9561516105");
		
		//fill the password
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password@123");
		
	
	}

}
