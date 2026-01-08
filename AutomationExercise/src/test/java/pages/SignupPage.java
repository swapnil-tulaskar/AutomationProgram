package pages;

import java.awt.peer.LabelPeer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
	
	WebDriver driver;
	
	private By Radiobtngender1 = By.xpath("//input[@id='id_gender1']");
	
    private By password = By.id("password");
    private By days = By.id("days");
    private By months = By.id("months");
    private By years = By.id("years");
    private By newsletter = By.id("newsletter");
    private By offers = By.id("optin");
    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By company = By.id("company");
    private By address1 = By.id("address1");
    private By country = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zip = By.id("zipcode");
    private By mobile = By.id("mobile_number");
    private By createAccountBtn = By.xpath("//button[normalize-space()='Create Account']");
    
	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillAccDeatails() {
		 driver.findElement(Radiobtngender1).click();
	        driver.findElement(password).sendKeys("12345");
	        new Select(driver.findElement(days)).selectByValue("9");
	        new Select(driver.findElement(months)).selectByValue("7");
	       // new Select(driver.findElement(months)).selectByContainsVisibleText("July");
	        new Select(driver.findElement(years)).selectByValue("1993");

	        driver.findElement(newsletter).click();
	        driver.findElement(offers).click();

	        driver.findElement(firstName).sendKeys("swapnil");
	        driver.findElement(lastName).sendKeys("Tulaskar");
	        driver.findElement(company).sendKeys("TestCompany");
	        driver.findElement(address1).sendKeys("Pune");

	        new Select(driver.findElement(country)).selectByVisibleText("India");

	        driver.findElement(state).sendKeys("MH");
	        driver.findElement(city).sendKeys("Pune");
	        driver.findElement(zip).sendKeys("411001");
	        driver.findElement(mobile).sendKeys("9999999999");

	        driver.findElement(createAccountBtn).click();
		
	        
	}

}
