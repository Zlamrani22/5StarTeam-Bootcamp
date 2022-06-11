package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DailyDealsPage extends CommonAPI {
    @FindBy(xpath = "//a[normalize-space()='Daily Deals']")
    public WebElement DailyDealsButton;

    public DailyDealsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static void clickDailyDeals() {
    }

    public void clickAddToCart() {
        click(DailyDealsButton);
    }


}


