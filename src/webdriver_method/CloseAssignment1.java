package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseAssignment1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//Open Amazon Application
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		
		//navigate to flipkart
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//close the browser method here use
		driver.close();
	}

}
