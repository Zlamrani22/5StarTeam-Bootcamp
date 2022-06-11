package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxMessagePage extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Messages')]")
    public WebElement inboxMessageButton;

    public void clickInboxMessage() {
        click(inboxMessageButton);
    }

    public InboxMessagePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    }


