package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage extends CommonAPI {

    @FindBy(css = "a[href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=']")
    public WebElement SingintButton;

    public void clickSingin(){
        click(SingintButton);
    }

    public SigninPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}

