package Core_selenium;

import java.awt.RenderingHints.Key;

import javax.security.auth.kerberos.KeyTab;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Key_class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.id("email")).sendKeys("ajaymahor5896@gmail.com",Keys.TAB,"Ajay@1234",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajaymahor5896@gmail.com",Keys.TAB,"Ajay@1234",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajaymahor5896@gmail.com",Keys.TAB,"Ajay@1234",Keys.ENTER);

	}

}
