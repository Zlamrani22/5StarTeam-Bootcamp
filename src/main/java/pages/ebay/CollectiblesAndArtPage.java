package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



    public class CollectiblesAndArtPage extends CommonAPI {

        @FindBy(css = "input[id='gh-btn']")
        public WebElement CollectiblesAndArtButton;

        public CollectiblesAndArtPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        public void clickCollectiblesAndArt() {
            click(CollectiblesAndArtButton);
        }


        public void clickcollectiblesAndArtbutton() {
        }
    }
