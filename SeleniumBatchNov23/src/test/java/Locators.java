import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("ABCDEFGHI");
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		WebElement username= driver.findElement(By.xpath("//input[contains(@id,'user')]"));
		username.click();
		username.sendKeys("asdadsas");
		List<WebElement> list= driver.findElements(By.cssSelector("input.form_input"));
		System.out.println(list.size());
		Thread.sleep(4000);
		driver.quit();
	}

}
