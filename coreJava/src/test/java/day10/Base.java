package day10;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void start() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}

}
