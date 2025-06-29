package open_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chrome_launching {
	static WebDriver driver;
	
	@Test
	void oc() {
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
	}

}
