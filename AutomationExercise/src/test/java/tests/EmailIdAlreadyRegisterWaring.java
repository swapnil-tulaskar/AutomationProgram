package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class EmailIdAlreadyRegisterWaring extends BaseTest {
	
	
	
	@Test
	public void checkEmailIdAlreadyRegisterWaring() {
	HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);
	
	
	home.clickSignUpSignInLogin();
	login.signUpEntry("Swapnil1","swapniltulaskar1@gmail.com");
	
	Assert.assertEquals(
			login.getEmailAlreadyRegisterWarning(),
			"Email Address already exist!"
			);
	Assert.assertTrue(
			login.isEmailidAlreadyRegisterWaring(),
			"Email/password Already Register warning message is not displayed."
			);
	
	}
}
