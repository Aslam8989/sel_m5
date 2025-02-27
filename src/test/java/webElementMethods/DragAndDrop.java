package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://testkru.com/Interactions/DragAndDrop");
		WebElement box1 = driver.findElement(By.id("box1"));
		WebElement dropZone1 = driver.findElement(By.id("dropZone1"));
		
		WebElement ele3 = driver.findElement(By.id("box3"));

		WebElement loc3 = driver.findElement(By.id("dropZone3"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(box1, dropZone1).perform();
		act.scrollToElement(loc3).perform();
		Thread.sleep(5000);
		
		act.dragAndDrop(ele3, loc3).perform();
		
		
	}

}
