package Core_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");

		// click on creat new account button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		// input value in text box 1st name lastname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ajay");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mahor");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9561516105");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Password@123");
		Thread.sleep(2000);
		// select day dropdown
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day);
		Thread.sleep(2000);
		s.selectByVisibleText("5");
		// select by month dropdown
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(month);
		Thread.sleep(2000);
		s1.selectByVisibleText("Aug");
		// select by year dropdown
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		Thread.sleep(2000);
		s2.selectByVisibleText("1996");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}

}
