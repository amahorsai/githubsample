package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
	@Test
	public void m2() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
	}

}
