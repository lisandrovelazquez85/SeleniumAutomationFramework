package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin () {
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterUserName("tomsmith");
		loginPage.enterPassword("SuperSecretPassword!");
		loginPage.clickLogin();
		System.out.println("Titulo de la pagina es: " +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "The Internet");
		
	}

}
