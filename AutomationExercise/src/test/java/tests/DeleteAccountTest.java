package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.*;
import pages.DeleteAccountPage;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

public class DeleteAccountTest extends BaseTest{
	
	@Test
	public void DeletUser() {
	HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);
	DeleteAccountPage DeleteUser = new DeleteAccountPage(driver);
	
	home.clickSignUpSignInLogin();
	login.signInEntry(ConfigReader.getProperty("reg_email"),ConfigReader.getProperty("reg_password"));
	
	Assert.assertTrue(home.isUserLoggedIn(),"User not LogIn");
	 Assert.assertTrue(
		        home.getLoggedInAsText().contains(ConfigReader.getProperty("reg_name")),
		        "Incorrect user logged in"
		    );
	
	
	
	home.clickDeleteUser();
	
	Assert.assertTrue(DeleteUser.isDeleteAccountTitleDisplay(),
			"Delete User Title Not display"
			);
	
	Assert.assertEquals(DeleteUser.getDeleteAccountTitleMessage(),
			"ACCOUNT DELETED!");
	
	Assert.assertTrue(DeleteUser.isContinueBtnDisplay(),
			"Continue Btn Not Displayed");
	
	DeleteUser.clickOnContiue();
	}
	
	
	

}
