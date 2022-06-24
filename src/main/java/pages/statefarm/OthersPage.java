package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class OthersPage extends CommonAPI {
    //go paperless
    @FindBy(xpath ="//a[contains(text(),'Go paperless')]")
    WebElement goPaperLessBtn;
    @FindBy( css = "#phoneNumber-input")
    WebElement  phoneNumber;      ;
    @FindBy(css = "#dob-input")
    WebElement dateOfBirth;       ;
    @FindBy( css = "#auth-primary-button")
    WebElement continueButton;

    //auto pay
    @FindBy(xpath = "//*[text()='No login required']/following-sibling::ul/li[2]")
    WebElement autoPay;
    @FindBy(css = "#liteAuthCustomerPhoneNumber")
    WebElement phoneNum;
    @FindBy(css = "#liteAuthCustomerDateOfBirth")
    WebElement birthday;
    @FindBy(xpath = "//*[@id='continueBtn']")
    WebElement continueBtn;


    //Change language
    @FindBy(xpath = "//span[text()='Español']")
    WebElement language;


    //get list of option from bill pay
    @FindBy(xpath = "//span[text()='Pay a Bill']")
    WebElement payBill;
    @FindBy(css = "#pay-a-bill-paymentSelect")
    WebElement billDropdown;


    // get list of option from quote
    @FindBy(xpath = "//*[text()='Get a Quote']")
    WebElement getQuote;
    @FindBy(css = "#getaquote-select-product")
    WebElement quoteDrop;


    //check if logo is present.
    @FindBy(css = "#oneX-sf-logo")
    WebElement stateFarmLogo;


    public OthersPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(OthersPage.class);


    //goPaperLess
    public void clickOnPaperLess(){click(goPaperLessBtn);
        LOG.info("click on paper less success");}
    public void typePhoneNum(String Num){type(phoneNumber, Num);
        LOG.info("type phone number success");}
    public void typeDateOfBirth(String Dob) {type(dateOfBirth, Dob);
        LOG.info("type date of birth success");
    }
    public void clickOnContinue(){click(continueButton);
        LOG.info("click on continue button success");}


    //auto pay
    public void clickOnAutoPay(){click(autoPay);
        LOG.info("click on auto pay success");}
    public void typePhoneNum2(String number){type(phoneNum, number);
        LOG.info("type phone number success");}
    public void typeBirthday(String DOB){type(birthday, DOB);
        LOG.info("type birthday success");}
    public void clickOnContinueBtn(){click(continueBtn);
        LOG.info("click on continue button success");}


    //change language
    public void clickOnLanguage(){click (language);
        LOG.info("click on language success");}


    //get list of option from bill pay.
    public void clickOnPayBill(){click(payBill);
        LOG.info("click on pay bill success");}
    public void selectOptionBillPayDropdown(String option){selectFromDropdown(billDropdown, option);
        LOG.info("select from bill pay drop down success");}
    public List<String> getOthersPageDropdownOptions(){
        List<String> options = new ArrayList<>();
        List<WebElement> elements = getDropDownOptions(billDropdown);
        for (WebElement element:elements) {
            options.add(element.getText());
        }
        return options;
    }

    public void clickOnGetQuote(){click(getQuote);
        LOG.info("click on get quote success");}

    public void selectOtherPageQuoteDropDown(String option){selectFromDropdown(quoteDrop,option);
        LOG.info("select from drop down success");}

    public List<String> getOthersPageQuoteDropdownOptions(){
        List<String> options = new ArrayList<>();
        List<WebElement> elements = getDropDownOptions(quoteDrop);
        for (WebElement element:elements) {
            options.add(element.getText());
        }
        return options;
    }

    //check if logo is present
    public void clickOnLogo(){click(stateFarmLogo);
        LOG.info("click on stat farm logo success");}
    public boolean checkLogoIsPresent(){return isPresent(stateFarmLogo);}

   }
