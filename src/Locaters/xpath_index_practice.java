package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_index_practice {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//creat new account 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a)[3]")).click();
		//enter the 1st name
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[9]")).sendKeys("Ajay");
		//enter the last name
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[10]")).sendKeys("Mahor");
		//enter the mob number
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[11]")).sendKeys("9561516105");
		//enter the new password
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[13]")).sendKeys("Password@123");
		
		
		
	}

}
