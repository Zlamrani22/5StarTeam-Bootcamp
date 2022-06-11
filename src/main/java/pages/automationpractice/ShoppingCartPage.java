package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends CommonAPI {

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    public WebElement dressesButton;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > ul > li:nth-child(1) > a")
    public WebElement casualDressesButton;

    @FindBy(css= "input[id='layered_id_attribute_group_1'")
    public WebElement smallCheckBox;

    @FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")
    public WebElement printedDressButton;

    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement addToCartButton;

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
}

