package Assertions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingHardAssert {

	
		@Test
		public void HardAssert() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.facebook.com/");
			
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		//Hard Assert
		//Assert.assertEquals(title, "Facebook – log in or sign up");
		//Assert.fail();
		
		//Assert true;
		//boolean conditon = driver.getTitle().contains("Facebook – log in or sign up");
		//Assert.assertTrue(conditon);
		
		System.out.println("Verification passed");
			driver.quit();
		}
	

}
