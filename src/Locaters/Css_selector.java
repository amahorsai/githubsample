package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Css_selector {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.gmail.com");
        driver.findElement(By.cssSelector("input[aria-label='Email or phone']")).sendKeys("ajaymahor5896@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.cssSelector("a[aria-label='Try again']")).click();
        
	}

}
