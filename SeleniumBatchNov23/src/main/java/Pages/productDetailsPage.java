package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage extends BasePage{

	// 3.  WebDriver
	public productDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	WebElement addToCart;
	
	@FindBy(className = "inventory_details_price")
	WebElement price;
	
	@FindBy(name="remove-sauce-labs-backpack")
	WebElement remove;
	
	@FindBy(className="shopping_cart_link")
	WebElement shoppingCart;
	
	public void clickAddToCart() {
		Click(addToCart, 3);
	}
	
	public void clickRemove() {
		Click(remove,3);
	}
	
	public String readPrice() {
		return getText(price,3);  // 29.99$
	}
	
	public void clickshoppingCart() {
		Click(shoppingCart,3);
	}

}
