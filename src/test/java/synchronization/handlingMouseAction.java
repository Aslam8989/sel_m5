package synchronization;

import java.awt.Scrollbar;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingMouseAction {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	//navigate to url
	driver.get("https://www.flipkart.com/");
	//identify search TF
	driver.findElement(By.name("q")).sendKeys("mobile"+Keys.ENTER);
	//scroll the webpage
	Actions act= new Actions(driver);
	act.scrollByAmount(50, 5000).perform();
	//driver.findElement("");
	driver.quit();
	}
}