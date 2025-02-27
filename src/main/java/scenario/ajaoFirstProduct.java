package scenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ajaoFirstProduct {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.ajio.com/");
	WebElement ele = driver.findElement(By.xpath("//span[text()='KIDS']"));
	WebElement ele2=driver.findElement(By.xpath("(//a[text()='Outerwear'])[2]"));
	
	Actions act=new Actions(driver);
	act.moveToElement(ele);
	act.moveToElement(ele2);
	act.click(ele2).perform();
	
	WebElement scrlbar=driver.findElement(By.id("sortBy"));
	Select sel =new Select(scrlbar);
	sel.selectByValue("newn");
	WebElement var = driver.findElement(By.xpath("//div[text()='Girls Quilted PufferJacket']/ancestor::div[@class='contentHolder']"));
	System.out.println(var.getText());
	//WebElement whatsnew=driver.findElement(By.xpath("//option[@value=\"newn\"]"));
	//act.click(whatsnew).perform();
	
	Thread.sleep(5000);
	driver.quit();
	
	
	
}
}
