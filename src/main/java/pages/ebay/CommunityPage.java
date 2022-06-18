package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunityPage extends CommonAPI {

    @FindBy(css = "input[id='gh-btn']")
    private WebElement communityButton;

    public CommunityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void clickcommunitybutton() {
        click(communityButton);
    }
}


