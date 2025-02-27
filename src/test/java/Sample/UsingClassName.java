package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.className("_1kbt")).sendKeys("Nikhil");
		driver.findElement(By.className("_9npi")).sendKeys("Pathan");
		driver.findElement(By.className("_51sy")).click();
		driver.quit();
	}
}
