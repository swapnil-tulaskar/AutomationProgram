package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Signup section
    private By newUserSignupText =
            By.xpath("//h2[normalize-space()='New User Signup!']");
    private By signupNameInput =
            By.xpath("//input[@placeholder='Name']");
    private By signupEmailInput =
            By.xpath("//input[@data-qa='signup-email']");
    private By signupButton =
            By.xpath("//button[normalize-space()='Signup']");

    // Login section
    private By loginEmailInput =
            By.xpath("//input[@data-qa='login-email']");
    private By loginPasswordInput =
            By.xpath("//input[@placeholder='Password']");
    private By loginButton =
            By.xpath("//button[normalize-space()='Login']");

    // Warnings & validation
    private By incorrectCredentialsWarning =
            By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
    private By alreadyRegisteredWarning =
            By.xpath("//p[normalize-space()='Email Address already exist!']");
    private By loggedInUserText =
            By.xpath("//li//a[contains(text(),'Logged in as')]");

    // Login page verification
    private By loginPageHeading =
            By.xpath("//h2[normalize-space()='Login to your account']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Signup action
    public void signUpEntry(String name, String email) {
        driver.findElement(signupNameInput).sendKeys(name);
        driver.findElement(signupEmailInput).sendKeys(email);
        driver.findElement(signupButton).click();
    }

    // Login action
    public void signInEntry(String email, String password) {
        driver.findElement(loginEmailInput).sendKeys(email);
        driver.findElement(loginPasswordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    // Validation: incorrect login
    public boolean isIncorrectCredentialsWarningVisible() {
        return driver.findElement(incorrectCredentialsWarning).isDisplayed();
    }

    public String getIncorrectCredentialsWarningText() {
        return driver.findElement(incorrectCredentialsWarning).getText();
    }

    // Validation: already registered email
    public boolean isAlreadyRegisteredWarningVisible() {
        return driver.findElement(alreadyRegisteredWarning).isDisplayed();
    }

    public String getAlreadyRegisteredWarningText() {
        return driver.findElement(alreadyRegisteredWarning).getText();
    }

    // Validation: logged-in user
    public boolean isLoggedInUserVisible() {
        return driver.findElement(loggedInUserText).isDisplayed();
    }

    public String getLoggedInUserText() {
        return driver.findElement(loggedInUserText).getText();
    }

    // Validation: login page (used after logout)
    public boolean isLoginFormVisible() {
        return driver.findElement(loginPageHeading).isDisplayed();
    }
}
