package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingSellMenu);}
    public void clickSellMyCar(){click(sellMyCar);}
    public void clickCarValues(){click(carValues);}
    public void clickSellMyCarFAQ(){click(sellMyCarFAQ);}
    public void clickDealerSignup(){click(dealerSignup);}


}
