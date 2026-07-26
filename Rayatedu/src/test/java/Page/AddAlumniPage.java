package Page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;

public class AddAlumniPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public AddAlumniPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // ===== LOCATORS =====
    private By abbreviation = By.id("abbreviation");
    private By firstName = By.id("first_name");
    private By middleName = By.id("middle_name");
    private By lastName = By.id("last_name");
    private By gender = By.id("gender");
    private By dob = By.id("dob");
    private By registerNo = By.id("page_no");
    private By classNameDropdown = By.id("select2-admitted_course-container");
    private By admissionYear = By.id("admission_year");
    private By address = By.xpath("//input[@placeholder='Registered Address']");
    private By pincode = By.xpath("//input[@placeholder='Register Pincode']");
    private By locality = By.id("reg_locality_id");
    private By stateField = By.id("reg_state");
    private By saveBtn = By.xpath("//button[normalize-space()='Save']");

    // ===== COMMON METHOD =====
    private void clearAndSendKeys(By locator, String value) {

        if (value == null) {
            throw new RuntimeException("Input value is null for locator: " + locator);
        }

        WebElement field = wait.until(ExpectedConditions.elementToBeClickable(locator));

        wait.until(d -> field.isDisplayed() && field.isEnabled());

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});", field);

        field.click();

        field.sendKeys(Keys.CONTROL + "a");
        field.sendKeys(Keys.DELETE);

        wait.until(ExpectedConditions.attributeToBe(field, "value", ""));

        String finalVal = value.trim();

        for (char c : finalVal.toCharArray()) {
            field.sendKeys(String.valueOf(c));
        }

        wait.until(ExpectedConditions.attributeToBe(field, "value", finalVal));
    }

    // ===== TEXT FIELDS =====
    public void enterFirstName(String val) {
        clearAndSendKeys(firstName, val);
    }

    public void enterMiddleName(String val) {
        clearAndSendKeys(middleName, val);
    }

    public void enterLastName(String val) {
        clearAndSendKeys(lastName, val);
    }

    public void enterRegisterNo(String val) {
        clearAndSendKeys(registerNo, val);
    }

    public void enterAddress(String val) {
        clearAndSendKeys(address, val);
    }

    // ===== DROPDOWNS =====
    public void enterAbbreviation(String val) {
        new Select(wait.until(ExpectedConditions.elementToBeClickable(abbreviation)))
                .selectByVisibleText(val.trim());
    }

    public void enterGender(String val) {
        new Select(wait.until(ExpectedConditions.elementToBeClickable(gender)))
                .selectByVisibleText(val.trim());
    }

    public void selectAdmissionYear(String val) {
        new Select(wait.until(ExpectedConditions.elementToBeClickable(admissionYear)))
                .selectByVisibleText(val.trim());
    }

    // ===== PINCODE (CRITICAL FIXED) =====
    public void enterPincode(String val) {

        if (val == null || val.trim().isEmpty()) {
            throw new RuntimeException("Pincode is null or empty");
        }

        String numericVal = val.replaceAll("\\D", "").trim();

        WebElement field = wait.until(ExpectedConditions.elementToBeClickable(pincode));
        field.click();

        // 🔴 STEP 1: Clear using real keyboard (NOT JS)
        field.sendKeys(Keys.CONTROL + "a");
        field.sendKeys(Keys.BACK_SPACE);

        // 🔴 STEP 2: TYPE LIKE HUMAN (IMPORTANT)
        for (char c : numericVal.toCharArray()) {
            field.sendKeys(String.valueOf(c));
            try {
                Thread.sleep(100); // small delay to trigger events
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // 🔴 STEP 3: FORCE TRIGGER (EXTRA SAFETY)
        field.sendKeys(Keys.TAB);

        // 🔴 STEP 4: VERIFY PINCODE ENTERED
        wait.until(d -> field.getAttribute("value").trim().length() == 6);
    }

    // ===== SELECT2 CLASS DROPDOWN =====
    public void selectClassName(String className) {

        String target = className.trim();

        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("span.select2-selection.select2-selection--single")));
        dropdown.click();

        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.cssSelector("li.select2-results__option")));

        WebElement match = options.stream()
                .filter(opt -> opt.getText().trim().equalsIgnoreCase(target))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Class not found: " + target));

        match.click();

        WebElement selected = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("select2-admitted_course-container")));

        if (!selected.getText().trim().equalsIgnoreCase(target)) {
            throw new RuntimeException("Class selection failed: " + target);
        }
    }

    // ===== LOCALITY =====
    public void selectLocality(String val) {

        if (val == null || val.trim().isEmpty()) {
            throw new RuntimeException("Locality is null or empty");
        }

        String target = val.trim();

        // 🔴 STEP 1: WAIT FOR DROPDOWN OPTIONS TO LOAD (FRESH FETCH EVERY TIME)
        wait.until(driver -> {
            WebElement dd = driver.findElement(locality);
            List<WebElement> options = dd.findElements(By.tagName("option"));
            return options.size() > 1;
        });

        // 🔴 STEP 2: WAIT UNTIL EXPECTED VALUE EXISTS
        wait.until(driver -> {
            Select s = new Select(driver.findElement(locality));
            return s.getOptions()
                    .stream()
                    .anyMatch(opt -> opt.getText().trim().equalsIgnoreCase(target));
        });

        // 🔴 STEP 3: SELECT VALUE (FRESH ELEMENT AGAIN)
        Select select = new Select(wait.until(ExpectedConditions.elementToBeClickable(locality)));
        select.selectByVisibleText(target);

        // 🔴 STEP 4: VERIFY SELECTION
        wait.until(driver ->
                new Select(driver.findElement(locality))
                        .getFirstSelectedOption()
                        .getText()
                        .trim()
                        .equalsIgnoreCase(target)
        );
    }

    // ===== DOB =====
    public void enterDOB(String dobValue) {

        String[] parts = dobValue.split("/");

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (year > 25) {
            year = 1900 + year;
        } else {
            year = 2000 + year;
        }

        String formattedDate = String.format("%02d-%02d-%04d", day, month, year);

        WebElement dobField = wait.until(ExpectedConditions.elementToBeClickable(dob));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=arguments[1];", dobField, formattedDate);

        wait.until(ExpectedConditions.attributeToBe(dobField, "value", formattedDate));
    }

    // ===== SAVE =====
    public void clickSave() {
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
        btn.click();
    }
}