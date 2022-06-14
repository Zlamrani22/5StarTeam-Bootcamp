package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends CommonAPI {

    public MyAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
