package webElementMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingAction {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement searchTF=driver.findElement(By.id("small-searchterms"));
		searchTF.sendKeys("mobile");
		searchTF.clear();
		searchTF.sendKeys("Books");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).submit();
		WebElement register = driver.findElement(By.linkText("Register"));
		driver.findElement(By.linkText("Register"));
		System.out.println(searchTF.getText());
		driver.quit();
		
	}

}
