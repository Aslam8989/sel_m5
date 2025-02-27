package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchtitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.facebook.com/");
	//	WebElement login = driver.findElement(By.name("login"));
		//scroll javascriptexecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println("Title : "+js.executeScript("return document.title"));
		System.out.println("URL : "+js.executeScript("return document.URL"));
		driver.quit();
	}

}
