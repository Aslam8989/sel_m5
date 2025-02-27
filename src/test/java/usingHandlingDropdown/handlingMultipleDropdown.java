package usingHandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingMultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement multiSdd = driver.findElement(By.id("cars"));
		Select s=new Select(multiSdd);
		s.selectByIndex(1);
		s.selectByValue("199");
		Thread.sleep(10000);
		s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		Thread.sleep(10000);
	
	}

}
