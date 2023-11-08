package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Pause_back_forward_refresh_close_Assignment3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();
	}

}
