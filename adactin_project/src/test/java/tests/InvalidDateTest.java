/**
 * Test Class: InvalidDateTest
 * Description: Verifies that the application displays an error when the check-in date is after the check-out date.
 * 
 * Steps:
 * 1. Launch hotel reservation application using URL as in test data.
 * 2. Login to the application using username and password as in test data.
 * 3. Select location as in test data.
 * 4. Select hotel as in test data.
 * 5. Select room type as in test data.
 * 6. Select no-of-rooms as in test data.
 * 7. Enter check-in-date later than the 
 * check-out-date field as in test data.
 * Verify that system gives an error saying ‘check-in-date should not be later than check-out-date"
 * @author Swapnil Tulaskar
 * @version 1.0
 * @since 2025-07-07
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
public class InvalidDateTest extends BaseClass {

    @Test
    public void testInvalidDateValidation() {
        // Step 1 & 2: Login
        LoginPage login = new LoginPage(driver);
        login.loginToApp("Swapniltulaskar", "Swapnil@123");

        // Step 3–7: Fill form with invalid dates
        SearchHotelPage search = new SearchHotelPage(driver);
        search.selectLocation("London");
        search.selectHotel("Hotel Sunshine");
        search.selectRoomType("Standard");
        search.selectRoomNos("1 - One");

        search.setCheckInDate("14/07/2025");    //today + 7 date as per require
        search.setCheckOutDate("12/07/2025");   // today+5 date as per require 

        search.clickSearch();

        // Step 8: Validate error message
        System.out.println("===============================================================================");
        String actualError = search.getDateErrorMessage();
        System.out.println("1) Actual Error Message: " + actualError);
        String expectedError = " check-in-date should not be later than check-out-date ";
        System.out.println("2) Expected Error Message: " + expectedError);
        System.out.println("===============================================================================");
        
        if (actualError.trim().equals(expectedError.trim())) {
            System.out.println("===> Expected result is Fail (Validation caught correctly shown the same) <===");
        } else {
            System.out.println("===> Expected result is Pass (Validation NOT shown same as expected ) <===");
        }  
        System.out.println("===============================================================================");  
        
            Assert.assertEquals(actualError.trim(), expectedError.trim());
    }
}
