package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingRelativeXpath {

	public static void main(String[] args) {
		

				WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/Mohammed%20Aslam%20Khan/OneDrive/Desktop/sample%20file.html");
				driver.findElement(By.xpath("//input")).sendKeys("Selenium");
				driver.findElement(By.xpath("//input[2]")).sendKeys("password");
				driver.findElement(By.xpath("//button")).click();
				driver.quit();
			}
		

	}


