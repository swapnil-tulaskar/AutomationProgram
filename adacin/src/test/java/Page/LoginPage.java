package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private By registerLink = By.xpath("//a[normalize-space()='New User Register Here']");
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login");
    private By forgotPasswordLink = By.linkText("Forgot Password?");
    private By logo = By.xpath("//img[@alt='AdactIn Group']");

    // Reusable Methods
    private void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    private boolean isVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }

    // Business Methods
    public void login(String username, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        click(loginButton);
    }

    public void clickRegister() {
        click(registerLink);
    }

    public void clickForgotPassword() {
        click(forgotPasswordLink);
    }

    public boolean isLogoDisplayed() {
        return isVisible(logo);
    }
}