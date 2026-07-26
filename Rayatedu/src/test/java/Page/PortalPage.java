package Page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class PortalPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public PortalPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By alumniMenu = By.xpath("//li[@id='alumniNav']//a");
    private By addAlumni = By.xpath("//span[normalize-space()='Add Alumni']");

    public void openAlumniMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(alumniMenu)).click();
    }

    public void clickAddAlumni() {
        wait.until(ExpectedConditions.elementToBeClickable(addAlumni)).click();
    }
}