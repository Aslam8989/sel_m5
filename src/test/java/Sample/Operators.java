package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operators {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login.php/");
	WebElement user=driver.findElement(By.id("email"));
	user.sendKeys("Nikhil");
	WebElement pswd=driver.findElement(By.id("pass"));
	pswd.sendKeys("palan");
	WebElement login=driver.findElement(By.id("loginbutton"));
	login.click();
	Thread.sleep(9000);
	driver.quit();
	
	}
	
}
