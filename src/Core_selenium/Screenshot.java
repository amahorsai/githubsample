package Core_selenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");

		TakesScreenshot sreenshot = (TakesScreenshot) driver;
		File SourceImage = sreenshot.getScreenshotAs(OutputType.FILE);
		File destinationFolder = new File("C:\\\\Users\\\\Sai\\\\Desktop\\\\Screenshot\\\\FBPAGE.jpg");
		try {
			com.google.common.io.Files.copy(SourceImage, destinationFolder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}