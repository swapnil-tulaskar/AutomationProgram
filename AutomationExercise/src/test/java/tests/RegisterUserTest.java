package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;
import utils.ConfigReader;

public class RegisterUserTest extends BaseTest {

    @Test
    public void shouldRegisterUserSuccessfully() {

        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        SignupPage signup = new SignupPage(driver);

        // Navigate to signup
        home.clickSignUpSignInLogin();

        // Enter signup credentials
        login.signUpEntry(
                ConfigReader.getProperty("reg_name"),
                ConfigReader.getProperty("reg_email")
        );

        // Fill account details
        signup
            .selectMaleGender()
            .enterPassword(ConfigReader.getProperty("reg_password"))
            .selectDOB(
                    ConfigReader.getProperty("reg_day"),
                    ConfigReader.getProperty("reg_month"),
                    ConfigReader.getProperty("reg_year")
            )
            .subscribeNewsletter()
            .subscribeOffers()
            .enterAddressDetails(
                    ConfigReader.getProperty("reg_fname"),
                    ConfigReader.getProperty("reg_lname"),
                    ConfigReader.getProperty("reg_comName"),
                    ConfigReader.getProperty("reg_address"),
                    ConfigReader.getProperty("reg_country"),
                    ConfigReader.getProperty("reg_stateName"),
                    ConfigReader.getProperty("reg_cityName"),
                    ConfigReader.getProperty("reg_zipCode"),
                    ConfigReader.getProperty("reg_mobile")
            )
            .clickCreateAccount();

        // Assertions
        Assert.assertTrue(
                signup.isAccountCreatedVisible(),
                "Account Created message is not visible"
        );

        Assert.assertEquals(
                signup.getAccountCreatedText(),
                "ACCOUNT CREATED!",
                "Account Created text mismatch"
        );
    }
}
