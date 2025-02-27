package notification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handling {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications ");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		
		 driver.findElement(By.id("browNotButton")).click();
		
	}

}
