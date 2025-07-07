package tests;

import base.BaseClass;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void testValidLogin() {
        LoginPage login = new LoginPage(driver);
        login.loginToApp("Swapniltulaskar", "Swapnil@123");

        // Validate by page title (you can also use welcome text if available)
        String expectedTitle = "Adactin.com - Search Hotel"; // After successful login
        String actualTitle = login.getLoggedInTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Login failed or incorrect page title");
    }
}
