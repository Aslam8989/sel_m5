package notification;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		Thread.sleep(3000);
		//fetch the parent window id
		String pwid = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[text()='MOTOROLA g05 (Plum Red, 64 GB)']")).click();
		//fetching all the window ids
		Set<String> cpid = driver.getWindowHandles();
		
		//iterating the ids 
		for(Sting s:cpid) {
			driver.switchTo().window(cpid);
			
			
		}
		//String cpid = driver.getWindowHandle();
//		driver.switchTo().window(cpid);
//		driver.findElement(By.xpath("class=\"QqFHMw vslbG+ In9uk2\"")).click();
//		
//		Thread.sleep(5000);
		
		
		driver.quit();
	}

}
