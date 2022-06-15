package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeatPage extends CommonAPI {

    @FindBy(css = "img[class='titleLogo']")
    private WebElement pageHeader;

    public BeatPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String getTheBeatPageHeader() {

        String header = getElementText(pageHeader);
        return header;
    }
}
