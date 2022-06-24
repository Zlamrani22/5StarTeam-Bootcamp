package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeadlinePage extends CommonAPI {

    @FindBy(css = "img[class='titleLogo']")
    private WebElement pageHeader;

    @FindBy(xpath = "//a[text()='TWITTER']")
    public WebElement twitterOption;

    public DeadlinePage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void selectTwitter() {
        click(twitterOption);
    }
}
