package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void TC1() {
		Reporter.log("TC1",true);
	}
	
	@Test(enabled = false)                     // it is the test case is false or ignore 
	public void TC2() {
		Reporter.log("TC2",true);
	}
	
	@Test
	public void TC3() {
		Reporter.log("TC3",true);
	}
	
	@Test(enabled = false)                    // it is the test case is ignore. run on TC is console passes in 1,3,5 only.
	public void TC4() {
		Reporter.log("TC4",true);
	}
	
	@Test
	public void TC5() {
		Reporter.log("TC5",true);
	}

}
