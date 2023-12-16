package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReadData.readData;

public class loginPage extends BasePage{ 
	
	WebDriver driver;
	// 3.  Page Factory
	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	
	//1. Page elements 
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(name="login-button")
	WebElement loginBtn;
	
	//2. Page actions 
	
	public void enterUsername(String uname) throws IOException {
		// Make sure element is available or not, selenium wait: 1. Implicit wait(Page Load)
		      // 2. Explicit wait: this wait is for certain condition 
		enterText(username, uname, 3);
	}
	
	public void enterpassword(String passwd) throws IOException {
	enterText(pwd, passwd, 3);
	}
	
	public void clickLogin() {
		Click(loginBtn, 2);
	}

}
