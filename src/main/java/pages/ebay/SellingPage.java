package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellingPage extends CommonAPI {

    @FindBy(css = "input[id='gh-btn']")
    public WebElement sellingButton;

    public void clickSelling() {
        click(sellingButton);
    }

    public SellingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}

