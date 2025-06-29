package open_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class get_fb_link {
	static WebDriver driver;
	@Test
	void fb() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}

}
