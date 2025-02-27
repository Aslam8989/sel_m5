package Assertions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	@Test
	public void SoftAssert() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		@Nullable
		String title = driver.getTitle();
//		
//		//softAssert
		softAssert s=new softAssert();
		SoftAssert soft=new SoftAssert();
		//softAssert
//		soft.assertEquals(title, "Facebook – log in or sign up");
		
		//assertfalse
		boolean condition=driver.getTitle().contains("Facbook – log in or sign up");
		soft.assertFalse(condition);
		
		Object os=null;
		//null
	 soft.assertNotNull(os);
		
		System.out.println("Verification passed");
		driver.quit();
		//soft.assertAll();
	}

}
