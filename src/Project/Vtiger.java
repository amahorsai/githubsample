package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Vtiger {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		//Enter valid username
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		//Enter valid Password
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		//click on login button
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		//get title
		String tit = driver.getTitle();
		System.out.println(tit);
	}

}
