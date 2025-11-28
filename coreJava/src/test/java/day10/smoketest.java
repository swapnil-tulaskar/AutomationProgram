package day10;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class smoketest extends Base {
	@Test
	public void test01() {
		By A1 = By.xpath("//a[@id='nava']");
		
		//for 
		String logo1 = driver.findElement(A1).getText();
		assertEquals(logo1,"PRODUCT STORE","Logo doesn't match");
		System.out.println(logo1);
	}
}
