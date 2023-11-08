package Core_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ajay");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mahor");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9561516105");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password@123");
		//input the dropdowns value
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(day);
		s.selectByVisibleText("5");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Aug");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1996");
		
		Thread.sleep(2000);
		
		//click on Gender
		
		driver.findElement(By.xpath("//label[.='Male']")).click();
		
		//click on submit button
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
		
	}

}
