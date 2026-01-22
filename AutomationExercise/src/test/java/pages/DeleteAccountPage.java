package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage {
	WebDriver driver;
	
	By DeleteAccountmessageTitle = By.xpath("//h2[@class='title text-center']");
	By DeleteAccountContent2 = By.xpath("//section[@id='form']//div[@class='row']");
	By DeleteAccountContent3 = By.xpath("//h2[@class='title text-center']");
	
	public DeleteAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// For Delete User Notification 
		public boolean isDeleteAccountTitleDisplay() {
			return driver.findElement(DeleteAccountmessageTitle).isDisplayed();
		}
		
		public String getDeleteAccountTitleMessage() {
			return driver.findElement(DeleteAccountmessageTitle).getText();
		}
		
}
