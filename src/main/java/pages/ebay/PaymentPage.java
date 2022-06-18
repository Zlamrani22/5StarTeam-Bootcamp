package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class PaymentPage extends CommonAPI {
        @FindBy(css="input[id='gh-btn']")
        private WebElement paymentButton;

        public PaymentPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickpaymentbutton() {
            click(paymentButton);
        }
    }


