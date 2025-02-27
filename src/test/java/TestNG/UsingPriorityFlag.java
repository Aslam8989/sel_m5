package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingPriorityFlag {

	
		@Test(priority =1 )
	public void apple()
		{
			Reporter.log("Start the Execution",true);
		}
		@Test(priority =2 )
	public void ceshav()
		{
		Reporter.log("keshav",true);
		}
		@Test(priority =3 )
	public void bikhil() 
		{
		Reporter.log("jagan",true);
		}

}
