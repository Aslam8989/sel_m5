package usingHandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class usingSelectMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	Thread.sleep(10000);
	WebElement select = driver.findElement(By.id("searchDropdownBox"));
	Thread.sleep(10000);
	Select s=new Select(select);
	s.selectByIndex(5);
	Thread.sleep(10000);
	System.out.println(s.isMultiple());
	List<WebElement> list = s.getOptions();
	for(WebElement ele:list) {
	System.out.println("Options : "+ ele.getText());	
	}
	System.out.println("Selected option : "s.getFirstSelectedOption());
	for(
			ele.list)
	driver.quit();
	
	}
}
