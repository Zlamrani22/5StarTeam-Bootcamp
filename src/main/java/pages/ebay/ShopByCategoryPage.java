package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopByCategoryPage extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    public WebElement shopByCatogoryButton;

    public void clickShopByCategory() {
        click(shopByCatogoryButton);
    }

    public ShopByCategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
