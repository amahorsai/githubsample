package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		//maximize window method
		driver.manage().window().maximize();
		
		//click on gmail tab
		driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']")).click();
		
		//enter the email
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ajaymahor5896gmail.com");
	}

}
