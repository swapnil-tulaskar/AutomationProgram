package open_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkLogo_available {
	
	WebDriver driver;
	
	@Test
	
	void checklogo() throws Throwable{
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean logo = driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).isDisplayed();
		
		if(logo==true) {
			System.out.println("logo is available");
		}
		else {
			System.out.println("logo not available");
		}
		
		
		driver.close();
	}
	

}
