package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessBankingPage  extends CommonAPI {
    //money market
    @FindBy(xpath = "//span[text()='Banking']")
    private WebElement banking ;
    @FindBy(xpath = "//a[text()='Checking, Savings & Money Market']")
    WebElement checkingSavingMoneyMarket;



    //Business Credit card
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[2]/div[2]/section[1]/ul[1]/li[4]/a[1]")
    WebElement businessCreditCard;
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/section[1]/div[1]/div[1]/div[2]/span[1]/a[1]")
    WebElement learnMore;
    @FindBy(css = "#thirdPartyLinkModal-continue")
    WebElement continueBtn;
    //cash management
    @FindBy(xpath="//a[text()='Cash Management']")
    WebElement cashManagement;

    //lending
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[2]/div[2]/section[1]/ul[1]/li[2]/a[1]")
    WebElement lending;

    //payment solution
    @FindBy(xpath = "//a[text()='Payment Solutions']")
    WebElement paymentSolution;
    @FindBy(xpath = "//a[contains(text(),'Find a solution with U.S. Bank')]")
    WebElement findSolution;

    public BusinessBankingPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(BusinessBankingPage.class);


    //money market
    public void clickOnBanking(){click(banking);
        LOG.info("click on banking success");}
    public void clickOnMoneyMarket(){click(checkingSavingMoneyMarket);
        LOG.info("click on money market success");}


    //Credit card
    public void clickOnBusinessCreditCard(){click(businessCreditCard);
        LOG.info("click on business credit card success");}
    public void clickOnLearnMore(){click(learnMore);
        LOG.info("click on lean more success");}
    public void clickOnContinueBtn(){click(continueBtn);
        LOG.info("click on continue button success");}

    //cash management
    public void clickOnCashManagement(){click(cashManagement);
        LOG.info("click on cash management success");}
    //lending
    public void clickOnLending(){click(lending);
        LOG.info("click on lending success");}

    //payment solution
    public void clickOnPaymentSolution(){click(paymentSolution);
        LOG.info("click payment solution success");}
    public void clickOnFindSolution(){click(findSolution);
        LOG.info("click find agent success");}




}
