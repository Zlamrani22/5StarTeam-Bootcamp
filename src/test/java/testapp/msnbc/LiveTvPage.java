package testapp.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiveTvPage extends CommonAPI {

    @FindBy(css = "button[class='tve__signin__action']")
    private WebElement signInButton;

    @FindBy(css = "button[value='Cablevision']")
    private WebElement optimumButton;

    @FindBy(css = "div[id='logo']")
    private WebElement optimumLogo;

    public LiveTvPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickSignInButton(){
        click(signInButton);
    }

    public void chooseOptimum(){
        click(optimumButton);
    }

    public String optimumPageLogo(){
       String element= getElementText(optimumLogo);
        return element;
    }
}
