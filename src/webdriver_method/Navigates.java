package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigates {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.amazon.com");
		// give the wait of 5 seconds
		Thread.sleep(5000);

		driver.navigate().to("https://www.google.com");
		// go back to amazon
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		// i will go front
		driver.navigate().forward();
		Thread.sleep(2000);

		// now I will the refresh page
		driver.navigate().refresh();

		// close
		driver.close();

	}

}
