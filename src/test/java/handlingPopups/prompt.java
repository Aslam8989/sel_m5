package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert switc = driver.switchTo().alert();
		System.out.println(switc.getText());
		switc.sendKeys("ROBOT");
		Thread.sleep(5000);
		switc.accept();

		System.out.println(driver.findElement(By.id("result")).getText());
		driver.close();
	}

}
