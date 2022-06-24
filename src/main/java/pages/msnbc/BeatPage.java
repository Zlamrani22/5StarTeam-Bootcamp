package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeatPage extends CommonAPI {

    private static Logger LOG = LoggerFactory.getLogger(BeatPage.class);

    @FindBy(css = "img[class='titleLogo']")
    private WebElement pageHeader;

    public BeatPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String theBeatHeader() {

        String header = getElementText(pageHeader);
        LOG.info("Beat page header displayed success");
        return header;

    }
}
