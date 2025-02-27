package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reference {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.ajio.com/");
	//WebElement ele = driver.findElement(By.partialLinkText("//a[@href=\"https://www.ajio.com/men-shirts/c/830216013\"]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//int x=ele.getLocation().getX();
	//int y=ele.getLocation().getY();
	js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
	driver.quit();
	
	}

}
