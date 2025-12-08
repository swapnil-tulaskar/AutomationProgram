package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseDemo;
import pages.MainPage;

public class HomePageTest extends BaseDemo {

    private MainPage mp;

    @BeforeClass
    public void setUp() {
        mp = new MainPage(driver);
    }

    @Test(priority = 1, description = "Validate the Home page title is correct")
    public void verifyHomePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "STORE", "Homepage title is incorrect");
    }
    
    @Test(priority = 2, description = "Validate the logo is visible on Home page")
    public void verifyLogoVisibility() {
        Assert.assertTrue(mp.isLogoVisible(), "Logo is not visible on homepage");
    }
}
