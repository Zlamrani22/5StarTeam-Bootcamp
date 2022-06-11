package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends CommonAPI {
    @FindBy(xpath = "//a[normalize-space()='Payments']")
    public WebElement paymenttButton;

    public void clickPayment(){
        click(paymenttButton);
    }

    public PaymentPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}

