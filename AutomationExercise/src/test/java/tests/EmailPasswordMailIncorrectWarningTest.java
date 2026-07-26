package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

public class EmailPasswordMailIncorrectWarningTest extends BaseTest {
	
	
	@Test
	public void shouldShowWarningForemailPasswordIncorrect() {
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		
		home.clickSignUpSignInLogin();
		login.signInEntry(
				ConfigReader.getProperty("invalid_email"),
				ConfigReader.getProperty("invalid_password")
				);
		
		Assert.assertTrue(
				login.isIncorrectCredentialsWarningVisible(),
				"Email/password incorrect warning message is not displayed.");
		
		Assert.assertEquals(
				login.getIncorrectCredentialsWarningText(),
			    "Your email or password is incorrect!"
			);
		
	}
}
