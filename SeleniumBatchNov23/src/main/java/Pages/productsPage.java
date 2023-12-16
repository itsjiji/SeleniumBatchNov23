package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends BasePage {
	
	// 3.  WebDriver
	public productsPage(WebDriver driver) {
		super(driver);
	}
	
	// 1. page Elements 
	@FindBy(id="item_4_title_link")
	WebElement backPack;
	
	@FindBy(id="item_0_title_link")
	WebElement bikeLight;
	// Inspect remaining 4 elements as a practice
	
	//2. page actions
	
	public void clickBackPack() {
		Click(backPack,3);
	}
	
	public void clickBikeLight() {
		Click(bikeLight,3);
	}
	

}
