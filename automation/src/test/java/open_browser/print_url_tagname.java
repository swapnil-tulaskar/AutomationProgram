package open_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class print_url_tagname {
	
	static WebDriver driver = new ChromeDriver();
	
	@Test
	void oc() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// get URL
		System.out.println("=================================================");
		String url = driver.getCurrentUrl();
		System.out.println("URl:-"+ url);
		// get title 
	
		String title = driver.getTitle();
		System.out.println("Title:-  " + title);
		System.out.println("=================================================");
		driver.quit();
	}
	
	
	

}
