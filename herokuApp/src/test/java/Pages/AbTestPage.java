package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbTestPage {
	WebDriver driver;
	
	public AbTestPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By heading = By.tagName("h3");
	
	public boolean isHeadingDisplayed() {
		return driver.findElement(heading).isDisplayed();
	}
	
	public String getHeadingText() {
		return driver.findElement(heading).getText();
	}

}
