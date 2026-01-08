package tests;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class EmailPasswordMailIncorrectWarningTest extends BaseTest {
	
	
	@Test
	public void shouldShowWarningForemailPasswordIncorrect() {
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		
		home.clickSignUpSignInLogin();
		login.signInEntry("tulaskarswapnil1@gmail.com","12345");
		Assert.assertEquals(
				login.getEmailPasswordIncorrectWaring(),
			    "Your email or password is incorrect!"
			);
		Assert.assertTrue(
				login.isEmailPasswordIncorrectWaringDisplay(),
				"Your email or password is incorrect!");
		
	}
	

}
