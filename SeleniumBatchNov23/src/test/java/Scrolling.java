import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in");  // 60secs, error 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement careers = driver.findElement(By.xpath("//a[text()='Careers']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", careers);  //Scrolling
	js.executeScript("arguments[0].click();", careers); //clicking
	// send keys/Enter some text
	driver.navigate().back();
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	js.executeScript("arguments[0].setAttribute('value', 'Nike Shoes')", search);
	driver.quit(); 
	// Practice: https://demo.automationtesting.in/Register.html
	}
}
