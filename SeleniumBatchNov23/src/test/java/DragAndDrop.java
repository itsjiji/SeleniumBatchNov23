import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		Actions act = new Actions(driver);
		WebElement start = driver.findElement(By.id("node"));
		WebElement drop = driver.findElement(By.id("droparea"));
		act.dragAndDrop(start, drop).perform();
		act.contextClick(start).perform();  // Right click
		act.doubleClick(drop).perform();// Double click
		driver.quit();
		// Practice https://demoqa.com/droppable
		
	}

}
