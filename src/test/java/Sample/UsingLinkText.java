package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.turtlemint.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Ca"+ "")).click();
		driver.quit();
		
	}

}
