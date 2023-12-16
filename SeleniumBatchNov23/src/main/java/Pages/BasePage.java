package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void wait(WebElement e, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(e));	
	}

	public void Click(WebElement e, int time) {
		wait(e, time);
		e.click();
	}
	
	public void enterText(WebElement e,String text, int time) {
		wait(e, time);
		e.sendKeys(text);
	}
	
	public String getText(WebElement e, int time) {
		wait(e, time);
		return e.getText();
	}
	public void selectByIndex(WebElement e, int index) {
		wait(e, 3);
		Select select = new Select(e);
		select.selectByIndex(index);
	}
}
