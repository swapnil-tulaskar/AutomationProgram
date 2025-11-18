package test;

import java.io.File;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;

public class hostelform {

    WebDriver driver;
    WebDriverWait wait;
    Random random = new Random();

    // ---------- Locators ----------
    By usernameField = By.xpath("//input[@placeholder='Username']");
    By passwordField = By.xpath("//input[@placeholder='Password']");
    By loginButton   = By.xpath("//button[normalize-space()='Login']");

    By hostelName = By.xpath("//input[@placeholder='Hostel Name']");
    By area = By.xpath("//input[@placeholder='Area / Locality']");
    By city = By.xpath("//input[@placeholder='City']");
    By capacity = By.xpath("//input[@placeholder='Capacity']");
    By monthlyFee = By.xpath("//input[@placeholder='Monthly Fees']");
    By advance = By.xpath("//input[@placeholder='Advance Payment']");
    By facility = By.xpath("//input[@placeholder='Facilities (comma separated)']");
    By rule = By.xpath("//input[@placeholder='Rules (comma separated)']");
    By contact = By.xpath("//input[@placeholder='Contact Mobile']");
    By submit = By.xpath("//button[normalize-space()='Add Hostel']");

    // ---------- Setup ----------
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("http://localhost:3000/admin");

        // 🔐 Login before running tests
        wait.until(ExpectedConditions.elementToBeClickable(usernameField)).sendKeys("admin");
        driver.findElement(passwordField).sendKeys("12345");
        driver.findElement(loginButton).click();

        // Wait for dashboard or hostel form to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(hostelName));
    }

    // ---------- DataProvider ----------
    @DataProvider(name = "hostelData")
    public Object[][] hostelData() {
        String[] cities = {"Mumbai", "Delhi", "Pune", "Hyderabad", "Bangalore", "Indore", "Bhopal"};
        String[][] areas = {
            {"Andheri", "Bandra", "Dadar", "Powai", "Borivali"},        
            {"Saket", "Karol Bagh", "Lajpat Nagar", "Rohini", "Dwarka"},
            {"Koregaon Park", "Aundh", "Baner", "Hinjewadi", "Kothrud"},
            {"Gachibowli", "Madhapur", "Banjara Hills", "Kukatpally", "Begumpet"},
            {"Indiranagar", "Whitefield", "HSR Layout", "Koramangala", "Jayanagar"},
            {"Rajwada", "Vijay Nagar", "Bhawarkuan", "Palasia", "Tilak Nagar"},
            {"Arera Colony", "TT Nagar", "MP Nagar", "Kolar", "Bairagarh"}
        };

        String[] hostelNames = {"Guest Inn", "Comfort Stay", "Dream Nest", "City Lodge", "Urban Rest"};
        String[] facilities = {"Wifi", "AC", "Laundry", "Gym", "RO Water", "CCTV"};
        String[] rules = {"No Smoking", "No Alcohol", "No Pets", "Gate Close at 10 PM"};

        Object[][] data = new Object[cities.length * 5][9];
        int index = 0;

        for (int c = 0; c < cities.length; c++) {
            for (int i = 0; i < 5; i++) {
                data[index][0] = hostelNames[i] + " - " + cities[c];
                data[index][1] = areas[c][i];
                data[index][2] = cities[c];
                data[index][3] = String.valueOf(20 + random.nextInt(80)); // Capacity
                int fee = 4000 + random.nextInt(4000);
                data[index][4] = String.valueOf(fee);     // Monthly Fee
                data[index][5] = String.valueOf(fee / 2); // Advance Payment
                data[index][6] = facilities[random.nextInt(facilities.length)] + ", " +
                                facilities[random.nextInt(facilities.length)];
                data[index][7] = rules[random.nextInt(rules.length)];
                data[index][8] = "91" + (900000000 + random.nextInt(100000000));
                index++;
            }
        }
        return data;
    }

    // ---------- Test ----------
    @Test(dataProvider = "hostelData")
    public void fillHostelForm(String name, String areaName, String cityName, String cap,
                               String fee, String adv, String fac, String ruleText, String contactNumber) throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(hostelName));

        driver.findElement(hostelName).clear();
        driver.findElement(hostelName).sendKeys(name);

        driver.findElement(area).clear();
        driver.findElement(area).sendKeys(areaName);

        driver.findElement(city).clear();
        driver.findElement(city).sendKeys(cityName);

        driver.findElement(capacity).clear();
        driver.findElement(capacity).sendKeys(cap);

        driver.findElement(monthlyFee).clear();
        driver.findElement(monthlyFee).sendKeys(fee);

        driver.findElement(advance).clear();
        driver.findElement(advance).sendKeys(adv);

        driver.findElement(facility).clear();
        driver.findElement(facility).sendKeys(fac);

        driver.findElement(rule).clear();
        driver.findElement(rule).sendKeys(ruleText);

        driver.findElement(contact).clear();
        driver.findElement(contact).sendKeys(contactNumber);

        driver.findElement(submit).click();

        Thread.sleep(1000); // Wait for submission
        System.out.println("✅ Submitted: " + name + " (" + cityName + ")");
    }

    // ---------- Optional: Screenshot on Failure ----------
    @AfterMethod
    public void captureOnFailure(ITestResult result) {
        if (!result.isSuccess()) {
            try {
                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshot, new File("screenshots/" + result.getName() + ".png"));
            } catch (Exception e) {
                System.out.println("⚠️ Screenshot capture failed: " + e.getMessage());
            }
        }
    }

    // ---------- Tear Down ----------
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
