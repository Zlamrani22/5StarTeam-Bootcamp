package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellingPage extends CommonAPI {
    @FindBy(css = ".gh-p[href='https://www.ebay.com/sl/sell']")
    public WebElement sellingButton;

    public void clickSelling() {
        click(sellingButton);
    }

    public SellingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}

