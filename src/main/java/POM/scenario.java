package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class scenario {

	@FindBy(xpath= "//button[text()=\"Quick Start\"]")
	private WebElement quick;
	
	@FindBy(id="name")
	private WebElement NAME;
	
	@FindBy(id= "email")
	private WebElement EMAIL;
	
	@FindBy(id = "password")
	private WebElement PWD;
	
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement Rtr_btn;
	
	//initialisation
	public scenario(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getQuick() {
		return quick;
	}

	public WebElement getNAME() {
		return NAME;
	}

	public WebElement getEMAIL() {
		return EMAIL;
	}

	public WebElement getPWD() {
		return PWD;
	}

	public WebElement getRtr_btn() {
		return Rtr_btn;
	}
	
	
}
