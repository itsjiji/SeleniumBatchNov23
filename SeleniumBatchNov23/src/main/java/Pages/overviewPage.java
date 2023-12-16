package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class overviewPage extends BasePage {
	
	// 3.  WebDriver
	public overviewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name= "finish")
	WebElement finish;
	
	public void clickFinish() {
		Click(finish, 2);
	}
	

}
