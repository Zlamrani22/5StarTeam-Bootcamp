package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ElectronicPage {
    public ElectronicPage() {
    }

    public class electronicpage extends CommonAPI {
        public class TestHomePage extends CommonAPI {
            @FindBy(css = " li[class='hl-cat-nav__active'] span")
            public WebElement testHomeButton;
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
}


//            public class electronicPage {
//                @FindBy(xpath = "//body/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[4]/a[")
//                public WebElement electronicButton;
//
//                public void ElectronicPage(WebDriver driver) {
//                    PageFactory.initElements(driver, this);
//                }
//
//                public void clickElectronic() {
//                    click(electronicButton);
//                }
//
//
//            }
//        }
//    }
