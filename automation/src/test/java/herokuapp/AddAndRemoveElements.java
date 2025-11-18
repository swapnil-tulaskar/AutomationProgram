package herokuapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAndRemoveElements extends BaseClass{
	
	@Test
	public void test02() throws Throwable{
		By linkText02 = By.xpath("//a[normalize-space()='Add/Remove Elements']");
		
		By addElementbtn = By.xpath("//button[normalize-space()='Add Element']");
		
		By deletebtn = By.xpath("//button[@class=\"added-manually\"]");
		
		driver.findElement(linkText02).click();
		
		for (int i = 0; i < 10; i++) {
            driver.findElement(addElementbtn).click();
           
        }

        // Verify 5 delete buttons are present
        List<WebElement> deleteButtons = driver.findElements(deletebtn);
        Assert.assertEquals(deleteButtons.size(), 10, "Delete buttons count mismatch");

        // Optionally delete all added elements
        for (WebElement btn : deleteButtons) {
            btn.click();
        }
		
		
		
	}

}
