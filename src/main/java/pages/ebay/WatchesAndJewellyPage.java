package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//public class WatchesAndJewellyPage {
//    public WatchesAndJewellyPage(WebDriver driver) {
//    }

    public class WatchesAndJewellyPage extends CommonAPI {

        @FindBy(css = "input[id='gh-btn']")
        public WebElement watchesandjewellyButton;

        public WatchesAndJewellyPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        public void clickWatchesAndJewelly() {
            click(watchesandjewellyButton);
        }


        public void clickwatchesAndJewellybutton() {
        }
    }





