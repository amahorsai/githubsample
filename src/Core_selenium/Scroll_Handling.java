package Core_selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class Scroll_Handling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
//		//Scroll down 
//		Thread.sleep(3000);
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,2000)");
//		
//		//Scroll up
//		Thread.sleep(3000);
//		jse.executeScript("window.scrollBy(0,-2000)");
		
		//Scroll Down
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		//Scroll up
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1000)");
	}

}
