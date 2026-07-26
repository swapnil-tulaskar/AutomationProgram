package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.ContacUsFormPage;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

public class ContactUsFormTest extends BaseTest{
	
	@Test
	public void checkContactFormWorking() throws Throwable{
		HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        ContacUsFormPage confo = new ContacUsFormPage(driver);
        // Login
        home.clickSignUpSignInLogin();
        login.signInEntry(
                ConfigReader.getProperty("reg_email"),
                ConfigReader.getProperty("reg_password")
        );
      
        
        home.clickContactUsForm();
        confo.getIntouch(
        		ConfigReader.getProperty("reg_name"),
        		ConfigReader.getProperty("reg_email"),
        		ConfigReader.getProperty("sub_data"),
        		ConfigReader.getProperty("msg_data"),
        		ConfigReader.getProperty("file_path"));
        Alert alt = driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.accept();
     
       Assert.assertTrue(confo.isStatusTextShow(), " success message not display");
       Assert.assertEquals(confo.StatusTextshow(),"Success! Your details have been submitted successfully.");
       
       confo.returnhome();
       
        
	}

}
