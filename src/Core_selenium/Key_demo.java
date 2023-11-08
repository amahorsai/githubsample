package Core_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Key_demo {public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	//driver.findElement(By.id("email")).sendKeys("ajaymahor5896@gmail.com",Keys.TAB,"Ajay@1234",Keys.ENTER);
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajaymahor5896@gmail.com",Keys.TAB,"Ajay@1234",Keys.ENTER);
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajaymahor5896@gmail.com",Keys.TAB,"Ajay@1234",Keys.ENTER);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajaymahor5896@gmail.com",Keys.TAB,"Ajay@1234",Keys.ENTER);
}   

}
