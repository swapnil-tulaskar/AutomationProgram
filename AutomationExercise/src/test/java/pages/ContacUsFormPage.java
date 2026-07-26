package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;


public class ContacUsFormPage {
	WebDriver driver;
	
	By getInTouch = By.xpath("//h2[normalize-space()='Get In Touch']"); 
	By name = By.xpath("//input[@placeholder='Name']");
	By email = By.xpath("//input[@placeholder='Email']");
	By subject = By.xpath("//input[@placeholder='Subject']");
	By message = By.xpath("(//textarea[@id='message'])[1]");
	By upload = By.xpath("//input[@name='upload_file']");
	By submit = By.xpath("//input[@name='submit']");
	By textVisual = By.xpath("//div[@class='status alert alert-success']");
	By home = By.xpath("//span[normalize-space()='Home']");
	
	
	
	public ContacUsFormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	
	public void getIntouch(String names,String emails,String sub, String Msg,String path) {
		driver.findElement(name).sendKeys(names);
		driver.findElement(email).sendKeys(emails);
		driver.findElement(subject).sendKeys(sub);
		driver.findElement(message).sendKeys(Msg);
		driver.findElement(upload).sendKeys(path);
		driver.findElement(submit).click();
		
		
	}
	
	public boolean isStatusTextShow() {
		return driver.findElement(textVisual).isDisplayed();
	}
	
	public String StatusTextshow() {
		return driver.findElement(textVisual).getText();
	}
	
	public void returnhome() {
		driver.findElement(home).click();
	}
	
	
	
	
	
	
	
}
