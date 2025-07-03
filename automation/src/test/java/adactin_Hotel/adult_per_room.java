package adactin_Hotel;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class adult_per_room extends signIn_hotel{
	
	@BeforeMethod
	public void start() {
		login();
	}
	
	@Test
	public void adultroom() {
		signIn_hotel dropdown = new signIn_hotel();
		By adultroomDropdown = By.xpath("//select[@id='adult_room']");
		 dropdown.printAllOptions(adultroomDropdown);
		 dropdown.selectOption(adultroomDropdown, "3 - Three");
		
	}
	
	@AfterMethod
	public void close() throws Throwable {
		
		super.close();
	}

}
