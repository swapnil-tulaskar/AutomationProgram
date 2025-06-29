package open_browser;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
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
        // set the size of the window
        Dimension d = new Dimension(500, 500);
        driver.manage().window().setSize(d);
        Thread.sleep(5000);
        
        //set the position of the window
        Point p = new Point(520, 250);
        driver.manage().window().setPosition(p);
        Thread.sleep(5000);
        
        
        
        // Close the browser (optional)
        driver.quit();
    }
}
