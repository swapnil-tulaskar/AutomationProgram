package herokuapp;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_B_test_control extends BaseClass {
	
	
	By AB = By.xpath("//a[normalize-space()='A/B Testing']");
	
	By Headinglocator = By.tagName("h3");
	
	@Test
	public void Test01() {
		driver.findElement(AB).click();
		
		
		// using main heading comparison 
		By headingLocator = By.tagName("h3"); 
	    String headingText = driver.findElement(headingLocator).getText();
	    Assert.assertTrue(headingText.equals("A/B Test Variation 1")|| headingText.equals("A/B Test Control"),"Main heading mismatched");
		// for the multiple heading text we use both of heading contents 
		
		// using title match
		String actualTitle = driver.getTitle();
		String expectedTitle = "The Internet";
		assertEquals(actualTitle, expectedTitle, "title not matched ");
		
	}
	 

	
	
	
	

}
