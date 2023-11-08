package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
//	@Test(priority = 4)
//	public void TC1() {
//		Reporter.log("I am TC1",true);
//	}
//	@Test(priority = 3)
//	public void TC2() {
//		Reporter.log("I am TC2",true);
//		
//	}
//	@Test(priority = 2)
//	public void TC3() {
//		Reporter.log("I am TC3",true);
//	}
//	@Test(priority = 1)
//	public void TC4() {
//		Reporter.log("I am TC4",true);
//	}
	@Test(priority = 2)
	public void TC1() {
		Reporter.log("I am running TC1",true);
	}
	
	@Test(priority = 3)
	public void TC2() {
		Reporter.log("I am running TC2",true );
	}
	
	@Test(priority = 1)
	public void TC3() {
		Reporter.log("I am running TC3",true );
	}
}
