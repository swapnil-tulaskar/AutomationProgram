package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // ===================== Locators =====================

    private By abTesting = By.xpath("//a[text()='A/B Testing']");
    private By addRemoveElements = By.xpath("//a[text()='Add/Remove Elements']");
    private By basicAuth = By.xpath("//a[text()='Basic Auth']");
    private By brokenImages = By.xpath("//a[text()='Broken Images']");
    private By challengingDOM = By.xpath("//a[text()='Challenging DOM']");
    private By checkboxes = By.xpath("//a[text()='Checkboxes']");
    private By contextMenu = By.xpath("//a[text()='Context Menu']");
    private By digestAuthentication = By.xpath("//a[text()='Digest Authentication']");
    private By disappearingElements = By.xpath("//a[text()='Disappearing Elements']");
    private By dragAndDrop = By.xpath("//a[text()='Drag and Drop']");
    private By dropdown = By.xpath("//a[text()='Dropdown']");
    private By dynamicContent = By.xpath("//a[text()='Dynamic Content']");
    private By dynamicControls = By.xpath("//a[text()='Dynamic Controls']");
    private By dynamicLoading = By.xpath("//a[text()='Dynamic Loading']");
    private By entryAd = By.xpath("//a[text()='Entry Ad']");
    private By exitIntent = By.xpath("//a[text()='Exit Intent']");
    private By fileDownload = By.xpath("//a[text()='File Download']");
    private By fileUpload = By.xpath("//a[text()='File Upload']");
    private By floatingMenu = By.xpath("//a[text()='Floating Menu']");
    private By forgotPassword = By.xpath("//a[text()='Forgot Password']");
    private By formAuthentication = By.xpath("//a[text()='Form Authentication']");
    private By frames = By.xpath("//a[text()='Frames']");
    private By geolocation = By.xpath("//a[text()='Geolocation']");
    private By horizontalSlider = By.xpath("//a[text()='Horizontal Slider']");
    private By hovers = By.xpath("//a[text()='Hovers']");
    private By infiniteScroll = By.xpath("//a[text()='Infinite Scroll']");
    private By inputs = By.xpath("//a[text()='Inputs']");
    private By jqueryUIMenus = By.xpath("//a[text()='JQuery UI Menus']");
    private By javascriptAlerts = By.xpath("//a[text()='JavaScript Alerts']");
    private By javascriptOnloadEventError = By.xpath("//a[text()='JavaScript onload event error']");
    private By keyPresses = By.xpath("//a[text()='Key Presses']");
    private By largeAndDeepDOM = By.xpath("//a[text()='Large & Deep DOM']");
    private By multipleWindows = By.xpath("//a[text()='Multiple Windows']");
    private By nestedFrames = By.xpath("//a[text()='Nested Frames']");
    private By notificationMessages = By.xpath("//a[text()='Notification Messages']");
    private By redirectLink = By.xpath("//a[text()='Redirect Link']");
    private By secureFileDownload = By.xpath("//a[text()='Secure File Download']");
    private By shadowDOM = By.xpath("//a[text()='Shadow DOM']");
    private By shiftingContent = By.xpath("//a[text()='Shifting Content']");
    private By slowResources = By.xpath("//a[text()='Slow Resources']");
    private By sortableDataTables = By.xpath("//a[text()='Sortable Data Tables']");
    private By statusCodes = By.xpath("//a[text()='Status Codes']");
    private By typos = By.xpath("//a[text()='Typos']");
    private By wysiwygEditor = By.xpath("//a[text()='WYSIWYG Editor']");

    // ===================== Methods =====================
    
    private void click(By locator) {
    	driver.findElement(locator).click();
    	
    }

    public void clickABTesting() {
        click(abTesting);
    }
    	
    public void clickAddRemoveElements() {
        click(addRemoveElements);
    }

    public void clickBasicAuth() {
        driver.findElement(basicAuth).click();
    }

    public void clickBrokenImages() {
        driver.findElement(brokenImages).click();
    }

    public void clickChallengingDOM() {
        driver.findElement(challengingDOM).click();
    }

    public void clickCheckboxes() {
        driver.findElement(checkboxes).click();
    }

    public void clickContextMenu() {
        driver.findElement(contextMenu).click();
    }

    public void clickDigestAuthentication() {
        driver.findElement(digestAuthentication).click();
    }

    public void clickDisappearingElements() {
        driver.findElement(disappearingElements).click();
    }

    public void clickDragAndDrop() {
        driver.findElement(dragAndDrop).click();
    }

    public void clickDropdown() {
        driver.findElement(dropdown).click();
    }

    public void clickDynamicContent() {
        driver.findElement(dynamicContent).click();
    }

    public void clickDynamicControls() {
        driver.findElement(dynamicControls).click();
    }

    public void clickDynamicLoading() {
        driver.findElement(dynamicLoading).click();
    }

    public void clickEntryAd() {
        driver.findElement(entryAd).click();
    }

    public void clickExitIntent() {
        driver.findElement(exitIntent).click();
    }

    public void clickFileDownload() {
        driver.findElement(fileDownload).click();
    }

    public void clickFileUpload() {
        driver.findElement(fileUpload).click();
    }

    public void clickFloatingMenu() {
        driver.findElement(floatingMenu).click();
    }

    public void clickForgotPassword() {
        driver.findElement(forgotPassword).click();
    }

    public void clickFormAuthentication() {
        driver.findElement(formAuthentication).click();
    }

    public void clickFrames() {
        driver.findElement(frames).click();
    }

    public void clickGeolocation() {
        driver.findElement(geolocation).click();
    }

    public void clickHorizontalSlider() {
        driver.findElement(horizontalSlider).click();
    }

    public void clickHovers() {
        driver.findElement(hovers).click();
    }

    public void clickInfiniteScroll() {
        driver.findElement(infiniteScroll).click();
    }

    public void clickInputs() {
        driver.findElement(inputs).click();
    }

    public void clickJQueryUIMenus() {
        driver.findElement(jqueryUIMenus).click();
    }

    public void clickJavaScriptAlerts() {
        driver.findElement(javascriptAlerts).click();
    }

    public void clickJavaScriptOnloadEventError() {
        driver.findElement(javascriptOnloadEventError).click();
    }

    public void clickKeyPresses() {
        driver.findElement(keyPresses).click();
    }

    public void clickLargeAndDeepDOM() {
        driver.findElement(largeAndDeepDOM).click();
    }

    public void clickMultipleWindows() {
        driver.findElement(multipleWindows).click();
    }

    public void clickNestedFrames() {
        driver.findElement(nestedFrames).click();
    }

    public void clickNotificationMessages() {
        driver.findElement(notificationMessages).click();
    }

    public void clickRedirectLink() {
        driver.findElement(redirectLink).click();
    }

    public void clickSecureFileDownload() {
        driver.findElement(secureFileDownload).click();
    }

    public void clickShadowDOM() {
        driver.findElement(shadowDOM).click();
    }

    public void clickShiftingContent() {
        driver.findElement(shiftingContent).click();
    }

    public void clickSlowResources() {
        driver.findElement(slowResources).click();
    }

    public void clickSortableDataTables() {
        driver.findElement(sortableDataTables).click();
    }

    public void clickStatusCodes() {
        driver.findElement(statusCodes).click();
    }

    public void clickTypos() {
        driver.findElement(typos).click();
    }

    public void clickWysiwygEditor() {
        driver.findElement(wysiwygEditor).click();
    }
}