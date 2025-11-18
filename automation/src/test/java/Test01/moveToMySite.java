package Test01;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class moveToMySite {
	public static WebDriver driver;
	
	
	@Test
	
	public void run() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software exe file\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://qaworld01.blogspot.com");
		
		for(int i = 1 ; i<10 ; i++) { 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// Scroll down 500 pixels
			js.executeScript("window.scrollBy(0,500)"); 
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(4000);
		}
		
		driver.quit();
	}
}
