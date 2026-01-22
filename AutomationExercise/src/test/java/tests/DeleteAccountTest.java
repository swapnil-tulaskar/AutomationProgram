package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.DeleteAccountPage;
import pages.HomePage;
import pages.LoginPage;

public class DeleteAccountTest extends BaseTest{
	
	@Test
	public void DeletUser() {
	HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);
	DeleteAccountPage DeleteUser = new DeleteAccountPage(driver);
	
	home.clickSignUpSignInLogin();
	login.signInEntry("swapniltulaskar1@gmail.com","12345");
	
	Assert.assertTrue(home.isUserLoggedIn(),"User not LogIn");
	 Assert.assertTrue(
		        home.getLoggedInAsText().contains("Swapnil1"),
		        "Incorrect user logged in"
		    );
	
	
	
	home.clickDeleteUser();
	
	Assert.assertTrue(DeleteUser.isDeleteAccountTitleDisplay(),
			"Delete User Title Not display"
			);
	
	Assert.assertEquals(DeleteUser.getDeleteAccountTitleMessage(),
			"ACCOUNT DELETED!");
	}
	
	

}
