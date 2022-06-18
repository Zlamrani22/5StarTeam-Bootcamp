package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandOutletPage extends CommonAPI {


    @FindBy(css="input[id='gh-btn']")
    public WebElement brandOutletButton;

    public  BrandOutletPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickBrandOutlet() {
        click(brandOutletButton);
    }


    public void clickbrandOutletbutton() {
    }
}








