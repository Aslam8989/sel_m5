package CrossBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class whatapp {
	@Test
	@Parameters("BROWSER")
	public void lauchwhp(String browser) {
		WebDriver driver=null;
		if(browser.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browser.equals("edge")) {
		driver=new EdgeDriver();
	}
	else {
		driver=new ChromeDriver();
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://web.whatsapp.com/");
	//river.quit();
}
	}
