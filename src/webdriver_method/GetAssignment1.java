package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetAssignment1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
	}

}
