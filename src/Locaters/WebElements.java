package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class WebElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		// Open Google
		driver.get("https://www.google.com");
		
		// Maximize Window
		driver.manage().window().maximize();
		
		//click on mail
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		//enter the email
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ajaymahor5896@gmail.com");
		
		//click on next button
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
	}

}
