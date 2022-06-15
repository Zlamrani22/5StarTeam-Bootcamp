package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignoutPage extends CommonAPI {
    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    private WebElement singOutButton;

    public void clickSignOut() {
        click(singOutButton);
    }

    public SignoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}

