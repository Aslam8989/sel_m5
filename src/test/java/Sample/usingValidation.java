package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingValidation {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement searchTF = driver.findElement(By.id("small-searchterms"));
	if(searchTF.isDisplayed()) {
		searchTF.sendKeys("Mobile");
	}
	WebElement Search = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	if(Search.isEnabled()) {
		Search.click();
	}
	WebElement selected = driver.findElement(By.id("As"));
	selected.click();
	if(selected.isSelected()) {
		System.out.println("checkbox is selected");
	}
	else {
		System.out.println("checkbox is not selected");
	}
	driver.quit();
	}

}
