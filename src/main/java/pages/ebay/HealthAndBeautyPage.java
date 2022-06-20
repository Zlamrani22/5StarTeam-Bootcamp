package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class HealthAndBeautyPage extends CommonAPI {

        @FindBy(xpath = "//select[@id='gh-cat']")
        private WebElement healthAndBeautyButton;

        public HealthAndBeautyPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickhealthAndBeautybutton() {
            click(healthAndBeautyButton);
        }
    }


