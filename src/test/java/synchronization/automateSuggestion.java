package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("sele");
		Thread.sleep(10000);
		WebElement sugg = driver.findElement(By.xpath("(//span[contains(text(),'sele')])[4]"));
		sugg.click();
		Thread.sleep(30000);
		
	//	for(WebElement ele:sugg) {
		//	WebElement selenium;
		//	}
		//System.out.println(ele.getText());	
	//	}
		driver.quit();
		
	}

}
