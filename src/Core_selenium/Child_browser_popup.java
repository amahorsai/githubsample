package Core_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Child_browser_popup {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		// click on cancel button or hidden division popup
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		//search for mobiles
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
		//click on search bar
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//search the 1st phones
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		//wait
		Thread.sleep(3000);
		Set<String> allWins = driver.getWindowHandles();
		for(String win1:allWins) {
			driver.switchTo().window(win1);
			
		}
			String title1 = driver.getTitle();
			System.out.println(title1);
		}
	
		
	}


