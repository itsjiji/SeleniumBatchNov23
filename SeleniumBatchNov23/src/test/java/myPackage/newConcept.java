package myPackage;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class newConcept {

	//Testing framework to remove the dependency of using main method
	
	//Test Next generation: TestNG
	@Test(priority=2)
	public void dropDown() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement skls = driver.findElement(By.id("Skills"));
		Select skills = new Select(skls);
		skills.selectByValue("Android");
		skills.selectByVisibleText("Adobe Photoshop");
		skills.selectByIndex(6);
		driver.quit();
	}
	@Test(priority=1)     //annotation
	public void HandleAlerts() {
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
