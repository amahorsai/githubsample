package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
//	@Test
//	public void login() {
//		Reporter.log("TC1",true);
//	}
//	
//	@Test(dependsOnMethods = {"login"})
//	public void logout () {
//		Reporter.log("TC2",true);
//	}
	
	@Test
	public void login() {
		Reporter.log("login",true);
	}
	
	@Test(dependsOnMethods = {"login"})
	public void logout() {
		Reporter.log("logout",true);
	}

}
