package demoblaze;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findnNoOfLinkAndPrint {
	public static WebDriver driver;

	@Test
	void getLink() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//1) Count all links on page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No. of links available on page: " + links.size());
		 
		int count =1;
		
		 for(WebElement alllink : links) {
			 System.out.println(count +". " + alllink.getText());
			 count++;
		 }
			Thread.sleep(2000); // wait for images to load
		//2) Now count all images 
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("No. of images on page after scrolling: " + images.size());
		
		//3) click on any product usign linktext
		driver.findElement(By.linkText("Laptops")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(5000);
		
		driver.quit();
	}
}
