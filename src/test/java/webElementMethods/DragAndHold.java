package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndHold {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
	WebElement A = driver.findElement(By.name("A"));
	Actions act=new Actions(driver);
	act.clickAndHold(A).perform();
	
	WebElement share = driver.findElement(By.id
			("sharing-button-Blog1-byline-2873846720740225467"));
	//act.scrollToElement(share);
	act.moveToElement(share).perform();
	act.release(A).perform();
	

	}

}
