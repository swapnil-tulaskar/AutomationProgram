package adactin_Hotel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class signIn_hotel {
	 
 static WebDriver driver;
	
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		enter the hotel link 
		driver.get("https://adactinhotelapp.com/");
//		enter user name 
<<<<<<< HEAD
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Swapniltulaskar");
=======
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Swapniltulaskar");
>>>>>>> f471ed9bc48e13bf7f4268366b2603f1a6afb38c
//		enter password field 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Swapnil@123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		
	}
	 
	public void selectOption(By locator, String visibleText) {
	        Select select = new Select(driver.findElement(locator));
	        select.selectByVisibleText(visibleText);
	        System.out.println("Selected: " + visibleText);
	    }
	
	public void printAllOptions(By locator) {
        Select select = new Select(driver.findElement(locator));
        List<WebElement> options = select.getOptions();
        int count = 1;
        for (WebElement option : options) {
            System.out.println(count + ". " + option.getText());
            count++;
        }
    }
	public void close() throws Throwable {
		
		driver.quit();
	}

}
