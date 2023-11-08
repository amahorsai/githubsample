package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("ajaymahor5896@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("9561516105");
	    driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	    driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]")).click();
	  //  driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
	  //  driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
