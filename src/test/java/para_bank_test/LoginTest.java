package para_bank_test;

import base.CommonClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import para_bank_page.AccountOverviewPage;
import para_bank_page.LoanPage;
import para_bank_page.LoginPage;
import utility.FakeInformation;

public class LoginTest extends CommonClass {
    Logger log = LogManager.getLogger(LoginTest.class.getName());
    SignupTest signupTest = new SignupTest();
    FakeInformation fakeInformation = new FakeInformation();


    @Test(priority = 1,enabled = true,groups = {"Smoke"})
    public void tc_002_login() {
        LoginPage loginPage = new LoginPage(getDriver());
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage(getDriver());
        Assert.assertTrue(loginPage.checkPresenceOfLogo());
        log.info("Validation of checking logo presence is true.");

        waitFor(1);
        loginPage.enterUserName(signupTest.userName);
        loginPage.enterPassword(signupTest.password);
        waitFor(1);
        loginPage.clickOnLoginBtn();
        Assert.assertTrue(accountOverviewPage.checkHeaderPresence());
        log.info("Validation of title presence true");
        log.info("This is END of \"tc_002_login\"");
    }
    @Test(priority = 2,enabled = true,groups = {"Sanity"})
    public void tc_003_requestLoan(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterUserName(signupTest.userName);
        loginPage.enterPassword(signupTest.password);
        waitFor(1);
        loginPage.clickOnLoginBtn();
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage(getDriver());
        accountOverviewPage.clickLoanRequest();
        LoanPage loanPage = new LoanPage(getDriver());
        loanPage.checkHeaderPresence();
        waitFor(1);
        loanPage.enterLoanAmount(Integer.toString(fakeInformation.getLoanAmount()));
        loanPage.enterDownPayment(Integer.toString(fakeInformation.getDownPayment()));
        waitFor(1);
        loanPage.clickOnApplyNow();
        waitFor(1);
        loanPage.getLoanStatusText();
        waitFor(5);
        log.info("This is the END of \"tc_003_requestLoan\"");


    }

}
