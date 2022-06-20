package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidSigninPage extends CommonAPI {

    @FindBy(xpath = "//span[@id='gh-ug']//a[contains(text(),'Sign in')]")
    public WebElement invalidsigninButton;

    public void clickInvalidSignint(){
        click(invalidsigninButton);
    }

    public InvalidSigninPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}



