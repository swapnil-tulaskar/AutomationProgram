package open_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

public class delete_cookies {

    WebDriver driver;

    @Test
    public void oc() throws InterruptedException {
        // Launch the browser
        driver = new ChromeDriver();
        Thread.sleep(2000);

        // Delete all cookies
        driver.manage().deleteAllCookies();
        Thread.sleep(3000);
       
        
        // Close the browser (optional)
        driver.quit();
    }
}
