package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopByCategoryPage extends CommonAPI {
    @FindBy(css = "input[id='gh-btn']")
    public WebElement shopByCatogoryButton;

    public void clickShopByCategory() {
        click(shopByCatogoryButton);
    }

    public ShopByCategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickShopByCategorybutton() {
    }
}
