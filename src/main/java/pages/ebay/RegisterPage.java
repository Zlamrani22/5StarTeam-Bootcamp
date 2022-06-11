package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends CommonAPI {
    @FindBy(xpath = "//span[normalize-space()='register page']")
    public WebElement RegisterButton;

    public void clickRegister(){
        click(RegisterButton);
    }

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}

