package scenario;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class whatapp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung"+Keys.ENTER);
		driver.findElement(By.id("a-autoid-0-announce")).click();
		driver.findElement(By.id("s-result-sort-select_1")).click();
		
		
       List<WebElement> ele = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
       
          for(WebElement ele1 : ele) {
        	  String pr  =ele1.getText();
        	 
        	  int d = Integer.parseInt(pr);
        	  System.out.println(d);
        	/*if(d>100.0)  {
        	  System.out.println(ele1.getText());
        	  }*/
          }
          
		Thread.sleep(4000);
		driver.quit();
		
	}

	private static Object d(double d) {
		// TODO Auto-generated method stub
		return null;
	}

}
