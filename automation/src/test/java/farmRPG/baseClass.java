package farmRPG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	static WebDriver driver;
	
	public void OpenLink() throws Throwable{
		
		By link = By.xpath("//a[@href='login.php']//div[@class='item-content']//div[@class='item-inner']");
		By user = By.xpath("//input[@placeholder='Your username']");
		By password = By.xpath("//input[@id='password']");
		By submit = By.xpath("//input[@id='login_sub']");
		
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://farmrpg.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(link).click();
		Thread.sleep(1000);
		driver.findElement(user).sendKeys("Kuku007");
		driver.findElement(password).sendKeys("12345");;
		driver.findElement(submit).click();
		
	}
	
	public void close() {
		driver.quit();
	}

}
