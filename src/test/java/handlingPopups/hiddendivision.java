package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivision {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("hyder");
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		driver.quit();
		//driver.findElement(By.id(null)

	}

}
