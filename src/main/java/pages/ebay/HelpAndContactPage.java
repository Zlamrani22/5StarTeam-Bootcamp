package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpAndContactPage extends CommonAPI {

    @FindBy(css = "input[id='gh-btn'")
    public WebElement helpAndContactButton;

    public HelpAndContactPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void clickHelpAndContact(){
        click(helpAndContactButton);
    }

    public void clickhelpAndContactbutton() {
    }
}

