package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation {

	@Test(invocationCount = 3)
	public void Apple() {
		Reporter.log("apple");
	}

	@Test(priority = 2)
	public void banana() {
		Reporter.log("banana");
	}

	@Test(priority = 1)
	public void carrot() {
		Reporter.log("carrot");
	}
}
