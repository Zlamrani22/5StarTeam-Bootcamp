package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonalBankingPage  extends CommonAPI {
    //checkingAC
    @FindBy(xpath = "//span[text()='Banking']")
    private WebElement Banking ;
    @FindBy(xpath = "//*[@id='oneX-submenu-banking']/div/div/div[1]/section/ul[1]/li[1]/a")
    private WebElement checking;

    @FindBy(xpath = "//a[contains(text(),'Compare checking accounts')]")
    WebElement compareAccounts;

    //HomeLoan
    @FindBy(xpath = "//a[text()='Home Loans']")
    private WebElement homeLoan;

    //credit card
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[2]/div[2]/section[1]/ul[1]/li[4]/a[1]")
    WebElement creditCard;
    @FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/p[2]/span[1]/a[1]")
    WebElement learnMore;
    @FindBy(css = "#thirdPartyLinkModal-continue")
    WebElement Continue;

    //saving
    @FindBy(xpath = "//a[text()='Savings']")
    WebElement saving;

    @FindBy(xpath = "//a[contains(text(),'Compare savings accounts')]")
    WebElement compareSaving;

    //a[@class='-oneX-btn-primary__anchor']
    public PersonalBankingPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(PersonalBankingPage.class);

    //checking account
    public void clickOnBanking(){click(Banking);
        LOG.info("click on banking success");}
    public void clickOnChecking() {click(checking);
        LOG.info("click on checking success");}
    public void clickOnCompareAccounts(){click(compareAccounts);
        LOG.info("click on compare accounts success");}

    //home loan
    public void clickOnHomeLoan(){click(homeLoan);
        LOG.info("click on home loan success");}

    //credit card
    public void clickOnCreditCard(){click(creditCard);
        LOG.info("click on credit card success");}
    public void clickOnLearnMore(){click(learnMore);
        LOG.info("click on learn more success");}
    public void clickOnContinueBtn(){click(Continue);
        LOG.info("click on continue success");}

    //saving
    public void clickOnSaving(){click(saving);
        LOG.info("click on saving success ");}
    public void clickOnCompareSaving(){click(compareSaving);
        LOG.info("click on compare saving success");}


}
