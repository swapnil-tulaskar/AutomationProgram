package open_browser;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class set_Position_Of_Window {
	WebDriver driver;

    @Test
    public void oc() throws InterruptedException {
        // Launch the browser
        driver = new ChromeDriver();
        Thread.sleep(2000);
        
        //set the position of the window
        Point p = new Point(520, 250);
        driver.manage().window().setPosition(p);
        Thread.sleep(5000);
        
        
        
        // Close the browser (optional)
        driver.quit();
    }

}
