package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 2)
	public void TC1() {
		Reporter.log("RunnigTC1",true);
	}
//	@Test(invocationCount = 3)
//	public void TC2() {
//		Reporter.log("Running TC2",true);
//	}
//	@Test(invocationCount = 4)
//	public void TC3() {
//		Reporter.log("Running TC3",true);
//	}
	}
