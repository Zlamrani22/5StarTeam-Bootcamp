package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResearchPage extends CommonAPI {

    @FindBy(xpath = "//span[text()='Research']")
    WebElement floatingResearchMenu;
    @FindBy(xpath = "//span[text()='Test Drive Reviews']")
    WebElement testDriveReviews;
    @FindBy(xpath = "//span[text()='Price Trends']")
    WebElement priceTrends;
    @FindBy(xpath = "//span[text()='Tips & Advice']")
    WebElement tipsAdvice;
    @FindBy(xpath = "//span[text()='General Questions']")
    WebElement generalQuestions;


    public ResearchPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(ResearchPage.class);

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingResearchMenu);
        LOG.info("hover over driver success");}
    public void clickTestDriveReviews(){click(testDriveReviews);
        LOG.info("click test driver success");}
    public void clickPriceTrends(){click(priceTrends);
        LOG.info("click price trends success");}
    public void clickTipsAdvice(){click(tipsAdvice);
        LOG.info("click tips advice success ");}
    public void clickGeneralQuestions(){click(generalQuestions);
        LOG.info("click general question success");}




}