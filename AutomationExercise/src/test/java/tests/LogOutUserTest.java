package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

public class LogOutUserTest extends BaseTest {

    @Test
    public void shouldLogoutUserSuccessfully() {

        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);

        // Login
        home.clickSignUpSignInLogin();
        login.signInEntry(
                ConfigReader.getProperty("reg_email"),
                ConfigReader.getProperty("reg_password")
        );

        // Logout
        home.clickLogOutUser();

        // Verification
        Assert.assertTrue(
                login.isLoginFormVisible(),
                "Login form is not visible after logout"
        );
    }
}
