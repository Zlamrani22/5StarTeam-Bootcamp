package testapp.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigUpPage extends CommonAPI {

    @FindBy(css = "input[id='email']")
    private WebElement emailInput;

    @FindBy(css = "h3[class='headline']")
    private WebElement validSignupHeader;

    public SigUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void searchElementAndEnter(String email){
        typeAndEnter(emailInput, email);
    }

    public String validSignUpHeaderText(){
        String elements= getElementText(validSignupHeader);
        return elements;
    }
}
