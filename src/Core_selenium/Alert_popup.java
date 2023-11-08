package Core_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		// give customer id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		// click on sub,it button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		// use alert interface method
		Alert alt = driver.switchTo().alert();
		// click on cancel button
		alt.accept();

	}

}
