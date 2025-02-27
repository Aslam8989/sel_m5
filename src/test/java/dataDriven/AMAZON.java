package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AMAZON {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//CONVERT PHYSICAL FILE INTO JAVA OBJECT
		FileInputStream fl=new FileInputStream("./src/test/resources/commom.properties");
		
		//CREATE EMPTY PROPERTY OBJECT
		Properties p=new Properties();
		
		//LOAD THE FILE
		p.load(fl);
		
		//FETCH THE FILE
		String URL = p.getProperty("URL");
		String NAME = p.getProperty("NAME");
		String NO = p.getProperty("NUMBER");
		String PWD = p.getProperty("PWD");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		
		

//		Actions act= new Actions(driver);
//		//act.moveToElement(sign).perform();
//		act.click(sign).perform();
//		act.click(sign2).perform();
//		act.click(butn).perform();
//		
		
		driver.findElement(By.id("ap_customer_name")).sendKeys(NAME);
		driver.findElement(By.id("phoneNumber")).sendKeys(NO);
		driver.findElement(By.id("ap_password")).sendKeys(PWD);
		 
		Thread.sleep(3000);
		
		
		
		
		
		
	}

}
