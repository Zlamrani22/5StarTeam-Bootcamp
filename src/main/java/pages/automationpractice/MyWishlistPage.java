package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishlistPage extends CommonAPI {

    @FindBy(xpath = "//*[@id='wishlist_47175']//td[6]/a/i")
    public WebElement removeIcon;

    @FindBy(css = "input[id='name']")
    public WebElement newWishlistNameInputField;

    @FindBy(css = "button[id='submitWishlist']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id='mywishlist']//li[1]/a")
    public WebElement backToYourAccountButton;

    @FindBy(xpath = "//*[@id='center_column']//div[2]/h5/a")
    public WebElement printedChiffonDressLink;

    @FindBy(css = "a[class='addToWishlist wishlistProd_7 checked']")
    public WebElement addToWishlist;

    public MyWishlistPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickRemoveIcon(){
        click(removeIcon);
    }

    public void typeNewWishlistName(String wishlistName){
        type(newWishlistNameInputField, wishlistName);
    }

    public void clickSave(){
        click(saveButton);
    }
    public void clickBackToYouAccount(){
        click(backToYourAccountButton);
    }

    public void clickPrintedChiffonDress(){
        click(printedChiffonDressLink);
    }

    public void clickAddToWishlist(){
        click(addToWishlist);
    }

}
