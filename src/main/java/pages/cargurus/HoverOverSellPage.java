package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HoverOverSellPage extends CommonAPI {

    @FindBy(xpath = "//span[text()='Sell']")
    WebElement floatingSellMenu;
    @FindBy(xpath = "//body/div[1]/nav[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
    WebElement sellMyCar;
    @FindBy(xpath = "//span[text()='Car Values']")
    WebElement carValues;
    @FindBy(xpath = "//span[text()='Sell My Car FAQ']")
    WebElement sellMyCarFAQ;
    @FindBy(xpath = "//span[text()='Dealer Signup']")
    WebElement dealerSignup;

    public HoverOverSellPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(HoverOverSellPage.class);

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingSellMenu);
    LOG.info("hover over driver");}
    public void clickSellMyCar(){click(sellMyCar);
        LOG.info("click sell my car");}
    public void clickCarValues(){click(carValues);
        LOG.info("click car values");}
    public void clickSellMyCarFAQ(){click(sellMyCarFAQ);
        LOG.info("click sell my car FAQ");}
    public void clickDealerSignup(){click(dealerSignup);
        LOG.info("click dealer sign up");}


}
