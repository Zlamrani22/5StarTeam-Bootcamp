package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
    WebElement xBox;

    //auto pay
    @FindBy(xpath = "")
    WebElement autoPay;


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


    //goPaperLess
    public void clickOnPaperLess(){click(goPaperLessBtn);}
    public void typePhoneNum(String Num){type(phoneNumber, Num);}
    public void typeDateOfBirth(String Dob) {
        type(dateOfBirth, Dob);
    }
    public void clickOnContinue(){
        click(continueButton);
    }
    public void clickOnXbox(){click(xBox);}

    //auto pay
    public void clickOnAutoPay(){click(autoPay);}

    //change language
    public void clickOnLanguage(){click (language);}

    //get list of option from bill pay.
    public void clickOnPayBill(){click(payBill);}
    public void selectOptionBillPayDropdown(String option){selectFromDropdown(billDropdown, option);}
    public List<String> getOthersPageDropdownOptions(){
        List<String> options = new ArrayList<>();
        List<WebElement> elements = getDropDownOptions(billDropdown);
        for (WebElement element:elements) {
            options.add(element.getText());
        }
        return options;
    }

    public void clickOnGetQuote(){click(getQuote);}
    public void selectOtherPageQuoteDropDown(String option){selectFromDropdown(quoteDrop,option);}

    public List<String> getOthersPageQuoteDropdownOptions(){
        List<String> options = new ArrayList<>();
        List<WebElement> elements = getDropDownOptions(quoteDrop);
        for (WebElement element:elements) {
            options.add(element.getText());
        }
        return options;
    }

    //check if logo is present

    public void clickOnLogo(){click(stateFarmLogo);}
    public boolean checkLogoIsPresent(){
        return isPresent(stateFarmLogo);
    }

   }
