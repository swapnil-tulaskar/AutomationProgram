package tests;

import org.testng.annotations.*;
import base.BaseTest;
import Page.*;

public class AddAlumniTest extends BaseTest {
    private LoginPage login;
    private PortalPage portal;
    private AddAlumniPage page;

    @BeforeClass
    public void setup() {
        // driver is already initialized by BaseTest
        login = new LoginPage(driver);
        login.login("9423755253", "9423755253");

        portal = new PortalPage(driver);
        portal.openAlumniMenu();
        portal.clickAddAlumni();
        page = new AddAlumniPage(driver);
    }

    @Test(dataProvider = "alumniData", dataProviderClass = TestData.class)
    public void testAddAlumni(String abbreviation, String fname, String mname, String lname,
                              String gender, String dob, String regNo, String classname,
                              String admission, String address, String pin, String loc) {
        page.enterAbbreviation(abbreviation);
        page.enterFirstName(fname);
        page.enterMiddleName(mname);
        page.enterLastName(lname);
        page.enterGender(gender);
        page.enterDOB(dob);
        page.enterRegisterNo(regNo);
        page.selectClassName(classname);
        page.selectAdmissionYear(admission);
        page.enterAddress(address);
        page.enterPincode(pin);
        page.selectLocality(loc);
        page.clickSave();

        // Prepare for next row if using DataProvider
        portal.openAlumniMenu();
        portal.clickAddAlumni();
    }
}