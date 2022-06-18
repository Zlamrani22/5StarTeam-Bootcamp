package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class RefreshYourHomeForLessPage extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(HomePage.class);
        @FindBy(xpath = "//a[normalize-space()='Refresh your home for less']")
        private WebElement refreshYourHomeForLessButton;

        public  RefreshYourHomeForLessPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickRefreshYourHomeForLessbutton() {
            click(refreshYourHomeForLessButton);
        }
    }


