package adactin_Hotel;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class locationdropdown extends signIn_hotel {
	
	@BeforeMethod
public void open() {
	login();
	}
	
	@Test
	void locationOption() throws Throwable {
		
		 WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select loc = new Select(location);
		List<WebElement> options = loc.getOptions();
		int count = 1;
		System.out.println("Available locations in dropdown:");
		for(WebElement option : options) {
			System.out.println(count +"."+option.getText());
			count++;
		}
		loc.selectByVisibleText("Paris");
		
	}
	
	@Override
	public void close() throws Throwable {
		// TODO Auto-generated method stub
		super.close();
	}
}
