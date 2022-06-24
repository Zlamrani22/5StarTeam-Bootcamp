package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeInsurancePage  extends CommonAPI {

    //Home insurance
    @FindBy(xpath = "//span[text()='Insurance']")
    private WebElement insurance;
    @FindBy(css = "#oneX-1-insurance")
    WebElement home;
    @FindBy(css = "#quote-main-zip-code-input")
    WebElement zipCode;
    @FindBy(css = "#quote-main-zip-code-button-1")
    WebElement startQuote;

    //articles insurance
    @FindBy(xpath = "//*[text()='Personal Articles']")
    WebElement personalArticles;
    @FindBy(xpath = "//*[@class='-oneX-textfield__input find-agent_zip']")
    WebElement zip;

    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement findAgent1;

    //farm and ranch
    @FindBy(xpath = "//a[text()='Farm and Ranch']")
    WebElement ranchAndFarm;
    @FindBy(xpath = "//*[@id='quote-main-zip-code-button1']")
    WebElement findAgent;

    public HomeInsurancePage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(HomeInsurancePage.class);

    //get home insurance
    public void clickOnInsurance(){click(insurance);
        LOG.info("click on insurance success");}
    public void clickOnHome(){click(home);
        LOG.info("click on home success");}
    public void typeInZipCode(String zip){type(zipCode, zip);
        LOG.info("");}
    public void clickOnStartQuote(){click(startQuote);
        LOG.info("click on start quote success");}

    //articles insurance
    public void clickOnPersonalArticles(){click(personalArticles);
        LOG.info("click on personal article success");}
    public void clickOnFindAgent1(){click(findAgent1);
        LOG.info("click on find agent success");}

    public void typeZip(String zip1){type(zip, zip1);
        LOG.info("type zip code success");}

    //farm and ranch
    public void clickOnFarmAndRanch(){click(ranchAndFarm);
        LOG.info("click on ranch and farm success");}
    public void clickOnFindAgent(){click(findAgent);
        LOG.info("click on find agent success");}

}
