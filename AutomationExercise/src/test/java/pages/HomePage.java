package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	private By signUpUser = By.xpath("//a[normalize-space()='Signup / Login']");
	private By deleteUser = By.xpath("//a[normalize-space()='Delete Account']");
	private By logOutUser = By.xpath("//a[normalize-space()='Logout']");
	private By deleteAccountText = By.xpath("//b[normalize-space()='Account Deleted!']");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// for Method for SingUpUser
	public void clickSignUpSignInLogin() {driver.findElement(signUpUser).click();}
	
	// for Method for Delete User
	public void clickDeleteUser() { driver.findElement(deleteUser).click();}
	
	// for Method for LogOut User
	public void clickLogOutUser() { driver.findElement(logOutUser).click();}
	
	

}
