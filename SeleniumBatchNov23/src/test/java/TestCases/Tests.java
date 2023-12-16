package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.cartPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.overviewPage;
import Pages.productDetailsPage;
import Pages.productsPage;
import ReadData.readData;

public class Tests extends BaseTest {   
	
	@Test       // this is one test case
	public void shopping() throws IOException {	   
	new loginPage(driver).enterUsername(new readData().getUsername());  //Classname obj = new Classname();
	new loginPage(driver).enterpassword(new readData().getPassword());
	new loginPage(driver).clickLogin();
	new productsPage(driver).clickBackPack();
	new productDetailsPage(driver).clickAddToCart();
	new productDetailsPage(driver).clickshoppingCart();
	new cartPage(driver).clickCheckOut();
	new infoPage(driver).enterDetails(new readData().getfirstName(), new readData().getlastName(), new readData().getzipCode());
	new overviewPage(driver).clickFinish();
	String heading = new completePage(driver).getHeading();
	Assert.assertEquals(heading, new readData().getHeading());
	Assert.assertEquals(true, true);
	}

}
