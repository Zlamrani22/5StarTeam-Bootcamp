package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class EntertaintmentMemorabiliaPage extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(HomePage.class);
        @FindBy(xpath = "//select[@id='gh-cat']")
        private WebElement entertaintmentMemorabiliaButton;

        public EntertaintmentMemorabiliaPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickentertaintmentMemorabiliabutton() {
            click(entertaintmentMemorabiliaButton);
        }
    }



