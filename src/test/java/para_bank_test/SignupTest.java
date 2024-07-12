package para_bank_test;

import base.CommonClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import para_bank_page.HomePage;
import para_bank_page.LoginPage;
import para_bank_page.SignupPage;
import utility.FakeInformation;
import utility.Utility;

import java.util.Properties;

public class SignupTest extends CommonClass {
    Logger log = LogManager.getLogger(SignupTest.class.getName());
    Properties properties = Utility.loadProperties();
    static FakeInformation fakeInformation = new FakeInformation();
    public static String userName = fakeInformation.getUserName();
    public static String password = fakeInformation.getPassword();


    @Test(priority = 0,enabled = true,groups = {"Smoke"})
    public void tc_001_registerButton() {
        LoginPage loginPage = new LoginPage(getDriver());
        SignupPage signupPage = new SignupPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        loginPage.checkPresenceOfLogo();
        Assert.assertTrue(loginPage.checkPresenceOfLogo());
        log.info("Validation of presence of Logo success");
        loginPage.clickOnRegister();
        Assert.assertTrue(signupPage.checkTitlePresence());
        log.info("Presence of Title is true");
        signupPage.enterFirstName(fakeInformation.getFirstName());
        signupPage.enterLastName(fakeInformation.getLastName());
        signupPage.enterAddress(fakeInformation.getAddress());
        signupPage.enterCity(fakeInformation.getCity());
        signupPage.enterState(fakeInformation.getState());
        signupPage.enterZipCode(fakeInformation.getZipCode());
        waitFor(1);
        signupPage.enterPhoneNumber(fakeInformation.getPhoneNumber());
        signupPage.enterSSNumber(fakeInformation.getSsnNumber());

        waitFor(1);
        signupPage.enterUserName(userName);
        signupPage.enterPassword(password);
        signupPage.enterConfirmPassword(password);
        signupPage.clickOnRegister();
        Assert.assertTrue(homePage.checkWelcomeMsgPresence());
        log.info("This is END of \"tc_001_registerButton\"");
        log.info("User-> " + userName);
        log.info("Pass-> " + password);


    }

}
