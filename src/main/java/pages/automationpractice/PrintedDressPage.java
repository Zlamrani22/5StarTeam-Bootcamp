package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintedDressPage extends CommonAPI {

    @FindBy(css = "a[id='send_friend_button']")
    public WebElement sendToAFriendLink;

    @FindBy(css = "a[id='send_friend_button']")
    public WebElement sendToAFriendCloseButton;

    @FindBy(css = "span[class='continue btn btn-default button exclusive-medium']")
    public WebElement continueShoppingButton;

    @FindBy(css = "a[class='color_pick']")
    public WebElement pinkColorCheckBox;

    @FindBy(xpath = "//*[@id='add_to_cart']/button/span")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='header']//div[3]//div[3]/div/a/b")
    public WebElement cartButton;

    @FindBy(xpath = "//*[@id='4_43_0_0']/i")
    public WebElement trashIcon;

    @FindBy(css = "span[class='ajax_cart_product_txt unvisible']")
    public WebElement shoppingCartButton;

    public PrintedDressPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickSendToAFriendLink(){
        click(sendToAFriendLink);
    }

    public void clickSendToAFriendCloseButton(){
        click(sendToAFriendCloseButton);
    }

    public void clickContinueShopping(){
        click(continueShoppingButton);
    }

    public void clickPinkColorCheckBox(){
        click(pinkColorCheckBox);
    }

    public void clickAddToCart(){
        click(addToCartButton);
    }

    public void clickTrashIcon(){
        click(cartButton);
    }

    public ShoppingCartPage clickShoppingCart(){
        click(shoppingCartButton);
        return new ShoppingCartPage(getDriver());
    }
}
