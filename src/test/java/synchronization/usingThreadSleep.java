package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingThreadSleep {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//input[@type=\"text\"]")).click();
	
	
	driver.quit();
	
	}

}
