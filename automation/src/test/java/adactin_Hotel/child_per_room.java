package adactin_Hotel;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class child_per_room extends signIn_hotel {
	
	@BeforeMethod
	public void start() {
		login();
	}
	
	@Test
	public void childroom() {
		signIn_hotel ch = new signIn_hotel();
		
		By.xpath("//select[@id='child_room']");
		
		ch.selectOption(, null)
		
	}
	
	
	
@AfterMethod
public void close() throws Throwable {
	// TODO Auto-generated method stub
	super.close();
}

	
	
	
	
	
	

}
