package para_bank_page;

import base.CommonClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonClass {
    Logger log = LogManager.getLogger(LoginPage.class.getName());
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//img[@class='logo']")
    WebElement logo;
    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerBtn;
    @FindBy(xpath = "//input[@name='username']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@class='button']")
    WebElement loginBtn;

    public boolean checkPresenceOfLogo(){
        waitFor(1);
        boolean logoIsDisplayed = elementIsDisplayed(logo);
        log.info("Logo presence: "+logoIsDisplayed);
        return logoIsDisplayed;
    }

    public void clickOnRegister(){
        clickOn(registerBtn);
        log.info("clicking on register button is success");
    }
    public void enterUserName(String username){
        type(userNameField,username);
        log.info("Enter username success");
    }
    public void enterPassword(String password){
        waitFor(1);
        type(passwordField,password);
        log.info("Enter password success");
    }
    public void clickOnLoginBtn(){
        waitFor(1);
        clickOn(loginBtn);
        log.info("Clicking on Login button success");
    }


}
