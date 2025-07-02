package adactin_Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signIn_hotel {
	
	static WebDriver driver;
	
	@Test
	
	void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		enter the hotel link 
		driver.get("https://adactinhotelapp.com/");
//		enter user name 
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Swapnil");
//		enter password field 
		driver.findElement(By.xpath("")).sendKeys("Swapnil@123");
		driver.findElement(By.xpath("")).click();
		
		
		
	}
	

}
