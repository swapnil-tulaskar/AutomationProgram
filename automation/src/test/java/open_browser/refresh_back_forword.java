package open_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class refresh_back_forword {
	
	WebDriver driver;
	
	@Test
	
	void rbf() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
//		for backward the page
		driver.navigate().back();
		Thread.sleep(2000);

//		for forward the page
		driver.navigate().forward();
		Thread.sleep(2000);
		
//		for refresh the page
		driver.navigate().refresh();  
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
