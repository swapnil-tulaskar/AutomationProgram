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

        search.setCheckInDate("10/07/2025");    // ❌ later
        search.setCheckOutDate("08/07/2025");   // ✅ earlier

        search.clickSearch();

        // Step 8: Validate error message
        String actualError = search.getDateErrorMessage();
        System.out.println("❌ Validation Error Message: " + actualError);
        String expectedError = "check-in-date should not be later than check-out-date";

        Assert.assertEquals(actualError, expectedError, "Date validation message is incorrect");
    }
}
