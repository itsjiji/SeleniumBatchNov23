package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver driver;             // Precondition/Eligibility
	@BeforeClass
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();	
	}
	
	@AfterClass    // Post condition 
	public void after() {
		driver.quit();
	}

}
