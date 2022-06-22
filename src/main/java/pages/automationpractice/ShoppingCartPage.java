package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShoppingCartPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ShoppingCartPage.class);

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    public WebElement dressesButton;

    @FindBy(xpath = "//*[@id='ul_layered_category_0']/li[1]")
    public WebElement casualDressesButton;

    @FindBy(css= "input[id='layered_id_attribute_group_1'")
    public WebElement smallCheckBox;

    @FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")
    public WebElement printedDressButton;

    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(css = "a[id='4_43_0_0']")
    public WebElement trashIcon;

    @FindBy(css = "a[title='Continue shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@id='ul_layered_id_feature_6']/li/label/a")
    public WebElement girlyStyleCheckBox;

    @FindBy(css = "a[title='Add to cart']")
    public WebElement girlyStyleAddToCartButton;

    @FindBy(xpath = "//*[@id='layer_cart']//div[1]//div[2]//div[4]/a/span")
    public WebElement proceedToCheckOutButton;

    @FindBy(xpath = "//*[@id='center_column']//div[1]/div/a[1]/img")
    public WebElement printedDressGirlyStyle;

    public ShoppingCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOverDressesButton(){
        click(dressesButton);

    }

    public void clickCasualDressesButton(){
        click(casualDressesButton);
    }

    public void checkSmallCheckBox(){
        click(smallCheckBox);
    }

    public void clickPrintedDressButton(){
        clickPrintedDressButton();
    }

    public void clickAddToCartButton(){
        click(addToCartButton);
    }

    public void clickTrashIcon(){
        click(trashIcon);
    }

    public void clickContinueShopping(){
        click(continueShoppingButton);
    }

    public void clickGirlyStyleCheckBox(){
        click(girlyStyleCheckBox);
    }

    public void clickGirlyStyleAddToCart(){
        click(girlyStyleAddToCartButton);
    }

    public void clickProceedToCheckout(){
        click(proceedToCheckOutButton);
    }

    public void clickPrintedDressGirlySytle(){
        click(printedDressGirlyStyle);
    }
}

