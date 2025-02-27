package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataDrivenForFacebook {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fl=new FileInputStream("./src/test/resources/commonData.properties"); 
		Properties p=new Properties();
		p.load(fl);
		String Url = p.getProperty("URL");
		String UN = p.getProperty("UN");
		String Pwd = p.getProperty("Pwd");
		String timee = p.getProperty("Implicitwait");
		
		long time=Long.parseLong(timee);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.get(Url);
		
		driver.findElement(By.id("email")).sendKeys(UN);
		driver.findElement(By.id("pass")).sendKeys(Pwd);
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
