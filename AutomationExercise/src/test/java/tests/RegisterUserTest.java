package tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class RegisterUserTest extends BaseTest{
	
	@Test
	public void usertest() {
	HomePage home = new HomePage(driver);
    LoginPage login = new LoginPage(driver);
    SignupPage signup = new SignupPage(driver);
	
	home.clickSignUpSignInLogin();
	login.signUpEntry("Swapnil1","swapniltulaskar1@gmail.com");
	signup.fillAccDeatails();
	System.out.println();
	}
}
