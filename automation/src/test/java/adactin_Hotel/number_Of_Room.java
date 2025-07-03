package adactin_Hotel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class number_Of_Room extends signIn_hotel{
	
	@BeforeMethod
	public void open(){
		login();
	}
	
	@Test(priority = 1)
	public void roomNum() {
		WebElement rnumb = driver.findElement(By.xpath("//select[@id='room_nos']"));
		
		Select roomnumb = new Select(rnumb);
		List<WebElement>r1 = roomnumb.getOptions();
		
		for(WebElement r2 : r1) {
			
			System.out.println(r2.getText());
		}
		
	roomnumb.selectByVisibleText("9 - Nine");
	System.out.println("Dropdown option '9 - Nine' has been selected.");
		
	}
	
	@AfterMethod
	public void close() throws Throwable {
		super.close();
	}

}
