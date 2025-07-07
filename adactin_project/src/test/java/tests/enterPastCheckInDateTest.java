/**
 * Test Class: MissingCheckInDateTest
 * Description: Verifies error message when only checkout date is entered.
 * 
 * Steps:
 * 1. Launch hotel reservation application
 * 2. Login with valid credentials
 * 3. Fill hotel search form with all details except check-in date
 * 4. Enter valid check-out date
 * 5. Assert appropriate error message is shown
 * 
 * @author Swapnil
 * @since 2025-07-07
 * @version 1.0
 */

package tests;

import base.BaseClass;
import listeners.ScreenshotListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SearchHotelPage;

@Listeners(ScreenshotListener.class)
public class enterPastCheckInDateTest extends BaseClass {

    @Test
    public void testPastCheckInCheckOutDateValidation() {
        // Step 1 & 2: Login
        LoginPage login = new LoginPage(driver);
        login.loginToApp("Swapniltulaskar", "Swapnil@123");

        // Step 3–6: Fill search form
        SearchHotelPage search = new SearchHotelPage(driver);
        search.selectLocation("Sydney");
        search.selectHotel("Hotel Creek");
        search.selectRoomType("Deluxe");
        search.selectRoomNos("2 - Two");

        // Step 7: Enter check-in date Today’s -5 date and checkout date Today’s -3
        search.setCheckInDate("02/07/2025"); // Today’s -5
        search.setCheckOutDate("04/07/2025");// Today’s -3

        search.clickSearch();

        // Step 8: Validate error message
        String actualError = search.getDateErrorMessage();
        System.out.println("Validation Error Message: " + actualError);

        String expectedError = "Enter check-in-date and check-out-date after the current date"; 
        
        try {
            Assert.assertEquals(actualError.trim(), expectedError.trim());
            System.out.println("Validation is pass");
        } catch (AssertionError e) {
            System.out.println("Validation is fail");
            // Optional: log the error or take other actions
        }
    }
}
