package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomensCoatsAndJacketsPage extends CommonAPI {

    @FindBy(css = "img[title='Printed Dress']")
    public WebElement printedDressButton;

    @FindBy(xpath = "a[id='wishlist_button']")
    public WebElement wishlistButton;


    public WomensCoatsAndJacketsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void clickPrintedDressButton(){
        click(printedDressButton);
    }
    public void clickWishlistButton(){
        click(wishlistButton);

    }


}
