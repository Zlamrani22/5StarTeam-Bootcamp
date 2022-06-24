package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealEstatePage extends CommonAPI {
        @FindBy(css="input[id='gh-btn']")
        private WebElement realEasateButton;

        public RealEstatePage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickrealEstatebutton() {
            click(realEasateButton);
        }
    }


//



//    @FindBy(xpath= "//select[@id='gh-cat']")
//    public WebElement RealEstateButton;
//
//    public RealEstatePage(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }
//
//    public void clickRealEstate() {
//        click(RealEstate();
//
//}
//}
