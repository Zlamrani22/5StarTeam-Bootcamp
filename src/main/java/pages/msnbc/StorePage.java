package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage extends CommonAPI {

    @FindBy(css = "div[class='grid-product__color-image grid-product__color-image--39517818290330 small--hide']")
    private WebElement logoMug;

    @FindBy(css = "button[class='btn btn--full add-to-cart']")
    private WebElement addToCart;

    @FindBy(css = "button[class='btn btn--full cart__checkout']")
    private WebElement checkout;

    public StorePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void selectLogoMug(){
        click(logoMug);
    }

    public void addToCartBtn(){
        click(addToCart);
    }

    public void checkoutBtn(){
        click(checkout);
    }







}
