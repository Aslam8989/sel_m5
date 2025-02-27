package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingMouseAction2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//navigate to url
		driver.get("https://www.flipkart.com/");	
	WebElement myntra = driver.findElement(By.xpath("//a[text()='Myntra']"));
		Actions act=new Actions(driver);
		act.scrollToElement(myntra).moveToElement(myntra).click().build().perform();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
