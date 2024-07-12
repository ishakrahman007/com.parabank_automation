package para_bank_page;

import base.CommonClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountOverviewPage extends CommonClass {
    Logger log = LogManager.getLogger(AccountOverviewPage.class.getName());
    public AccountOverviewPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Accounts Overview')]")
    WebElement accountOverviewHeader;
    @FindBy(xpath = "//a[text()='Request Loan']")
    WebElement requestLoan;


    public boolean checkHeaderPresence(){
        boolean isHeaderPresence = elementIsDisplayed(accountOverviewHeader);
        log.info("\"Account Overview\" header is presence: "+isHeaderPresence);
        return isHeaderPresence;
    }
    public void clickLoanRequest(){
        clickOn(requestLoan);
        log.info("Clicking on Loan Request success");
    }

}
