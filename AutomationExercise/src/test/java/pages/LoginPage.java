package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	By newUserText = By.xpath("//h2[normalize-space()='New User Signup!']");
	By username = By.xpath("//input[@placeholder='Name']");
	By signUpEmailAddress = By.xpath("//input[@data-qa='signup-email']");
	By  SignUpbtn = By.xpath("//button[normalize-space()='Signup']");
	
	By loginEmailAddress = By.xpath("//input[@data-qa='login-email']");
	By loginPassword= By.xpath("//input[@placeholder='Password']");
	By Loginbtn = By.xpath("//button[normalize-space()='Login']");
	By AccountWarning = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
	By AlreadyRegWaring = By.xpath("//p[normalize-space()='Email Address already exist!']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signUpEntry(String name, String email) {
		driver.findElement(username).sendKeys(name);
		driver.findElement(signUpEmailAddress).sendKeys(email);
		driver.findElement(SignUpbtn).click();
	}
	
	
	public void signInEntry(String email, String password) {
		driver.findElement(loginEmailAddress).sendKeys(email);
		driver.findElement(loginPassword).sendKeys(password);
		driver.findElement(Loginbtn).click();
	}
	// For Incorrect Email/Password Warning 
	public String getEmailPasswordIncorrectWarning() {
		return driver.findElement(AccountWarning).getText();
	}
	
	public boolean isEmailPasswordIncorrectWarningDisplay() {
		return driver.findElement(AccountWarning).isDisplayed();
	}
	
	// For Already Register Warning 
	public String getEmailAlreadyRegisterWarning() {
		return driver.findElement(AlreadyRegWaring).getText();
	}
	
	public boolean isEmailidAlreadyRegisterWaring() {
		return driver.findElement(AlreadyRegWaring).isDisplayed();
	}
	
	

}
