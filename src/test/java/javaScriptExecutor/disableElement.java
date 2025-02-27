package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disableElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapp.skillrary.com");
		WebElement dis_ele = driver.findElement(By.xpath("//input[@type='text'and @class='form-control']"));
		WebElement ele=driver.findElement(By.id("navbar-search-input"));
		//scroll hardcoded co-ordinate
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",dis_ele,"selenium");
		js.executeScript("arguments[0].value=arguments[1]",ele,"selenium");
		Thread.sleep(4000);
		driver.quit();
	}

}
