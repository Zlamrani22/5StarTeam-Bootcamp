package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyPage extends CommonAPI {

    @FindBy(xpath = "//a[@class='thrd'][normalize-space()='Policies']")
    public WebElement policyButton;

    public PolicyPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCart() {
        click(policyButton);
    }

    {
    }

    {
    }{
    }

    public void clickpolicybutton() {
    }
}

