package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage extends CommonAPI {

    @FindBy(xpath = "//a[normalize-space()='Buy']")
    private WebElement buyButton;

    public BuyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void clickbuybutton() {
        click(buyButton);
    }
}

