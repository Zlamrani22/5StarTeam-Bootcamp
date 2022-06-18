package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverOverResearchPage extends CommonAPI {

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


    public HoverOverResearchPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingResearchMenu);}
    public void clickTestDriveReviews(){click(testDriveReviews);}
    public void clickPriceTrends(){click(priceTrends);}
    public void clickTipsAdvice(){click(tipsAdvice);}
    public void clickGeneralQuestions(){click(generalQuestions);}




}