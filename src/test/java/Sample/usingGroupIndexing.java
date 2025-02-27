package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingGroupIndexing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("java"+Keys.ENTER);
		Thread.sleep(8000);
		driver.quit();
	}
	

}
