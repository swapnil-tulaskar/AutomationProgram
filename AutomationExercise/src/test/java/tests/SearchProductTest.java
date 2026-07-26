package tests;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import utils.ConfigReader;

public class SearchProductTest extends BaseTest{
	
	
	@Test
	
	public void verifySearchProductFucntionality() {
		HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        home.clickSignUpSignInLogin();

        login.signInEntry(
                ConfigReader.getProperty("reg_email"),
                ConfigReader.getProperty("reg_password")
        );

        productPage.clickOnProducts();
        
        Assert.assertTrue(productPage.isProductSearchBoxVisible(), "SearchBox not visible");
        
        
        
        productPage.enterSearchProduct("Blue Top");
        
        System.out.println(productPage.getProductCount());
        
        
        Assert.assertTrue(productPage.getProductCount()> 0, "Products list is empty");
        
        
        
        
	}

}
