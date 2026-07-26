package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.*;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

public class EmailAlreadyRegisteredWarningTest extends BaseTest{
	
	
	@Test
	public void checkEmailIdAlreadyRegisterWarning() {
	HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);
	
	
	home.clickSignUpSignInLogin();
	login.signUpEntry(ConfigReader.getProperty("reg_name"),ConfigReader.getProperty("reg_email"));
	
	Assert.assertTrue(login.isAlreadyRegisteredWarningVisible(),
			"Email Address already exist! not Displayed"
			);
	
	Assert.assertEquals(
			login.getAlreadyRegisteredWarningText(),
			"Email Address already exist!"
			);
	
	
	}
}
