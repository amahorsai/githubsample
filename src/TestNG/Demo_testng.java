package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_testng {
	@Test
	public void m1() {
		Reporter.log("hiiii",true);
	}
	@Test
	public void m2() {
		Reporter.log("hello",true);
		
	}
	@Test
	public void m3() {
		Reporter.log("by",true);
	}
	@Test
	public void m4() {
		Reporter.log("haha",true);
	}
	@Test
	public void m5() {
		Reporter.log("byby",true);
	}
	@Test
	public void m6() {
		Reporter.log("hello",true);
	}
}


