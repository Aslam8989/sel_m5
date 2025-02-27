package takeAScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShotOfWebPage {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.zomato.com/");
		//screenshots steps of webpage
		//1. typecaste takescreenshot with reference variable
		TakesScreenshot sh=(TakesScreenshot)driver;
		//2.Store in temp file and select the format
		File source = sh.getScreenshotAs(OutputType.FILE);
		//3. Create empty file
		File file=new File("./screenshot/photo.png");
		//4.Copy the screenshot in an empty file
		FileUtils.copyFile(source, file);
		
		//screenshot steps of webelement
		//1.Identify the element
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder=\"Search for restaurant, cuisine or a dish\"]"));
		//ele.click();
		//2.store in temp file and select the format
		File tem = ele.getScreenshotAs(OutputType.FILE);
		File f=new File("./screenshot/photo3.png");
		FileUtils.copyFile( tem,f);
		
		driver.quit();
	}

}
