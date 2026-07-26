package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // ===== Locators =====
    private By productBtn = By.xpath("//a[@href='/products']");
    private By allProductsHeading = By.xpath("//h2[normalize-space()='All Products']");
    private By productNames = By.xpath(" //div[@class='overlay-content']//p");
  //div[@class='overlay-content']//p[contains(text(),'Blue Top')]
    private By viewProductButtons = By.xpath("//a[contains(text(),'View Product')]");
    private By Searchbox = By.xpath("//input[@id='search_product']");
    private By clickOnSearchbtn = By.xpath("//i[@class='fa fa-search']");

    // Product Details Page
    private By viewfirstProduct = By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]");
    private By name = By.xpath("//div[contains(@class,'product-information')]//h2");
    private By category = By.xpath("//div[contains(@class,'product-information')]//p[1]");
    private By price = By.xpath(" //div[contains(@class,'product-information')]//span[contains(text(),'Rs')]");
    private By availability = By.xpath("//div[contains(@class,'product-information')]//p[2]");
    private By condition = By.xpath("//body//section//p[3]");
    private By brand = By.xpath("//body//section//p[4]");

    // ===== Constructor =====
    public ProductPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // ===== Navigation =====
    public void clickOnProducts() {
        wait.until(ExpectedConditions.elementToBeClickable(productBtn)).click();
    }

    public boolean isAllProductsPageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(allProductsHeading)).isDisplayed();
    }

    // ===== Product List =====
    public int getProductCount() {
        List<WebElement> visibleProducts =
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productNames));

        return visibleProducts.size();
    
    }

    public List<String> getProductNames() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productNames));
        List<WebElement> elements = driver.findElements(productNames);
        List<String> names = new ArrayList<>();

        for (WebElement element : elements) {
            names.add(element.getText().trim());
        }

        return names;
    }

    public void clickFirstViewProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewProductButtons));
        wait.until(ExpectedConditions.elementToBeClickable(viewProductButtons));
        driver.findElements(viewProductButtons).get(0).click();
    }

    // ===== Product Detail Page =====
    
    public boolean isProductSearchBoxVisible() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(Searchbox)).isDisplayed();
    }
    
    public void enterSearchProduct(String productName) {
    	driver.findElement(Searchbox).sendKeys(productName);
    	driver.findElement(clickOnSearchbtn).click();
    }
    
    //Click on 'View Product' of first product
    public void clickOnfristViewProductBtn() {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(viewfirstProduct)).isDisplayed();
    }
   
    public boolean isProductNameDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(name)).isDisplayed();
    }

    public String getProductNameDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(name)).getText();
    }
    
    public boolean isCategoryDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(category)).isDisplayed();
    }

    public boolean isPriceDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(price)).isDisplayed();
    }

    public boolean isAvailabilityDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(availability)).isDisplayed();
    }

    public boolean isConditionDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(condition)).isDisplayed();
    }

    public boolean isBrandDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(brand)).isDisplayed();
    }
}