package Core_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_sample {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//select day dropdown
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Thread.sleep(2000);
		Select select1=new Select(day);
		Thread.sleep(2000);
		select1.selectByVisibleText("5");
	    WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Thread.sleep(2000);
		Select select2 =new Select(month);
		select2.selectByVisibleText("Aug");
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Thread.sleep(2000);
		Select select3=new Select(year);
		select3.selectByVisibleText("1996");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	
				
		
		
	
	}

}
