package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    @FindBy(xpath = "//label[contains(text(),'Text')]")
    WebElement checkBox1;

    @FindBy(xpath = "//*[@id='optclosebtn']/span")
    WebElement xMark;

    //fix user password
    @FindBy(xpath = "//a[text()='Forgot Password']")
    WebElement forgetPassword;

    //protect account
    @FindBy(xpath = "//a[contains(text(),'Security and Fraud')]")
    WebElement securityAndFraud;
    @FindBy(xpath = "//a[text()='How to protect yourself']")
    WebElement protectYourself;

    //download state farm app
    @FindBy(css = "#cc-link4")
    WebElement mobilApp;


    //general question
    @FindBy(xpath = "//*[@name='cc-link9']")
    WebElement viewInsurance;
    @FindBy(xpath = "//*[text()='Billing & Payments FAQs']")
    WebElement generalQuestions;

    //learn about drive safe program
    @FindBy(css = "#cc-link5")
    WebElement driveSafe;

    //read privacy policy
    @FindBy(xpath = "//*[@title='State Farm Privacy and Security']")
    WebElement privacy;

    public HelpAndFixPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(HelpAndFixPage.class);


    //fix user Id
    public void clickOnHelp(){click(help);
        LOG.info("click on help success");}
    public void clickOnForgetUserId(){click(forgetUserId);
        LOG.info("click on forget user id success");}
    public void typePhoneNum(String num){type(phoneNum, num);
        LOG.info("type in phone number success");}
    public void typeDateOfBirth(String dob){type(dateOfBirth,dob);
        LOG.info("type date of birth success");}
    public void typeEmail(String email){type(Email,email);
        LOG.info("type in email success");}
    public void checkBox(){checkBox1.click();
        LOG.info("check box success");}
    public void clickOnXbox(){click(xMark);
        LOG.info("click on x mark success");}


    //fix user password
    public void clickOnForgetPassword(){click(forgetPassword);
        LOG.info("click on forget password success");}

    //protect account
    public void clickOnSecurityAndFraud(){click(securityAndFraud);
        LOG.info("click on security and fraud success");}
    public void clickOnProtectYourself(){click(protectYourself);
        LOG.info("click on protect yourself success");}

    //download state farm app
    public void  clickOnMobileApp(){click(mobilApp);
        LOG.info("click mobile app success");}

    //general question
    public void clickOnViewInsurance(){click(viewInsurance);
        LOG.info("click view insurance success");}
    public void clickOnGeneralQuestions(){click(generalQuestions);
        LOG.info("click general question success");}

    //learn about drive safe program
    public void clickOnDriveSafe(){click(driveSafe);
        LOG.info("click on drive safe success");}

    //read privacy policy
    public void clickOnPrivacyPolicy(){click(privacy);
        LOG.info("click on privacy success");}


  }
