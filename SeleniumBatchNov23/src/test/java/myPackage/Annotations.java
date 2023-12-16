package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations extends BaseTest {

	@Parameters({"username", "password"})
	@Test
	public void test1(String username, String password ) {
		System.out.println(username + " "+ password); 	
	}
	@Test
	public void test2() {
		
	}
	
}
