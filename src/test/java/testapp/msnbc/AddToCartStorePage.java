package testapp.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddToCartStorePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AddToCartStorePage.class);

    @FindBy(css = "div[class='grid-product__color-image grid-product__color-image--39517818290330 small--hide']")
    private WebElement logoMug;

    @FindBy(css = "div[class='grid-product__color-image grid-product__color-image--35684997202074 small--hide']")
    private WebElement maddowShowShirt;

    @FindBy(css = "div[class='drawer__header appear-animation appear-delay-1']")
    private WebElement checkoutPageLogo;

    @FindBy(css = "button[class='btn btn--full add-to-cart']")
    private WebElement addToCart;

    @FindBy(css = "button[class='btn btn--full cart__checkout']")
    private WebElement checkout;

    public AddToCartStorePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void selectLogoMug(){
        click(logoMug);
        LOG.info("Clicked on Logo Mug success");
    }

    public void clickRachelMaddowLogoTee(){
        click(maddowShowShirt);
        LOG.info("Clicked on Maddow Logo Tee success");
    }

    public boolean checkoutPageLogoDisplayed(){
        isPresent(checkoutPageLogo);
        LOG.info("Checkout page opened success");
        return true;
    }

    public void addToCartBtn(){
        click(addToCart);
        LOG.info("Item added to cart success");
    }

    public void checkoutBtn(){
        click(checkout);
        LOG.info("Checkout button clicked success");
    }







}
