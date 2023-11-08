package Core_selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Ref;

import javax.xml.transform.OutputKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Particular_screenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://google.com/");
//		WebElement ref= driver.findElement(By.xpath("//img[@class='lnXdpd']"));
//		File src = ref.getScreenshotAs(OutputType.FILE);
//		File dest=new File("C:\\Users\\Sai\\Desktop\\Screenshot\\gglogo.png");
//		Files.copy(src, dest);
//		
		
		WebElement ref = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		File src = ref.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Sai\\Desktop\\Screenshot\\google logo.png");
		Files.copy(src, dest);
		
	}

}
