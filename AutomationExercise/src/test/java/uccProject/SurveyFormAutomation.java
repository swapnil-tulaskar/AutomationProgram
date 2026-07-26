package uccProject;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SurveyFormAutomation {

    static WebDriver driver;
    static WebDriverWait wait;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ucc.mp.gov.in/individual-form");

        // Text Fields
        enterText(By.xpath("//input[@placeholder='नाम']"), "Swapnil");
        enterText(By.xpath("//input[@placeholder='मोबाइल नंबर']"), "7415869368");
        enterText(By.xpath("//textarea[@placeholder='पता']"), "Basad");

        // Basic Dropdowns
       selectDropdown(By.xpath("//select[@name='gender_id']"), "पुरुष");
       //selectDropdown(By.xpath("//select[@name='gender_id']"),"महिला");

        selectDropdown(By.xpath("//select[@name='religion_id']"), "हिन्दू");
        // Division
        selectDropdown(By.xpath("//select[@name='division_id']"), "इंदौर");

        // Wait for District to become enabled
        By districtLocator = By.xpath("//select[@id='district_code']");

        wait.until(driver ->
                driver.findElement(districtLocator).isEnabled());

        selectDropdown(districtLocator, "बुरहानपुर");

        // Question Dropdowns
        List<By> questions = Arrays.asList(

                By.xpath("//select[@name='question_1_response']"),
                By.xpath("//select[@name='question_2_response']"),

                By.xpath("//select[@name='question_4_response']"),
                By.xpath("//select[@name='question_5_response']"),
                By.xpath("//select[@name='question_6_response']"),
                By.xpath("//select[@name='question_7_response']"),
                By.xpath("//select[@name='question_8_response']"),
                By.xpath("//select[@name='question_9_response']"),
                By.xpath("//select[@name='question_10_response']"),
                By.xpath("//select[@name='question_11_response']"),
                By.xpath("//select[@name='question_12_response']"),

                By.xpath("//select[@name='question_3_1_response']"),
                By.xpath("//select[@name='question_3_2_response']"),
                By.xpath("//select[@name='question_3_3_response']"),
                By.xpath("//select[@name='question_3_4_response']")
        );

        for (By question : questions) {
            selectDropdown(question, "हाँ");
        }

        // Suggestion
        enterText(By.xpath("//textarea[@id='suggestion_text']"),
                "समान नागरिक संहिता का उद्देश्य सभी नागरिकों को समान कानूनी अधिकार और न्याय प्रदान करना होना चाहिए। विवाह, तलाक, "
                + "उत्तराधिकार तथा भरण-पोषण संबंधी कानून सभी पर समान रूप से लागू हों। "
                + "महिलाओं और बच्चों के अधिकारों की सुरक्षा सुनिश्चित की जाए तथा संविधान के मौलिक अधिकारों और सामाजिक विविधता का सम्मान बनाए रखा जाए।");

        // Request OTP
        click(By.xpath("//button[@id='request-otp-button']"));

        System.out.println("====================================");
        System.out.println("Enter OTP manually on the webpage");
        System.out.println("After OTP verification press ENTER");
        System.out.println("====================================");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        // Submit Form
        click(By.xpath("//button[@type='submit']"));

        System.out.println("Form Submitted Successfully");

        // driver.quit();
    }

    public static void enterText(By locator, String value) {

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));

        element.clear();
        element.sendKeys(value);
    }

    public static void selectDropdown(By locator, String visibleText) {

        WebElement dropdown = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));

        wait.until(driver -> dropdown.isEnabled());

        Select select = new Select(dropdown);
        select.selectByVisibleText(visibleText);
    }

    public static void click(By locator) {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }
}