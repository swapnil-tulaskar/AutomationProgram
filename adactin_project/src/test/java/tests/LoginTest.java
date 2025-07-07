/**
 * Test Class: LoginTest
 * Description: To verify valid login
 * 
 * Steps:
 * 1.Launch hotel reservation application using URL as in test data. 
 * 2.Login to the application using username and password as in test data."

 * @author Swapnil Tulaskar
 * @version Build 1.0
 * @since 2025-07-07
 */
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
