package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groups {

	@Test(groups = "smoke")
	public void java() {
		Reporter.log("java");
	}
	@Test(groups = "funtional")
	public void python()
	{
		Reporter.log("python");
	}
	
	@Test(groups = "regression")
	public void selenium() {
		Reporter.log("selenium",true);
	}
	
}
