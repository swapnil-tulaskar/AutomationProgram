package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private By logo = By.id("nava");
    private By home = By.cssSelector("li.nav-item.active > a.nav-link");
    private By contact = By.xpath("//a[normalize-space()='Contact']");
    private By aboutUs = By.xpath("//a[normalize-space()='About us']");
    private By cart = By.id("cartur");
    private By login = By.id("login2");
    private By signUp = By.id("signin2");
    private By categories = By.xpath("(//a[normalize-space()='CATEGORIES'])[1]");
    private By laptop = By.linkText("Laptops");
    private By phone = By.linkText("Phones");
    private By monitors = By.linkText("Monitors");
    private By carouselLeft = By.className("carousel-control-prev-icon");
    private By carouselRight = By.className("carousel-control-next-icon");

    // Methods with explicit waits and proper naming

    public String getlogotext() {
		return driver.findElement(logo).getText();
    	
    }
    
    public boolean isLogoVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(logo)).isDisplayed();
    }
    
    public void clickLogo() {
        waitAndClick(logo);
        
    }

    public void clickHome() {
        waitAndClick(home);
    }

    public void clickContact() {
        waitAndClick(contact);
    }

    public void clickAboutUs() {
        waitAndClick(aboutUs);
    }

    public void clickCart() {
        waitAndClick(cart);
    }

    public void clickLogin() {
        waitAndClick(login);
    }

    public void clickSignUp() {
        waitAndClick(signUp);
    }

    public void clickCategories() {
        waitAndClick(categories);
    }

    public void clickLaptop() {
        waitAndClick(laptop);
    }

    public void clickPhone() {
        waitAndClick(phone);
    }

    public void clickMonitors() {
        waitAndClick(monitors);
    }

    public void clickCarouselLeft() {
        waitAndClick(carouselLeft);
    }

    public void clickCarouselRight() {
        waitAndClick(carouselRight);
    }

    // Utility method for waiting and clicking
    private void waitAndClick(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }
}
