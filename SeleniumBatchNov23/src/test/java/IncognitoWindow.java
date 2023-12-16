import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class IncognitoWindow {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--inPrivate");
		WebDriver driver = new EdgeDriver(options);
		driver.get("http://www.kiwi.com");
		driver.quit();
		// Practice: Use Chrome and Firefox
	}

}
