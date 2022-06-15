package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MutualFundPage  extends CommonAPI {
    public MutualFundPage(WebDriver driver){PageFactory.initElements(driver, this);}
}
