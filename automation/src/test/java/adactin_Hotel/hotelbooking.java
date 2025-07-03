package adactin_Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hotelbooking extends signIn_hotel {
	
	@BeforeMethod
	
	public void start() {
		login();
	}
	
	@Test
	
	public void booking() throws Throwable{
		
		
		By location = By.xpath("//select[@id='location']");
		By hotels = By.xpath("//select[@id='hotels']");
		By roomtype = By.xpath("//select[@id='room_type']");
		By noOfRoom= By.xpath("//select[@id='room_nos']");
	
		driver.findElement( By.xpath("//input[@id='datepick_out']"));
		By adultperRoom = By.xpath("//select[@id='adult_room']");
		By childPerRoom = By.xpath("//select[@id='child_room']");
		
		selectOption(location, "Paris");
		selectOption(hotels, "Hotel Sunshine");
		selectOption(roomtype, "Double");
		selectOption(noOfRoom, "9 - Nine");
		selectOption(adultperRoom, "3 - Three");
		selectOption(childPerRoom, "3 - Three");
		WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		checkin.clear();
		checkin.sendKeys("20/07/2025");
		System.out.println("Selected: 20/07/2025 ");
		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		checkout.clear();
		checkout.sendKeys("28/07/2025");
		System.out.println("Selected: 28/07/2025 ");
		
//		click on submit button
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		Thread.sleep(1000);
		
//		click on hotel select radio button
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		Thread.sleep(1000);
		
//		click on select button
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
//		enter the First name field 
	WebElement firstNameField =	 driver.findElement(By.xpath("//input[@id='first_name']"));
		 firstNameField.sendKeys("Swapnil");
		 String typedValue = firstNameField.getAttribute("value");
		 System.out.println("Selected: " + typedValue);
		 
//		Enter last name Field
		 WebElement lastNameField =	 driver.findElement(By.xpath("//input[@id='last_name']"));
		 lastNameField.sendKeys("Tulaskar");
		 String typedValue2 = lastNameField.getAttribute("value");
		 System.out.println("Selected: " + typedValue2);
		 
//		Enter billing address field
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
				address.sendKeys("swapanpurti home sweet home");
				String typevalue3 = address.getAttribute("value");
				System.out.println("Selected: "+ typevalue3);
//		Enter Credit card number
		WebElement cardnum =	driver.findElement(By.xpath("//input[@id='cc_num']"));
		cardnum.sendKeys("2345678956482564");
		String typevalue4 = cardnum.getAttribute("value");
		System.out.println("Selected: "+ typevalue4);
		
//		Enter Credit card type
		By cardtype = By.xpath("//select[@id='cc_type']");
		selectOption(cardtype, "Master Card");
//		Enter Expire month
		By month = By.xpath("//select[@id='cc_exp_month']");
		selectOption(month, "July");
//		Enter Expire year 	
		By year = By.xpath("//select[@id='cc_exp_year']");
		selectOption(year, "2028");
		Thread.sleep(1000);
		WebElement cvv =	driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("234");
		String typevalue5 = cvv.getAttribute("value");
		System.out.println("Selected: "+ typevalue5);
		
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		
		Thread.sleep(10000);
	}	
	//create a select method for select all dropdown field 
	public void selectOption(By locator, String visibleText) {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(visibleText);
        System.out.println("Selected: " + visibleText);
    }
	
	@AfterMethod
	public void close() throws Throwable {
		// TODO Auto-generated method stub
		super.close();
	}

}
