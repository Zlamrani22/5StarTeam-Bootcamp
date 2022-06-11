package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class ForgotPasswordPage extends CommonAPI {

        @FindBy(xpath = "//a[@id='need-help-signin-link']")
        public WebElement forgotpassword;

        public ForgotPasswordPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }
        public void clickForgotPassword() {
            click(forgotpassword);
        }

        }



