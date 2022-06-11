package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReidOutPage extends CommonAPI {
    @FindBy(css = "img[class='titleLogo']")
    private WebElement pageHeader;

    public ReidOutPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String reidOutHeader() {

        String header = getElementText(pageHeader);
        return header;
    }
}
