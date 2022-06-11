package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectiblesAndArtPage {
    public CollectiblesAndArtPage(WebDriver driver) {
    }

    public void clickCollectiblesAndArt() {
    }

    public class collectiblesAndArtPage extends CommonAPI {

        @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Collectibles & Art')]")
        public WebElement CollectiblesAndArtButton;

        public collectiblesAndArtPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        public void clickCollectiblesAndArtt() {
            click(CollectiblesAndArtButton);
        }


    }
}