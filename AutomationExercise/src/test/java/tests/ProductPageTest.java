package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import utils.ConfigReader;

public class ProductPageTest extends BaseTest {

    @Test
    public void verifyProductsAreDisplayed() {

        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        home.clickSignUpSignInLogin();

        login.signInEntry(
                ConfigReader.getProperty("reg_email"),
                ConfigReader.getProperty("reg_password")
        );

        productPage.clickOnProducts();
        
        Assert.assertTrue(productPage.getProductCount()> 0, "Products list is empty");
        productPage.clickFirstViewProduct();
        Assert.assertTrue(productPage.isProductNameDisplayed());
        Assert.assertEquals(productPage.getProductNameDisplayed(),"Blue Top");
        Assert.assertTrue(productPage.isPriceDisplayed());
        Assert.assertTrue(productPage.isCategoryDisplayed());
       
        Assert.assertTrue(productPage.isAvailabilityDisplayed());
        Assert.assertTrue(productPage.isConditionDisplayed());
        Assert.assertTrue(productPage.isBrandDisplayed());
        
    }
    }
