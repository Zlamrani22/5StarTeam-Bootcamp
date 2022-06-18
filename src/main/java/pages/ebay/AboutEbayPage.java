package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutEbayPage extends CommonAPI {
    @FindBy(css = "input[id='gh-btn']")
    private WebElement aboutEabyButton;

    public AboutEbayPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void clickaboutEbaybutton() {
        click(aboutEabyButton);
    }

    public void clickAboutEbaybutton() {
    }
}

//    public void clickAboutEbaybutton() {
//    }
//}

