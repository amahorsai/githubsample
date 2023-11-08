package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_Attribute {               //x path assignment 1st(facebook)
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		// open the browser
		driver.get("https://www.flipkart.com");
		
		// click the pop up cancel button
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		// search for mob search bar under 20000k
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("mobiles under 20k");

				

	}

}
