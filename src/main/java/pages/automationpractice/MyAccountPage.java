package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends CommonAPI {

    @FindBy(css = "a[title='Addresses']")
    public WebElement myAddresses;

    @FindBy(xpath = "//*[@id='center_column']//div[1]//ul//li[9]//a[2]")
    public WebElement deleteButton;

    @FindBy(css = "input[class='search_query form-control ac_input']")
    public WebElement searchInputField;

    @FindBy(css = "a[id='color_40']")
    public WebElement whiteColorCheckBox;

    @FindBy(css = "button[class='btn btn-default button-search']")
    public WebElement searchButton;

    @FindBy(css = "i[class='icon-th-list']")
    public WebElement listButton;

    @FindBy(xpath = "//*[@id='product_comments_block_extra']/ul/li/a")
    public WebElement writeAReviewButton;

    @FindBy(css = "a[id='color_20']")
    public WebElement blueColorCheckBox;

    @FindBy(xpath = "//*[@id='usefull_link_block']//li[2]/a")
    public WebElement printButton;

    @FindBy(css = "a[id='color_8']")
    public WebElement whiteColorBlouse;

    @FindBy(xpath = "//*[@id='wrapResetImages']/a")
    public WebElement displayAllPicturesLink;

    @FindBy(xpath = "//*[@id='center_column']//div[2]/ul/li/a")
    public WebElement myWishlistsButton;

    public MyAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickMyAddresses(){
        click(myAddresses);
    }

    public void clickDelete(){
        click(deleteButton);
    }

    public void searchElementAndEnter(String searchItem){
        type(searchInputField, searchItem);
    }

    public void clearSearchInputField(){
        clear(searchInputField);
    }

    public void clickWhiteColorPrintedSummerDress(){
        click(whiteColorCheckBox);
    }

    public void clickSearchButton(){
        click(searchButton);
    }

    public void clickListButton(){
        click(listButton);
    }

    public void clickWriteAReview(){
        click(writeAReviewButton);
    }

    public void clickBlueColorCheckBox(){
        click(blueColorCheckBox);
    }

    public void clickPrintButton(){
        click(printButton);
    }

    public void clickWhiteColorBlouse(){
        click(whiteColorBlouse);
    }
    public void clickDisplayAllPicturesLink(){
        click(displayAllPicturesLink);
    }

    public MyWishlistPage clickMyWishlist(){
        click(myWishlistsButton);
        return new MyWishlistPage(getDriver());
    }

}
