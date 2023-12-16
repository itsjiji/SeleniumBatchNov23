import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
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

}
