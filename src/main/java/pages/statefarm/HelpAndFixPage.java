package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpAndFixPage extends CommonAPI {
    //fix user Id
    @FindBy(xpath = "//*[text()='Help']")
    WebElement help;
    @FindBy(css = "#btn1")
    WebElement forgetUserId;
    @FindBy(css = "#forgotPhoneInput")
    WebElement phoneNum;
    @FindBy(css = "#forgotDobInput")
    WebElement dateOfBirth;
    @FindBy(xpath = "//*[@id='forgotEmailInput']")
    WebElement Email;
    @FindBy(xpath = "//div[@class='-oneX']")
    WebElement checkBox1;

    @FindBy(xpath = "//*[@id='optclosebtn']")
    WebElement xMark;

    //fix user password
    @FindBy(xpath = "//a[text()='Forgot Password']")
    WebElement forgetPassword;

    //protect account
    @FindBy(xpath = "//a[text()='Security and Fraud']")
    WebElement securityAndFraud;
    @FindBy(xpath = "//a[text()='How to protect yourself']")
    WebElement protectYourself;

    //download state farm app
    @FindBy(css = "#cc-link4")
    WebElement mobilApp;
    @FindBy(xpath ="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/p[4]/a[2]/img[1]")
    WebElement playStore;

    //general question
    @FindBy(xpath = "//*[@name='cc-link9']")
    WebElement viewInsurance;
    @FindBy(xpath = "//*[text()='Billing & Payments FAQs']")
    WebElement generalQuestions;

    public HelpAndFixPage(WebDriver driver){PageFactory.initElements(driver, this);}


    //fix user Id
    public void clickOnHelp(){click(help);}
    public void clickOnForgetUserId(){click(forgetUserId);}
    public void typePhoneNum(String num){type(phoneNum, num);}
    public void typeDateOfBirth(String dob){type(dateOfBirth,dob);}
    public void typeEmail(String email){type(Email,email);}
    public void checkBox(){checkBox1.click();}
    public void clickOnXbox(){click(xMark);}

    //fix user password
    public void clickOnForgetPassword(){click(forgetPassword);}

    //protect account
    public void clickOnSecurityAndFraud(){click(securityAndFraud);}
    public void clickOnProtectYourself(){click(protectYourself);}

    //download state farm app
    public void  clickOnMobileApp(){click(mobilApp);}
    public void clickOnPlayStore(){click(playStore);}

    //general question
    public void clickOnViewInsurance(){click(viewInsurance);}
    public void clickOnGeneralQuestions(){click(generalQuestions);}




  }
