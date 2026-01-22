package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LogOutUserTest extends BaseTest{
	
	@Test
	public void LogOutUser() {
		
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		
		home.clickSignUpSignInLogin();
		login.signInEntry("swapniltulaskar1@gmail.com","12345");
		home.clickLogOutUser();
	}

}
