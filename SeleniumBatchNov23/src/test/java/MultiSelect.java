import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		Select select = new Select(driver.findElement(By.id("cars")));
		select.selectByIndex(0);
		select.selectByVisibleText("Saab");
		select.selectByValue("audi");
		select.deselectByIndex(0);
		select.deselectAll();
		List<WebElement> items = select.getOptions();  // 4 items list
		driver.quit();
	}
}
