package herokuapp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class basicOth extends BaseClass{

	
	@Test
	public void enterUsernamePwd() throws Throwable{
		driver.findElement(By.xpath("//a[normalize-space()='Basic Auth']")).click();
		
		
		Thread.sleep(5000);
	}
}
