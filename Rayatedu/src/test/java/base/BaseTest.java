package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setupDriver() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.alumniportal.rayatedu.in/auth/login");
    }

    @AfterClass
    public void tearDown() {
        if(driver != null) driver.quit();
    }
}