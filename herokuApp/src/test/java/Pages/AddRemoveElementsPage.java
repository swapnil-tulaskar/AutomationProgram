package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage {
	
	WebDriver driver;

	
	public AddRemoveElementsPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	private By AddElement = By.xpath("//button[normalize-space()='Add Element']");
	private By DeleteButton = By.cssSelector(".added-manually");
	
	public void addElement() {
		driver.findElement(AddElement).click();
	}
	
	public int getdeleteButtonall() {
		return driver.findElement(DeleteButton).
	}

}
