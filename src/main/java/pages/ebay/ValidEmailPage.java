package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidEmailPage extends CommonAPI {
    @FindBy(xpath = "//span[normalize-space()='account']")
    public WebElement validemailtButton;

    public void clickValidEmailt() {
        click(validemailtButton);
    }

    public ValidEmailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    {
    }
}

