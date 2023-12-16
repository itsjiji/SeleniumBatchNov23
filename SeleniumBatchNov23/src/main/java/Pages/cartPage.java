package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage extends BasePage {

	public cartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="remove-sauce-labs-backpack")
	WebElement remove;
	
	@FindBy(id="checkout")
	WebElement checkout;
	
	public void clickRemove() {
		Click(remove, 3);
	}
	
	public void clickCheckOut() {
	Click(checkout,3);
	}

}
