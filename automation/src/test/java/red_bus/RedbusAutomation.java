package red_bus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class RedbusAutomation {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        System.out.println("Launching browser...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.redbus.in/");
        System.out.println("Page loaded.");
    }

    @Test
    public void searchBuses() throws InterruptedException {

        // FROM City Selection
        WebElement from = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//div[@class='labelCityWrapper___e889bf']/div[text()='From']/ancestor::div[contains(@class,'srcDestWrapper')]")
        ));
        from.click();

        WebElement fromInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//input[contains(@placeholder, 'From') or contains(@class,'input')]")
        ));
        fromInput.sendKeys("Pune");
        Thread.sleep(1000);
        fromInput.sendKeys(Keys.ARROW_DOWN);
        fromInput.sendKeys(Keys.ENTER);
        System.out.println("1]--> City 'Pune' entered.");

        // TO City Selection
        WebElement to = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//div[@class='labelCityWrapper___e889bf']/div[text()='To']/ancestor::div[contains(@class,'srcDestWrapper')]")
        ));
        to.click();

        WebElement toInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//input[contains(@placeholder, 'To') or contains(@class,'input')]")
        ));
        toInput.sendKeys("Kolhapur");
        Thread.sleep(1000);
        toInput.sendKeys(Keys.ARROW_DOWN);
        toInput.sendKeys(Keys.ENTER);
        System.out.println("2]--> City 'Kolhapur' entered.");

        // OPTIONAL: Select Date (e.g., Today)
        WebElement todayBtn = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[text()='Today']")
        ));
        todayBtn.click();
        System.out.println("3]--. Journey date selected as Today.");
        
        driver.findElement(By.xpath("//button[@class=\"primaryButton___469d04 searchButtonWrapper___12ed9c\"]")).click();
        
        Thread.sleep(5000);
        WebElement buscount = driver.findElement(By.xpath("//span[@class=\"subtitle___ff877e\"]"));
        System.out.println("4]bus found : - "+ buscount.getText());
        System.out.println("all required content print on console");
      
        driver.quit();
        System.out.println("Browser closed.");
    }
}