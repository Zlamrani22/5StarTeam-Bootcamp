package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidPasswordPage extends CommonAPI {

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement validPasswordtButton;

    public static void clickPassword() {
    }

    public static void clickvalidPasswordbutton() {
    }

    public void clickValidPassword() {
        click(validPasswordtButton);
    }

    public ValidPasswordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    {
    }
}

