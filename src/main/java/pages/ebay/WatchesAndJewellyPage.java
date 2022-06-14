package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchesAndJewellyPage {
    public WatchesAndJewellyPage(WebDriver driver) {
    }

    public class watchesAndJewellyPage extends CommonAPI {

        @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Jewelly")
        public WebElement watchesandjewellyButton;

        public watchesAndJewellyPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        public void clickWatchesAndJewelly() {
            WebElement WatchesAndJewellyButton;
            click(watchesandjewellyButton);
        }


    }
}




