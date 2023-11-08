package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	public void m1() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	
	}

}
