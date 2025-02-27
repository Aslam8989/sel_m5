package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shadi.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement e:links) {
			System.out.println(e.getText());
		}
			driver.quit();
		
	}

}
