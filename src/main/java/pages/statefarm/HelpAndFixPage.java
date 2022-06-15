package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpAndFixPage extends CommonAPI {

    @FindBy(xpath = "//span[text()='Help']")
    WebElement help;
    @FindBy(css = "#btn1")
    WebElement forgetUserId;

    public HelpAndFixPage(WebDriver driver){PageFactory.initElements(driver, this);}

    public void clickOnHelp(){click(help);}
    public void clickOnForgetUserId(){click(forgetUserId);}

}
