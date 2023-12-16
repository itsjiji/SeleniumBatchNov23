import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleMultipleTabs {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.className("btn-info")).click();
		Set<String> windows = driver.getWindowHandles(); // 2 tabs are open
		String firstTab = (String)windows.toArray()[0];
		String secondTab = (String)windows.toArray()[1];
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		driver.switchTo().window(firstTab);
		driver.switchTo().window(secondTab);
		driver.quit();
	}

}
