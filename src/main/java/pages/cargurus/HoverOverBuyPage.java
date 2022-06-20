package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverOverBuyPage extends CommonAPI {
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

    public HoverOverBuyPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingBuyMenu);}
    public void clickUsedCar(){click(usedCar);}
    public void clickNewCar(){click(newCar);}
    public void clickCertifiedCars(){click(certifiedCars);}
    public void clickDealershipsNearMe(){click(dealershipsNearMe);}
    public void clickDelivery(){click(delivery);}
    public void clickBuyingACarDuringCoronavirus(){click(buyingACarDuringCoronavirus);}


}
