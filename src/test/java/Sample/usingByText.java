package Sample;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingByText {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String title1=driver.getTitle();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Nikhil");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("nikhil1234");
	driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	String title2=driver.getTitle();
	if(title1==title2) {
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
	}
	driver.quit();
	
	
	

	}

}
