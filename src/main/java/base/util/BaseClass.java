package base.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class BaseClass {
	
	WebDriver driver=null;
	@BeforeSuite
	public void BS() {
		System.out.println("Connect to DATA BASE");
	}
	@AfterSuite
	public void AS() {
		System.out.println("DISCONNECT TO DATA BASE");
	}
	@BeforeTest
	public void BT() {
		System.out.println("OPEN PARALELL EXECUTION");
		
	}
	@AfterTest
	public void AT() {
		System.out.println("CLOSE PARALELL EXECUTION");
	}
	@BeforeClass
	@Parameters()
	public void BC(String browser) {
		System.out.println("OPEN BROWER ");
	}
	@AfterClass
	public void AC() {
		System.out.println("CLOSE BROWSER");
		driver.quit();
	}
	@BeforeMethod
	public void BM() {
		System.out.println("LOGIN");
		
	}
	@AfterMethod
	public void AM() {
		System.out.println("LOG OUT");
	}
	
}
