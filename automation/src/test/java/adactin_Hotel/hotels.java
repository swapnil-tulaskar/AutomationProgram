package adactin_Hotel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hotels extends signIn_hotel{

	@BeforeMethod
	public void openlinks() {
	  login();
	}
	
	@Test
	
	public void hotel() throws Throwable{
//		locate the hotel name fields
	WebElement hotelsName = driver.findElement(By.xpath("//select[@id='hotels']"));
	
//	for selection hotels 
	Select h1 = new Select(hotelsName);
	
//	 list for view hotels name in dropdown
	List<WebElement>h2 = h1.getOptions();
	int count = 1;
	for (WebElement h3 : h2) {
		System.out.println(count +"."+h3.getText());
		count++;
	}
	
//	 select for hotel sunshine 
	h1.selectByVisibleText("Hotel Sunshine");
	System.out.println("Dropdown option 'Hotel Sunshine' has been selected.");
	
//	select for hotel Hotel Creek
	h1.selectByVisibleText("Hotel Creek");
	System.out.println("Dropdown option 'Hotel Creek' has been selected.");
	}
	
	@AfterMethod
	public void close() throws Throwable {
		super.close();
	}
	
}
	


