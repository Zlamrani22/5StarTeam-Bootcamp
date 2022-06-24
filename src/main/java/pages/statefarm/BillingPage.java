package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BillingPage extends CommonAPI {

    //pay bill using Phone Number
    @FindBy(xpath = "//span[text()='Pay a Bill']")
    private WebElement payBill;
    @FindBy(css = "#pay-a-bill-paymentSelect")
    private WebElement phoneNumber;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement phoneNum;
    @FindBy(xpath = "//input[@name='dob']")
    private WebElement dateOfBirth;
    @FindBy(css = "#pay-a-bill-submitButton")
    private WebElement payNowBtn;

    //pay bill using invalid policy number

    @FindBy(css = "#pay-a-bill-policyNumber")
    WebElement policyNumber;
    @FindBy(css = "#pay-a-bill-policy-zip")
    WebElement zipCode;
    @FindBy(xpath = "//h1[@class='-oneX-heading--h1']")
    WebElement headerText;


    public BillingPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(BillingPage.class);


    //pay bill using Phone Number
    public void clickOnPayBill() {click(payBill);
    LOG.info("click pay bill success");}
    public void selectOptionFromMenuDropdown(String option) {selectFromDropdown(phoneNumber, option);
        LOG.info("select from drop down success");}
    public void typePhoneNum(String phNum){type(phoneNum, phNum);
        LOG.info("type phone number success");}
    public void typeDateOfBirth(String DOB){type(dateOfBirth, DOB);
        LOG.info("type date of birth success");}
    public void clickOnPayNowBtn(){click(payNowBtn);
        LOG.info("click pay now success");}


    //pay bill using invalid policy number
    public void typePolicyNumber(String num){type(policyNumber, num);
        LOG.info("type policy number success");}

    public void typeZipCode(String zip){type(zipCode,zip);
        LOG.info("type zip code success");}
    public String getHeaderText(){return getElementText(headerText);}

}
