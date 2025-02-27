package base.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	//verify main test is started
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("on Test Start");
	}
	//verify in between the test
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success");
		}
	//verify in between the test
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
	}
	
	//verify in between the test
	@Override
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");
	}
	
	
	//verify before suit is started
	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start");
	}
	//verify after suit 
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("ON Finish");
	}
		
		
}
