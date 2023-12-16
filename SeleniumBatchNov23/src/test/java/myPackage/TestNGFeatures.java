package myPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test(invocationCount=3, timeOut=10000)       // Annotation
	public void method1() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();
		driver.quit();	
	}
	
	@Test(description = "this is method2")
	public void method2() {
		System.out.println("Method2");
	}
	@Test(groups= {"Flavours"})
	public void Dessert() {
		
	}
	@Test(groups= {"Flavours"})
	public void Salad() {
		
	}
	@Test(groups= {"softDrinks"})
	public void beverages() {
		
	}
	@Test(groups= {"chinese"})
	public void fastfood() {
		
	}

}
