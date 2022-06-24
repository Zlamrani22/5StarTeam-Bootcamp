package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LifeInsurancePage  extends CommonAPI {

    //life insurance
    @FindBy(xpath = "//span[text()='Insurance']")
    private WebElement insurance;
    @FindBy(css="#oneX-3-insurance")
    private WebElement life;
    @FindBy(css = "#quote-main-state-select")
    private WebElement state;
    @FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/button[1]")
    WebElement go;

    //universal insurance
    @FindBy(xpath = "//*[text()='Universal Life']")
    WebElement universalInsurance;
    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement zipCode;
    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement goBtn;

    //change beneficiary
    @FindBy(xpath = "//a[contains(text(),'Change Beneficiary')]")
    WebElement changeBeneficiary;




    public LifeInsurancePage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(LifeInsurancePage.class);



    //get Life insurance
    public void clickOnInsurance(){click(insurance);
        LOG.info("click on insurance success");}
    public void clickOnLife(){click(life);
        LOG.info("click on life success");}
    public void selectFromDropDown(String st){selectFromDropdown(state, st);
        LOG.info("select from down success");}
    public void clickOnGo(){click(go);
        LOG.info("click on go button success");}

    //universal insurance
    public void clickOnUniversalInsurance(){click(universalInsurance);
        LOG.info("click on universal insurance");}
    public void typeZipCode(String zip){type(zipCode, zip);
        LOG.info("type zip code success");}
    public void clickOnGoBtn(){click(goBtn);
        LOG.info("click on go button success");}

    //change beneficiary
    public void clickOnChangeBeneficiary(){click(changeBeneficiary);
        LOG.info("click on change beneficiary success");}


}
