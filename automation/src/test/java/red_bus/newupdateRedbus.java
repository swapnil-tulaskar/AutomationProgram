package red_bus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class newupdateRedbus {
	
	WebDriver driver;
	@Test
	 public void setup() throws Throwable{
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.xpath("(//div[@class=\"labelCityWrapper___e889bf\"])[1]"));
		from.click();
		Thread.sleep(1000);
		from.sendKeys("kolhapur");
        Thread.sleep(2000); // Give time for suggestions to load
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);
        System.out.println("City 'Pune' entered.");
        Thread.sleep(5000);
        
        driver.quit();
	        

}
}