package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class AdvancedSearchPage extends CommonAPI {
        @FindBy(css = "input[id='gh-btn'] ")
        private WebElement advancedSearchButton;

        public AdvancedSearchPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


//        public static void clickadvancedSearchbutton() {
//            click(advancedSearchbutton());
//        }


        private static WebElement advancedSearchbutton() {
            return null;
        }
    }

