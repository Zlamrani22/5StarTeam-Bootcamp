package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PeacockPage extends CommonAPI {
    @FindBy(css = "a[@aria-label='The Mehdi Hasan Show']")
    private WebElement hassanMehdiPeacock;

    public PeacockPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement clickHassanMehdiPeacock(){
        click(hassanMehdiPeacock);
        return hassanMehdiPeacock;
    }
}
