package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends CommonAPI {


    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
