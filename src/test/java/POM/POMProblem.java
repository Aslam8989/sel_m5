package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMProblem {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fl=new FileInputStream("./src/test/resources/commonData.properties");
		Properties p=new Properties();
		p.load(fl);
		
		String url = p.getProperty("URL");
		String un = p.getProperty("UN");
		String pwd = p.getProperty("Pwd");
		
				
	}

}
