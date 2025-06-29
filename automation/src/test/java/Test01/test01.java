package Test01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test01 extends linkTest{

	@BeforeMethod
	
	public void start() {
		linkcheck();
	}
	
	@Test
	
	public void Web_inputs() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,10500);");
	  
		driver.findElement(By.xpath("//a[@href='/inputs'][normalize-space()='Try it out']")).click();
		
		 
		 Thread.sleep(1000);
	}
	
	
	
	
	@AfterMethod
	public void end() throws Throwable {
		Thread.sleep(4000);
		driver.quit();
	}
	
	
	
	
}
