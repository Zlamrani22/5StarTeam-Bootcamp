package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    //pay bill using Phone Number
    public void clickOnPayBill() {click(payBill);}
    public void selectOptionFromMenuDropdown(String option) {selectFromDropdown(phoneNumber, option);}
    public void typePhoneNum(String phNum){type(phoneNum, phNum);}
    public void typeDateOfBirth(String DOB){type(dateOfBirth, DOB);}
    public void clickOnPayNowBtn(){click(payNowBtn);}

    //pay bill using invalid policy number
    public void typePolicyNumber(String num){type(policyNumber, num);}
    public void typeZipCode(String zip){type(zipCode,zip);}
    public String getHeaderText(){return getElementText(headerText);}

}
