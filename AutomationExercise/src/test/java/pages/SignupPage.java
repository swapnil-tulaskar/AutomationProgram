package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {

    private WebDriver driver;

    // Locators
    private By genderMaleRadio = By.id("id_gender1");
    private By passwordInput = By.id("password");
    private By daysDropdown = By.id("days");
    private By monthsDropdown = By.id("months");
    private By yearsDropdown = By.id("years");
    private By newsletterCheckbox = By.id("newsletter");
    private By offersCheckbox = By.id("optin");
    private By firstNameInput = By.id("first_name");
    private By lastNameInput = By.id("last_name");
    private By companyInput = By.id("company");
    private By addressInput = By.xpath("//input[@id='address1']");
    private By countryDropdown = By.id("country");
    private By stateInput = By.id("state");
    private By cityInput = By.id("city");
    private By zipInput = By.id("zipcode");
    private By mobileInput = By.id("mobile_number");
    private By createAccountButton =
            By.xpath("//button[normalize-space()='Create Account']");
    private By accountCreatedText =
            By.xpath("//b[normalize-space()='Account Created!']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public SignupPage selectMaleGender() {
        driver.findElement(genderMaleRadio).click();
        return this;
    }

    public SignupPage enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }

    public SignupPage selectDOB(String day, String month, String year) {
        new Select(driver.findElement(daysDropdown)).selectByValue(day);
        new Select(driver.findElement(monthsDropdown)).selectByValue(month);
        new Select(driver.findElement(yearsDropdown)).selectByValue(year);
        return this;
    }

    public SignupPage subscribeNewsletter() {
        driver.findElement(newsletterCheckbox).click();
        return this;
    }

    public SignupPage subscribeOffers() {
        driver.findElement(offersCheckbox).click();
        return this;
    }

    public SignupPage enterAddressDetails(
            String firstName,
            String lastName,
            String company,
            String address,
            String country,
            String state,
            String city,
            String zip,
            String mobile) {

        driver.findElement(firstNameInput).sendKeys(firstName);
        driver.findElement(lastNameInput).sendKeys(lastName);
        driver.findElement(companyInput).sendKeys(company);
        driver.findElement(addressInput).sendKeys(address);
        new Select(driver.findElement(countryDropdown)).selectByVisibleText(country);
        driver.findElement(stateInput).sendKeys(state);
        driver.findElement(cityInput).sendKeys(city);
        driver.findElement(zipInput).sendKeys(zip);
        driver.findElement(mobileInput).sendKeys(mobile);

        return this;
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }

    // Validation
    public boolean isAccountCreatedVisible() {
        return driver.findElement(accountCreatedText).isDisplayed();
    }

    public String getAccountCreatedText() {
        return driver.findElement(accountCreatedText).getText();
    }
}
