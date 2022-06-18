package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends CommonAPI {
    @FindBy(css = "gh-cart-icon")
    private WebElement addToCartButton;

    public AddToCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void clickaddtocartbutton() {
        click(addToCartButton);
    }
}

//}

//public class AddToCartPage extends CommonAPI {
//
//    private final Logger LOG = LoggerFactory.getLogger(AddToCartPage.class);
//
//    @FindBy(css = " #gh-btn")
//    private WebElement searchField;
