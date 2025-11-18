package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import pages.loginPage;

public class LoginTest extends BaseClass {
	
	
	@DataProvider 

	@Test
	
	public void validUserPwdTest() {
		
		loginPage login = new loginPage(driver);
		login.enterUserName("problem_user");
		login.enterPassword("secret_sauce");
		login.submit();
		
		// for validation 
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		//Assert.assertEquals(actualTitle, expectedTitle, "title not matched");
			
	}
	
	
	
}
