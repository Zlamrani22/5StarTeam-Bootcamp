package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage extends CommonAPI {

    //pay bill
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
    public BillingPage(WebDriver driver){PageFactory.initElements(driver, this);}


    //bill
    public void clickOnPayBill() {click(payBill);}
    public void selectOptionFromMenuDropdown(String option) {selectFromDropdown(phoneNumber, option);}
    public void typePhoneNum(String phNum){type(phoneNum, phNum);}
    public void typeDateOfBirth(String DOB){type(dateOfBirth, DOB);}
    public void clickOnPayNowBtn(){click(payNowBtn);}


}
