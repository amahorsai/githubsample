package Batchexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test(enabled = false)
	public void TC1() {
		Reporter.log("Running TC1",true);
	}
	@Test
	public void TC2() {
		Reporter.log("Running TC2",true);
	}

}
