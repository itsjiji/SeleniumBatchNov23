import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement single = driver.findElement(By.name("SingleFrame"));
		driver.switchTo().frame(single);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li//a[@href='#Multiple']")).click();
		WebElement parent = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		WebElement child = driver.findElement(By.xpath("//div[@class='iframe-container']//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(parent);
		driver.switchTo().frame(child);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
	}

}
