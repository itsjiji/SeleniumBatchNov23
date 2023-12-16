package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReadData.readData;

public class infoPage extends BasePage {
	
	// 3.  WebDriver
	public infoPage(WebDriver driver) {
super(driver);
	}
	
	@FindBy(name="firstName")
	WebElement fName;
	
	@FindBy(name="lastName")
	WebElement lName;
	
	@FindBy(name="postalCode")
	WebElement zipCode;
	
	@FindBy(name="continue")
	WebElement cont;
	
	public void enterDetails(String fname, String lname, String zipcode) throws IOException {
		enterText(fName, fname, 3);
		enterText(lName, lname, 3);
		enterText(zipCode, zipcode, 3);
		Click(cont, 2);
	}
	


}
