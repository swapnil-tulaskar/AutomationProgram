package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class EmailAlreadyRegisteredWarningTest extends BaseTest {
	
	
	@Test
	public void checkEmailIdAlreadyRegisterWarning() {
	HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);
	
	
	home.clickSignUpSignInLogin();
	login.signUpEntry("Swapnil1","swapniltulaskar1@gmail.com");
	
	Assert.assertTrue(login.isEmailidAlreadyRegisterWarning(),
			"Email Address already exist! not Displayed"
			);
	
	Assert.assertEquals(
			login.getEmailAlreadyRegisterWarning(),
			"Email Address already exist!"
			);
	
	
	}
}
