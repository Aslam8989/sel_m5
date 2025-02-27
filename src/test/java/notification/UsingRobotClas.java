package notification;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingRobotClas {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//copy the path
		StringSelection sc=new StringSelection("C:\\Users\\Mohammed Aslam Khan\\OneDrive\\Desktop\\Aslam QA.docx");
					
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement ele = driver.findElement(By.id("file-upload"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).click(ele).build().perform();
		
		//store to click borad
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
		
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	
	
	}

}
