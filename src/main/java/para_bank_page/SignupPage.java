package para_bank_page;

import base.CommonClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends CommonClass {

    Logger log = LogManager.getLogger(SignupPage.class.getName());
    public SignupPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[text()='Signing up is easy!']")
    WebElement title;
    @FindBy(id = "customer.firstName")
    WebElement firstNameField;
    @FindBy(id = "customer.lastName")
    WebElement lastNameField;
    @FindBy(id = "customer.address.street")
    WebElement addressField;
    @FindBy(id = "customer.address.city")
    WebElement cityField;
    @FindBy(id = "customer.address.state")
    WebElement stateField;
    @FindBy(id = "customer.address.zipCode")
    WebElement zipCodeField;
    @FindBy(id = "customer.phoneNumber")
    WebElement phoneNumberField;
    @FindBy(id = "customer.ssn")
    WebElement ssNumberField;
    @FindBy(id = "customer.username")
    WebElement usernameField;
    @FindBy(id = "customer.password")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    WebElement confirmPasswordField;
    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerBtn;

    public boolean checkTitlePresence(){
        boolean isTitlePresence = elementIsDisplayed(title);
        log.info("Title of the page is displayed: "+isTitlePresence);
        return isTitlePresence;
    }
    public void enterFirstName(String firstName){
        type(firstNameField,firstName);
        log.info("Enter first name success.");
    }
    public void enterLastName(String lastName){
        type(lastNameField,lastName);
        log.info("Enter last name in the Last Name field success.");
    }
    public void enterAddress(String address){
        type(addressField,address);
        log.info("Enter address in the Address field success.");
    }
    public void enterCity(String city){
        type(cityField,city);
        log.info("City is entered in the City field.");
    }
    public void enterState(String state){
        type(stateField,state);
        log.info("Enter state in the State field success.");
    }
    public void enterZipCode(String zipCode){
        type(zipCodeField,zipCode);
        log.info("Enter zip code success.");
    }
    public void enterPhoneNumber(String phoneNumber){
        type(phoneNumberField,phoneNumber);
        log.info("Enter phone number success");
    }
    public void enterSSNumber(String ssNumber){
        type(ssNumberField,ssNumber);
        log.info("Enter SSN success");
    }
    public void enterUserName(String userName){
        type(usernameField,userName);
        log.info("Enter userName success");
    }
    public void enterPassword(String password){
        type(passwordField,password);
        log.info("Enter password success");
    }
    public void enterConfirmPassword(String confirmPassword){
        type(confirmPasswordField,confirmPassword);
        log.info("Enter confirm password success");
    }
    public void clickOnRegister(){
        waitFor(1);
        clickOn(registerBtn);
        log.info("Clicking on Register button success");
    }


}
