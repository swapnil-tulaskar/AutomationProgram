package adactin_Hotel;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class check_in_and_check_out extends signIn_hotel{
	
	@BeforeMethod
	public void open() {
		login();
	}
	@Test
	public void checkIn() throws Throwable{
		WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		driver.manage().window().minimize();
		System.out.println("enter checkin date");
		
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter check-in date (e.g., 20/07/2025): ");
		String checkinDate = scn.nextLine();

		System.out.print("Enter check-out date (e.g., 22/07/2025): ");
		String checkoutDate = scn.nextLine();

		// Clear existing date and input new one
		checkin.clear();
		checkin.sendKeys(checkinDate);

		checkout.clear();
		checkout.sendKeys(checkoutDate);
		System.out.println("Check-in and check-out dates entered successfully.");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void close() throws Throwable {
		Thread.sleep(8000);
		super.close();
	}

}
