package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HealthInsurancePage extends CommonAPI {

    @FindBy(xpath = "//span[text()='Insurance']")
    private WebElement insurance;

    //medical supplement
    @FindBy(xpath = "//a[text()='Medicare Supplement']")
    WebElement medicalSupplement;
    @FindBy(xpath = "//select[@name='productName']")
    WebElement stateOption;
    @FindBy(xpath = "//*[@name='productName']")
    WebElement goBtn;

    //individual medical
    @FindBy(xpath = "//*[@id='oneX-submenu-insurance']/div/div/div[5]/section[1]/ul/li[3]")
    WebElement individualHealth;
    @FindBy(css = "#sState")
    WebElement states;
    @FindBy(css = "#sState_button")
    WebElement goBox;

    public HealthInsurancePage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(HealthInsurancePage.class);

    //medical supplement
    public void clickOnInsurance(){click(insurance);
    LOG.info("click on insurance success");}
    public void clickOnMedicalSupplement(){click(medicalSupplement);
        LOG.info("click on medical supplement success");}
    public void selectFromDropDown(String state){selectFromDropdown(stateOption, state);
        LOG.info("select from drop down success");}
    public void clickOnGoBtn(){click(goBtn);
        LOG.info("click on go button success");}

    //individual medical
    public void clickOnIndividualMedical(){click(individualHealth);
        LOG.info("click on individual medical success");}
    public void selectFromStateDropDown(String st){selectFromDropdown(states, st);
        LOG.info("select from state drop down success");}
    public void clickOnGoBox(){click(goBox);
        LOG.info("click on go box success");}



}
