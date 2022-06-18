package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class WomenSandalsPage extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(HomePage.class);

        @FindBy(xpath = "//a[normalize-space()='Womens Sandals']")
        private WebElement womenSandalsButton;

        public  WomenSandalsPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickwomenSandalsbutton() {
            click(womenSandalsButton);
        }
    }


