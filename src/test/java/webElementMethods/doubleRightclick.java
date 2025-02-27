package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleRightclick{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
	WebElement doub = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions act=new Actions(driver);
	act.contextClick(right).perform();
	driver.navigate().refresh();
	Thread.sleep(5000);
	act.doubleClick(doub).perform();
	Thread.sleep(10000);
	driver.quit();
	
	}

}
