package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class sample1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\Sai\\\\Downloads\\\\edgedriver_win32\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("9561516105");
		driver.findElement(By.xpath("//button[@class='_1wGnMD rX1XT4 _2nD2xJ']")).click();
		
		
		
	
		
	}

}
