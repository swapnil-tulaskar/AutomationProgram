package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By username = By.xpath("//input[@id='username']");
    By password = By.xpath("//input[@id='password']");
    By loginBtn = By.xpath("//input[@id='login']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToApp(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }

    // ✅ For assertion: get the page title or welcome text
    public String getLoggedInTitle() {
        return driver.getTitle();
    }
}
