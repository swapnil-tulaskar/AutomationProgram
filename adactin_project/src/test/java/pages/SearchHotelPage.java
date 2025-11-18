package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchHotelPage {
    WebDriver driver;

    By location = By.xpath("//select[@id='location']");
    By hotel = By.xpath("//select[@id='hotels']");
    By roomType = By.xpath("//select[@id='room_type']");
    By roomNos = By.xpath("//select[@id='room_nos']");
    By checkInDate = By.xpath("//input[@id='datepick_in']");
    By checkOutDate = By.xpath("//input[@id='datepick_out']");
    By submitBtn = By.xpath("//input[@id='Submit']");
    By dateError = By.id("checkin_span");  // ✅ actual ID for check-in validation error
    By selectedLocation = By.xpath("//input[@id='location_0']");
    
    
    public SearchHotelPage(WebDriver driver) {
        this.driver = driver;
        
    }

    public void selectLocation(String loc) {
        new Select(driver.findElement(location)).selectByVisibleText(loc);
    }

    public void selectHotel(String hotelName) {
        new Select(driver.findElement(hotel)).selectByVisibleText(hotelName);
    }

    public void selectRoomType(String room) {
        new Select(driver.findElement(roomType)).selectByVisibleText(room);
    }

    public void selectRoomNos(String number) {
        new Select(driver.findElement(roomNos)).selectByVisibleText(number);
    }

    public void setCheckInDate(String date) {
        driver.findElement(checkInDate).clear();
        driver.findElement(checkInDate).sendKeys(date);
    }

    public void setCheckOutDate(String date) {
        driver.findElement(checkOutDate).clear();
        driver.findElement(checkOutDate).sendKeys(date);
    }

    public void clickSearch() {
        driver.findElement(submitBtn).click();
    }

    public String getDateErrorMessage() {
        return driver.findElement(dateError).getText();
    }
    
    public String getCityErrorMessage() {
    	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	    wait.until(ExpectedConditions.presenceOfElementLocated(selectedLocation)).getAttribute("value");
    	    return driver.findElement(selectedLocation).getAttribute("value");
    	}
    }

