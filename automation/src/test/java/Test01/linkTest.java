package Test01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class linkTest {
	
     static WebDriver driver;
     void linkcheck() {
    	 ChromeOptions options = new ChromeOptions();
    	 options.addArguments("--disable-popup-blocking"); // Disable browser pop-up blocking (optional)
    	 options.addArguments("--disable-notifications"); // Prevent push notifications
    	 options.addArguments("--disable-extensions"); // Disable ad-blockers/extensions
    	 options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
    	 driver = new ChromeDriver(options);

    	 driver.manage().window().maximize();
    	 driver.get("https://practice.expandtesting.com/");
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }

}
