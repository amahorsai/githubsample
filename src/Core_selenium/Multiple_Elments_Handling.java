package Core_selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_Elments_Handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		int count=0;
		driver.get("https://www.flipkart.com");
		//click on cancel button
		driver.findElement(By.xpath("//span[@role='button']")).click();
		//find elements method use
		List<WebElement> allelem = driver.findElements(By.xpath("//div"));
		for(WebElement ele:allelem) {
		String e = ele.getText();
		System.out.println(e);
		count++;
	
		
			
		}
		System.out.println(count);
	}

}
