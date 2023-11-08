package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_Index_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		//search the mob 
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("vivo mobile 5g pro");
		//click on search button
		driver.findElement(By.xpath("(//input)[5]")).click();
	}

}
