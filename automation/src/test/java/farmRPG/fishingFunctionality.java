package farmRPG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class fishingFunctionality extends baseClass {
	
	
			By fishing = By.xpath("//a[@href='fish.php']//div[@class='item-content']//div[@class='item-inner']");
			By LakeMinerva = By.xpath("//div[@class='card-content']//div[@class='list-block']//div[@class='item-content']//div[@class='item-title']");
	@Test
	public void catchFish() throws Throwable {
		OpenLink();
		driver.findElement(fishing).click();
		Thread.sleep(1000);
		driver.findElement(LakeMinerva).click();
		
		
		
	}

}
