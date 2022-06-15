package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvancedSearchPage extends CommonAPI {

    @FindBy(xpath = "//a[@id='gh-as-a']")
    public WebElement AdvancedSearch;


    public AdvancedSearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void clickAddvancedSearch(){
        click(AdvancedSearch);
    }
}

