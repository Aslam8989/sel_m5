package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomPage {

	
		//declaration
		@FindBy(id="email")
		private WebElement us;
		
		@FindBy(id="pass")
		private WebElement pwd;
		
		@FindBy(xpath="//button[@name=\"login\"]")
		private WebElement login_btn;
		
		@FindBy(xpath="//h2")
		private WebElement text;
		
	//initialization
		public LoginPomPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//utilization

		public WebElement getUs() {
			return us;
		}

		public void getPwd(String pass) {
			 pwd.sendKeys(pass);;
		}

		public void getLogin_btn() {
			 login_btn.click();
		}

		public WebElement getText() {
			return text;
		}
		
	
			


		
		
}
