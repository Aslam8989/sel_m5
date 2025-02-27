package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchcontrol {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.zomato.com/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(5000);
		
		//switch the driver control to the frame
		driver.switchTo().frame("auth-login-ui");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("59718514");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		//
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Search for restaurant, cuisine or a dish\")]")).sendKeys("pizza");

	}

}
