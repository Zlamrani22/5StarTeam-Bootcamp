package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    @FindBy(xpath="//button[@id='sgnBt']")
public WebElement LoginButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickLogin() {
        click(LoginButton);
    }

    public void clickLoginbutton() {
    }
}





//    @FindBy(xpath = "//a[@href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=']")
//    private WebElement headerText;
//}

