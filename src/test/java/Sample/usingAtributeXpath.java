package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingAtributeXpath {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Mohammed%20Aslam%20Khan/OneDrive/Desktop/sample%20file.html");
	driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Nikhil");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("palan");
	driver.findElement(By.xpath("//button[@type='button'][1]")).click();
	driver.quit();

	}

}
