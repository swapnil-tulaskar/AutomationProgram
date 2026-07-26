package Page;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.tess4j.Tesseract;

public class UserRegistrarionPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public UserRegistrarionPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By userName = By.id("username");
    private By password = By.id("password");
    private By confPassWord = By.id("re_password");
    private By fullName = By.id("full_name");
    private By emailId = By.id("email_add");
    private By captcha = By.id("captcha");
    private By captchaInput = By.xpath("//input[@id='captcha-form']");

    public void enterUserDetails(String uname, String pass, String name, String email) {

        driver.findElement(userName).sendKeys(uname);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confPassWord).sendKeys(pass);
        driver.findElement(fullName).sendKeys(name);
        driver.findElement(emailId).sendKeys(email);
    }
    
    public String readCaptcha() throws Exception {

        WebElement captchaImg = driver.findElement(captcha);

        File src = captchaImg.getScreenshotAs(OutputType.FILE);
        File dest = new File("captcha.png");

        Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");

        String text = tesseract.doOCR(dest);

        return text.replaceAll("[^a-zA-Z0-9]", "");
    
    }
    
    
    
    
}