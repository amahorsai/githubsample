package Core_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_practice {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ajay");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mahor");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9561516105");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[13]")).sendKeys("Password@123");
		// enter the dropdown inputs
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select = new Select(day);
		select.selectByVisibleText("5");
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select select1 = new Select(month);
		select1.selectByVisibleText("Aug");
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select2 = new Select(year);
		select2.selectByVisibleText("1996");
		driver.findElement(By.xpath("//label[text()='Male']")).click();

	}

}
