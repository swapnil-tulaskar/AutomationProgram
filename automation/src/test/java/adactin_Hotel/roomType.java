package adactin_Hotel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class roomType extends signIn_hotel{
	
	@BeforeTest
	
	public void open() {
		login();
	}
	
	
	@Test
	public void room() {
	WebElement rooms =	driver.findElement(By.xpath("//select[@id='room_type']"));
		
		Select room = new Select(rooms);
		
		List<WebElement> r1 = room.getOptions();
		int count=1;
		System.out.println("==============================================");
		for (WebElement r2 :r1) {
			System.out.println(count + "."+r2.getText());
			count++;	
		}
		System.out.println("=============================================");
		room.selectByVisibleText("Double");
		System.out.println("Dropdown option 'Duble' has been selected.");
		room.selectByVisibleText("Deluxe");
		System.out.println("Dropdown option 'Deluxe' has been selected.");
		room.selectByVisibleText("Super Deluxe");
		System.out.println("Dropdown option 'Super Deluxe' has been selected.");
	}
	
	@AfterMethod
	public void close() throws Throwable {
		
		super.close();
	}

}
