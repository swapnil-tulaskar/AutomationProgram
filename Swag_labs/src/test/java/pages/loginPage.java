package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@id='login-button']");
	
	
	public loginPage(WebDriver driver) {
		driver = this.driver;
	}
	
	public void enterUserName(String usr) {
		driver.findElement(username).sendKeys(usr);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void submit(){
		driver.findElement(login).click();
	}
}
