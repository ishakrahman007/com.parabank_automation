package para_bank_page;

import base.CommonClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonClass {
    Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),\"Welcome\")]")
    WebElement registerWelcomeMsg;



    public boolean checkWelcomeMsgPresence(){
        boolean isWelcomePresence = elementIsDisplayed(registerWelcomeMsg);
        log.info("Welcome message is presence: "+isWelcomePresence);
        return isWelcomePresence;
    }


}
