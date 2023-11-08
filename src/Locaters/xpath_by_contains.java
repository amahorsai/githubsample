package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_by_contains {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//enter username
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
		//enter password
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		//click on login button
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
	}

}
