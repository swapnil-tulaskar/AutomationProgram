package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.hamcrest.core.IsEqual;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import listeners.ScreenshotListener;
import pages.LoginPage;
import pages.SearchHotelPage;

@Listeners(ScreenshotListener.class)
public class ValidateSelectHotel extends BaseClass{
	
	@Test 
	void checkSelectLocationIsDisplayed() {
		LoginPage login = new LoginPage(driver);
		login.loginToApp("Swapniltulaskar", "Swapnil@123");
		
		 SearchHotelPage search = new SearchHotelPage(driver);
		 	search.selectLocation("Sydney");
		 	search.selectHotel("Hotel Creek");
		 	search.selectRoomType("Deluxe");
		 	search.selectRoomNos("2 - Two");
		 	search.setCheckInDate("07/07/2025"); 
		 	search.setCheckOutDate("09/07/2025");
		 	
	        search.clickSearch();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        // Step 8: Validate error message
	        String actualCity = search.getCityErrorMessage();
	        System.out.println("Validation Error Message: " + actualCity);
	        String expectedCity = "Sydney";
	        try {
	        	Assert.assertEquals(actualCity, expectedCity);
	        	System.out.println(" ==> locations is displayed according to the location Selected<==");
			} catch (Exception e) {
				System.out.println("Validation is fail");
			}
	        
	        
	}
	

}
