package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingContainsXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@type,'t')]")).sendKeys("NIKHIL");
		driver.findElement(By.xpath("//input[contains(@class,\"inputtext _55r1 inputtext _9\")]")).sendKeys("NIKHIL");
		driver.findElement(By.xpath("//button[contains(text(),'L')]")).click();
		driver.quit();
	
		
	}

}
