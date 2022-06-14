package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage extends CommonAPI {
    @FindBy(css = "#gh-btn")
    public WebElement searchProducttButton;

    public void clickSearchProduct(){
        click(searchProducttButton);
    }

    public SearchProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}

