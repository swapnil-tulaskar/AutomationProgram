package red_bus;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class RedbusAutomation {
	
		WebDriver driver;

	
		@Test
		void open() throws InterruptedException {
       
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 2: Open RedBus site
        driver.get("https://www.redbus.in");
        
//        enter frist city name 
        driver.findElement(By.xpath("(//div[@class=\"srcDest___66dcbc\"])[1]")).sendKeys("goa");

        Thread.sleep(3000); 
        driver.quit();
    }
}
