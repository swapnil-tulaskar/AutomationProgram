package Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class linkTest {
	
     static WebDriver driver;
      
     @Test
     
     void linkcheck() {
    	 driver = new ChromeDriver();
    	 
    	 driver.get("http://automationpractice.com/");
    	 driver.findElement(By.xpath("//img[@src=\"https://design.inmotionhosting.com/assets/logos/corporate/logo-imh.svg\"].click();"))
     }

}
