import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html"); // 60 seconds
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));   // Universal wait
		driver.findElement(By.id("OKTab")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.id("CancelTab")).click();
		Alert al = driver.switchTo().alert();
		al.dismiss();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.id("Textbox")).click();
		Alert input = driver.switchTo().alert();
		input.sendKeys("Automation");
		input.accept();
		driver.quit();
		// Practice? //https://demoqa.com/alerts
	}

}
