package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class EbayRefurbishedPage extends CommonAPI {

        @FindBy(css="input[id='gh-btn']")
        private WebElement ebayRefurbishedButton;

        public  EbayRefurbishedPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickebayRefurbishedbutton() {
            click(ebayRefurbishedButton);
        }
    }


