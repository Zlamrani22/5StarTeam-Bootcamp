package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends CommonAPI {

    @FindBy(css = "a[title='Log in to your customer account']")
    public WebElement loginButton;

    @FindBy(css = "input[id='email']")
    public WebElement emailInputField;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    public WebElement loginSubmitButton;

    public AuthenticationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton(){
        click(loginButton);
    }
    public void typeEmailInputField(String emailAddress){
        type(emailInputField, emailAddress);
    }
    public void typePasswordInputField(String password){
        type(passwordInputField, password);
    }
    public MyAccountPage clickLoginSubmitButton(){
        click(loginSubmitButton);
        return new MyAccountPage(getDriver());
    }
}
