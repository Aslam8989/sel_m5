package notification;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authendicationPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.quit();
	}

}
