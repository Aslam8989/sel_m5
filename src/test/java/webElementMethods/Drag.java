package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("\"https://testkru.com/Interactions/DragAndDrop");
	WebElement box1 = driver.findElement(By.id("box1"));
	WebElement box2 = driver.findElement(By.id("box2"));
	WebElement dropZone1 = driver.findElement(By.id("dropZone1"));
	WebElement dropZone2 = driver.findElement(By.id("dropZone2"));
	Actions act=new Actions(driver);
	if (dropZone2.isEnabled()) {
		act.dragAndDrop(box2, dropZone2).perform();
	}
}
}
