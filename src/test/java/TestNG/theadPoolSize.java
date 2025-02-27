package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class theadPoolSize {

		
		@Test(threadPoolSize = 2,invocationCount = 3)
		public void demo () {
			
			
			Reporter.log("demo1234",true);
		}
		
}
