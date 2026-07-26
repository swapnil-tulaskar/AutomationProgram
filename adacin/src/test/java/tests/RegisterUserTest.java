package tests;

import org.testng.annotations.Test;

import Page.LoginPage;
import Page.UserRegistrarionPage;
import base.BaseTest;
import utils.ConfigReader;

public class RegisterUserTest extends BaseTest{
	
	@Test
	
	public void RegisterNewUser() throws Exception {
		LoginPage login = new LoginPage(driver);
		UserRegistrarionPage urp = new UserRegistrarionPage(driver);
		
		login.clickRegister();
		urp.enterUserDetails(	ConfigReader.getProperty("reg_name"),
								ConfigReader.getProperty("reg_password"),
								ConfigReader.getProperty("reg_name"), 
								ConfigReader.getProperty("reg_email")
							);
		
		System.out.println(urp.readCaptcha());
	
	}

}
