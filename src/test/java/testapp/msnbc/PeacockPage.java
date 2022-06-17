package testapp.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PeacockPage extends CommonAPI {
    @FindBy(css = "img[alt='The Mehdi Hasan Show']")
    private WebElement hassanMehdiPeacock;

    @FindBy(xpath = "//span[text()='Only on Peacock']")
    private WebElement onlyOnPeacockHeader;

    public PeacockPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



    public WebElement scrollToOnlyOnPeacockHeader(){
        isPresent(onlyOnPeacockHeader);
        return onlyOnPeacockHeader;
    }

    public void clickHassanMehdiPeacock(){
        click(hassanMehdiPeacock);
    }


}
