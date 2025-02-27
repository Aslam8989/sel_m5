package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion2 {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("sac-suggestion-row-2-cell-1")).click();
		//Thread.sleep(10000);
		//List<WebElement> sugg = driver.findElements(By.xpath("//div[contains( text(),'mobile')]"));
		//for(WebElement ele:sugg) {
		//System.out.println(ele.getText());
		//}
		driver.quit();
	}

}
