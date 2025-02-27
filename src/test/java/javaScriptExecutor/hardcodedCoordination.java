package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hardcodedCoordination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.ajio.com/");
		//scroll hardcoded co-ordinate
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,1700)");
		driver.manage().window().getPosition();
		WebElement ele = driver.findElement(By.xpath("//strong[text()='Help']"));
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		Thread.sleep(4000);
		driver.quit();
		
	}

}
