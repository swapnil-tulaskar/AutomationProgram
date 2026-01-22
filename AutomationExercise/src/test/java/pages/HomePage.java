package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	private By signUpUser = By.xpath("//a[normalize-space()='Signup / Login']");
	private By deleteUser = By.xpath("//a[normalize-space()='Delete Account']");
	private By logOutUser = By.xpath("//a[normalize-space()='Logout']");
	private By loggedInAsText = By.xpath("//a[contains(text(),'Logged in as')]");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Method for SingUpUser
	public void clickSignUpSignInLogin() {driver.findElement(signUpUser).click();}
	
	// Method for Delete User
	public void clickDeleteUser() { driver.findElement(deleteUser).click();}
	
	// Method for LogOut User
	public void clickLogOutUser() { driver.findElement(logOutUser).click();}
	
	 // login state
	    public boolean isUserLoggedIn() {
	        return driver.findElement(loggedInAsText).isDisplayed();
	    }

	    public String getLoggedInAsText() {
	        return driver.findElement(loggedInAsText).getText();
	        }
}
