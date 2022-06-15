package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public BusinessBankingPage(WebDriver driver){PageFactory.initElements(driver, this);}


    //money market
    public void clickOnBanking(){click(banking);}
    public void clickOnMoneyMarket(){click(checkingSavingMoneyMarket);}


    //Credit card
    public void clickOnBusinessCreditCard(){click(businessCreditCard);}
    public void clickOnLearnMore(){click(learnMore);}
    public void clickOnContinueBtn(){click(continueBtn);}

    //cash management
    public void clickOnCashManagement(){click(cashManagement);}
    //lending
    public void clickOnLending(){click(lending);}

    //payment solution
    public void clickOnPaymentSolution(){click(paymentSolution);}




}
