package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PinterestPage extends CommonAPI {

    public PinterestPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
