package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AbTestPage;
import Pages.HomePage;


public class AbTest extends BaseTest{
	
	@Test
	
	public void ABtest() {
		
	HomePage hp = new HomePage(driver);
	AbTestPage ap = new AbTestPage(driver);
	hp.clickABTesting();
	assertTrue(ap.isHeadingDisplayed(),"heading not visible");

	
	
		
	
	}
	
	

}
