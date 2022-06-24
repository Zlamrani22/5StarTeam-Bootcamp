package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MutualFundPage  extends CommonAPI {

    //Type of accounts
    @FindBy(xpath = "//ul[@class='-oneX-header-main-nav-menu']/li[3]")
    WebElement investments;
    @FindBy(xpath = "//a[text()='Types of Accounts']")
    WebElement typeOfAccounts;
    @FindBy(xpath = "//h1[contains(text(),'Traditional IRA')]")
    WebElement headerTextAccount;
    @FindBy(xpath = "//a[text()='Traditional IRAs']")
    WebElement traditionalIra;

    //learn about funds
    @FindBy(xpath = "//a[text()='Selecting a Fund']")
    WebElement selectFunds;
    @FindBy(xpath = "//h1[text()=' Establishing your investment goals '] ")
    WebElement headerTextFunds;


    public MutualFundPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(MutualFundPage.class);


    //Type of accounts
    public void clickOnInvestment(){click(investments);
        LOG.info("click on investment success");}
    public void clickOnTypeOfAccounts(){click(typeOfAccounts);
        LOG.info("click on type of account success");}
    public String getHeaderText(){return getElementText(headerTextAccount);}
    public void clickOnTraditionalIra(){click(traditionalIra);
        LOG.info("click on traditional ira success");}

    //learn about funds
    public void clickOnSelectFunds(){click(selectFunds);
        LOG.info("click on select fund success");}
    public String getHeaderTextFunds(){return getElementText(headerTextFunds);}



}
