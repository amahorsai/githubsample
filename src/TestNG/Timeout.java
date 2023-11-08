package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut = 10)   // if any test case is taking to much time for execution then we can use timeout keyword/TestNg flag
	public void TC1() {
		Reporter.log("I am TC1",true );
	}
	
	@Test(timeOut = 20)  //this Tc is taking so much time for execution then we use in timeout keyword.
	public void TC2() {
		Reporter.log("TC2",true );
	}
	
	@Test(timeOut = 15)         // use timeout keyword because Tc is take so much time for execution 
	public void TC3() {
		Reporter.log("TC3",true);
	}

}
