package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuyPage extends CommonAPI {
    @FindBy(xpath = "//span[text()='Buy']")
    WebElement floatingBuyMenu;
    @FindBy(xpath = "//span[text()='Used Cars']")
    WebElement usedCar;
    @FindBy(xpath = "//span[text()='New Cars']")
    WebElement newCar;
    @FindBy(xpath = "//span[text()='Certified Cars']")
    WebElement certifiedCars;
    @FindBy(xpath = "//span[text()='Dealerships Near Me']")
    WebElement dealershipsNearMe;
    @FindBy(xpath = "//span[text()='Delivery']")
    WebElement delivery;
    @FindBy(xpath = "//span[text()='Buying a Car During Coronavirus']")
    WebElement buyingACarDuringCoronavirus;

    public BuyPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    private final Logger LOG = LoggerFactory.getLogger(BuyPage.class);

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingBuyMenu);
        LOG.info("hover over driver success");}
    public void clickUsedCar(){click(usedCar);
        LOG.info("click used car success");}
    public void clickNewCar(){click(newCar);
        LOG.info("click new car success");}

    public void clickCertifiedCars(){click(certifiedCars);
        LOG.info("click certified cars success");}
    public void clickDealershipsNearMe(){click(dealershipsNearMe);
        LOG.info("click dealership near me success");}
    public void clickDelivery(){click(delivery);
        LOG.info("click delivery success");}
    public void clickBuyingACarDuringCoronavirus(){click(buyingACarDuringCoronavirus);
        LOG.info("click buyin car during corona success");}


}
