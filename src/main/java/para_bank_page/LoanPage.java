package para_bank_page;

import base.CommonClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanPage extends CommonClass {

    Logger log = LogManager.getLogger(LoanPage.class.getName());
    public LoanPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Apply for a Loan')]")
    WebElement loanHeader;
    @FindBy(id = "amount")
    WebElement loanAmount;
    @FindBy(id = "downPayment")
    WebElement downPayment;
    @FindBy(xpath = "//input[@class='button']")
    WebElement applyNowBtn;
    @FindBy(id = "loanStatus")
    WebElement loanStatus;


    public boolean checkHeaderPresence(){
        boolean isHeaderPresence = elementIsDisplayed(loanHeader);
        log.info("\"Apply for a Loan\" header is presence "+isHeaderPresence);
        return isHeaderPresence;
    }
    public void enterLoanAmount(String amount){
        type(loanAmount,amount);
        log.info("Entering loan amount is success.");
    }
    public void enterDownPayment(String down){
        type(downPayment,down);
        log.info("Enter down payment success.");
    }
    public void clickOnApplyNow(){
        clickOn(applyNowBtn);
        log.info("Clicking on Apply Now success");
    }
    public String getLoanStatusText(){
        String statusText = getElementText(loanStatus);
        log.info("Loan request status: "+statusText);
        return statusText;
    }


}
