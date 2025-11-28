package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseDemo;
import pages.MainPage;

public class testHomePage extends BaseDemo {

    private MainPage mp;

    @BeforeClass
    public void setUp() {
        
        mp = new MainPage(driver);
        
    }

    @Test(priority = 0)
    public void homepageTest() {
        mp.clickLogo();
        String actualTitle= mp.getlogotext();
        
        assertEquals(actualTitle,"PRODUCT STORE","logo not matched");
    
       
    }
}
