package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseClass {
    public static  WebDriver driver;

    @BeforeMethod
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://adactinhotelapp.com/");
    }

    @AfterMethod
    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
