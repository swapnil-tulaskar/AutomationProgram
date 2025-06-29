package open_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookAccount {
	static WebDriver driver;
	@Test
	void fb() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}

}
