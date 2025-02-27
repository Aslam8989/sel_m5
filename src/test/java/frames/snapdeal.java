package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.
openqa.selenium.interactions.Actions;

public class snapdeal {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(50));
		driver.get("https://www.snapdeal.com/");
	WebElement login = driver.findElement(By.xpath("//span[text()='Sign In']"));
	
		Actions act=new Actions(driver);
	//	Thread.sleep(2000);
		act.moveToElement(login).perform();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
		//Thread.sleep(1000);
		WebElement iframe = driver.findElement(By.id("loginIframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number/ Email\"]")).sendKeys("49582");
		driver.findElement(By.xpath("//i[@class=\"sd-icon sd-icon-delete-sign fnt-22\"]")).click();
	//	Thread.sleep(1000);
		driver.switchTo().defaultContent();
	//	Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"col-xs-20 searchformInput keyword\"]")).sendKeys("car"+Keys.ENTER);
		Thread.sleep(4000);
		driver.quit();
		
	}
}
