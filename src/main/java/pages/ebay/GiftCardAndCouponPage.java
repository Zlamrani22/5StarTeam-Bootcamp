package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class GiftCardAndCouponPage extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(HomePage.class);
        @FindBy(xpath = "//select[@id='gh-cat']")
        private WebElement giftCardAndCouponButton;

        public  GiftCardAndCouponPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickgiftCardAndCouponbutton() {
            click(giftCardAndCouponButton);
        }
    }


