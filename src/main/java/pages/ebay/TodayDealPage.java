package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class TodayDealPage extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(HomePage.class);
        @FindBy(css="input[id='gh-btn']")
        private WebElement todaydealButton;

        public TodayDealPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clicktodaydealbutton() {
            click(todaydealButton);
        }
    }


