package Test01;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class repeateLink {
	WebDriver driver;
    Actions actions;   // Declare once
    By page1 = By.xpath("//a[normalize-space()='Automation Practice Page']");
    By page2 = By.xpath("//a[normalize-space()='Manual Testing']");
    By page3 = By.xpath("//a[normalize-space()='Manual Testing Interview Q&A']");

    
    
    @BeforeClass
    public void open() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }
    
    @Test
    public void clickFunctionality() throws InterruptedException {
        driver.get("https://qaworld01.blogspot.com/");
        Thread.sleep(3000);  // small wait so page loads properly
     
            // Instead of direct click, use Actions class
            
            actions.moveToElement(driver.findElement(page1)).click().perform();
            
            Thread.sleep(2000); // wait after click
            driver.navigate().back();
            Thread.sleep(2000);
            
            actions.moveToElement(driver.findElement(page2)).click().perform();
            Thread.sleep(2000); // wait after click
            driver.navigate().back();
            Thread.sleep(2000);
            
            actions.moveToElement(driver.findElement(page3)).click().perform();
            Thread.sleep(2000); // wait after click
            driver.navigate().back();
            Thread.sleep(2000);
            
        
    }
    
    @AfterClass
    public void close() {
        driver.quit();
    }

}
