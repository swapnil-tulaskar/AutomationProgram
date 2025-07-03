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
		
	By chilroom1 =	By.xpath("//select[@id='child_room']");
		
	ch.printAllOptions(chilroom1);
	ch.selectOption(chilroom1, "3 - Three");
	System.out.println("dropdown child room 3- three is selected");
		
		
	}
	
	
	
@AfterMethod
public void close() throws Throwable {
	// TODO Auto-generated method stub
	super.close();
}

	
	
	
	
	
	

}
