package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hdfc.com/");
		String a=driver.getTitle();
		System.out.println(a);
		
	}

}
