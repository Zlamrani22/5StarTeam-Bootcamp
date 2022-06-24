package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealEstatePage extends CommonAPI {

    //learn about trust
    @FindBy(xpath = "//ul[@class='-oneX-header-main-nav-menu']/li[3]")
    WebElement investments;
    @FindBy(xpath = "//*[text()='Trusts']")
    WebElement trust;
    @FindBy(xpath = "//*[text()=' What is a trust? ']")
    WebElement headerText;

    //learn about federal taxes
    @FindBy(xpath = "//*[text()='Federal Estate Tax']")
    WebElement federalTax;
    @FindBy(xpath = "//*[text()=' Federal estate taxes ']")
    WebElement headerTextTax;

    //learn about join accounts
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[3]/section[1]/div[1]/div[2]/div[4]/section[1]/ul[1]/li[2]/a[1]")
     WebElement joinAccount;


    public RealEstatePage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(RealEstatePage.class);


    //learn about trust
    public void clickOnInvestment(){click(investments);
        LOG.info("click on investment success");}
    public void clickOnTrust(){click(trust);
        LOG.info("click on trust success");}
    public String getHeaderText(){return getElementText(headerText);}

    //learn about federal taxes
    public void clickOnFederalTax(){click(federalTax);
        LOG.info("click on federal tax success");}
    public String getHeaderTextTax(){return getElementText(headerTextTax);}

    //learn about join account
    public void clickOnJoinAccount(){click(joinAccount);
        LOG.info("click on join account account success");}


    }




