package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpAndAccountPage extends CommonAPI {
    @FindBy(xpath = "//a[@class='gh-p'][normalize-space()='Help & Contact']")
    public WebElement helpandaccountButton;

    public HelpAndAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void clickHelpAndAccount(){
        click(helpandaccountButton);
    }
}

