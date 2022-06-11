package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CloseAccountPage extends CommonAPI {
    public class CloseaccountPage extends CommonAPI {
        @FindBy(css = " li[class='hl-cat-nav__active'] span")
        public WebElement closeaccountButton;
        @FindBy(css = "select [id='gh-cat']")
        private List<WebElement> menuDropdownOptions;

        public void selectOptionFromMenuDropdownWithGivenText(String option) {

            List<WebElement> elements = menuDropdownOptions;

            for (WebElement element : elements) {

                if (element.getText().equalsIgnoreCase(option)) {

                    element.click();

                }

            }

        }
    }
}







//        @FindBy(xpath = "//a[normalize-space()='Close account']")
//    public WebElement closeaccount;
//
//    public CloseAccountPage(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }
//
//    public void clickAddToCart() {
//        click(closeaccount);
//    }
//
//
//}

