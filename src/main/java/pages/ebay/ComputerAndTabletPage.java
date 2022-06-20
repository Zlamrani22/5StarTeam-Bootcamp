package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class ComputerAndTabletPage extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(HomePage.class);
        @FindBy(xpath = "//span[normalize-space()='Computers, Tablets & Network")
        private WebElement computerAndTabletButton;

        public ComputerAndTabletPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickcomputerAndTabletbutton() {
            click(computerAndTabletButton);
        }
    }


