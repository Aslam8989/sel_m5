package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelectors {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']")).sendKeys("Mobiles");
		driver.findElement(By.cssSelector("svg[width='24']")).click();
		driver.quit();

	}
}


