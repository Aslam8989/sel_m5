package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class usingDinamic {
	public static void main (String[] args) throws InterruptedException {
		
		      //Launch the browser
				WebDriver driver= new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Navigate to an URL
				driver.get("https://www.flipkart.com/");
			
				//Identify search  text field and pass the text
				driver.findElement(By.name("q")).sendKeys("mobile"+Keys.ENTER);
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy F05 (Twilight')]")).click();
		        // Find the rating element (replace with your actual locator)
		        WebElement ratingElement = driver.findElement(By.xpath("(//div[contains(text(),'4.2')])[2]")); 

		        // Extract the rating text 
		        String ratingText = ratingElement.getText();

		       
				// Print the rating to the console
		        System.out.println("Product Rating: " + ratingText);

		        // Close the browser
		        driver.quit();
		    }
		}
