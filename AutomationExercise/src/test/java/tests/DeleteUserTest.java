package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class DeleteUserTest extends BaseTest{

	
	@Test
	public void DeletUser() {
	HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);
	
	home.clickSignUpSignInLogin();
	login.signInEntry("swapniltulaskar1@gmail.com","12345");
	home.clickDeleteUser();
	}

}
