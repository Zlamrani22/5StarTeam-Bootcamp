package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonAPI {

    @FindBy(css = "input[id='gh-btn']")
    public WebElement SearchPage;


    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void clickSearch(){
        click(SearchPage);
    }

    public void clickSearchbutton() {
    }
}

//public class SearchPage extends CommonAPI {
//
//    private final Logger LOG = LoggerFactory.getLogger(SearchPage.class);
//
//    public void clickAdvancedSearchBtn() {
//        click(SearchBtn);
//        LOG.info("click on SearchPage button success");
//    }
//}