package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExtentReportManager;
import utils.Log;

public class LoginTest extends BaseTest {

	@Test
	public void testValidLogin() {

		Log.info("Starting Login Test..");
		test = ExtentReportManager.createTest("Login Test");

		test.info("Navigatin to URL");
		LoginPage loginPage = new LoginPage(driver);

		Log.info("Adding credentials..");
		test.info("Adding credetnatial");
		loginPage.enterUserName("tomsmith");
		loginPage.enterPassword("SuperSecretPassword!");
		test.info("CLicking on login button");
		loginPage.clickLogin();

		Log.info("Verifying page tittle...");
		System.out.println("Titulo de la pagina es: " + driver.getTitle());
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "The Internet");
		test.pass("Login successfull");

	}

	@Test
	public void testLoginWhitInvalidCredentials() {

		Log.info("Starting Login Test..");
		test = ExtentReportManager.createTest("Login Test with invalid credentials");

		test.info("Navigatin to URL");
		LoginPage loginPage = new LoginPage(driver);

		Log.info("Adding credentials..");
		test.info("Adding credetnatial");
		loginPage.enterUserName("tomsmith");
		loginPage.enterPassword("SuperSecretPassword");
		test.info("CLicking on login button");
		loginPage.clickLogin();

		Log.info("Verifying page tittle...");
		System.out.println("Titulo de la pagina es: " + driver.getTitle());
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "The Internet is click");
		test.pass("Login successfull");

	}

}
