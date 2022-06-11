package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyEbayPage extends CommonAPI {

    @FindBy(css = "a[title='My eBay']")
    public WebElement MyEbaytButton;

    public void clickMyEbay(){
        clickMyEbay();
    }

    public MyEbayPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}

