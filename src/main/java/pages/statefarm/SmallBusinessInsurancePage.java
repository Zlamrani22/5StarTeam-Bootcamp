package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmallBusinessInsurancePage extends CommonAPI {

    //workers compensation
    @FindBy(xpath = "//span[text()='Insurance']")
    private WebElement insurance;
    @FindBy(xpath = "//*[text()='Workers’ Compensation']")
    WebElement workersCompensation;
    @FindBy(xpath = "//*[text()=' Have an agent contact me']")
    WebElement haveAgentContactMe;
    @FindBy(css = "#first-name")
    WebElement firstName;
    @FindBy(css = "#last-name")
    WebElement lastName;
    @FindBy(css = "#email")
    WebElement email;


    public SmallBusinessInsurancePage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(SmallBusinessInsurancePage.class);

    //workers compensation
    public void clickOnInsurance(){click(insurance);
        LOG.info("click on insurance success");}
    public void clickOnWorkerCompensation(){click(workersCompensation);
        LOG.info("click on worker compensation success");}
    public void clickOnHaveAgentContactMe(){click(haveAgentContactMe);
        LOG.info("click on have agent contact me success");}
    public void typeFirstName(String first){type(firstName, first);
        LOG.info("type first name success");}
    public void typeLastName(String last){type(lastName,last);
        LOG.info("type last name success");}
    public void typeEmail(String eml){type(email, eml);
        LOG.info("type email success");}



}
