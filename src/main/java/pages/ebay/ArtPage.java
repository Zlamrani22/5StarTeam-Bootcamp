package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ArtPage extends CommonAPI {
        @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),' Art')]")
        private WebElement artButton;

        public ArtPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickartbutton() {
            click(artButton);
        }
    }
//    }
//
//
//
//
//
//
//
//
//
//
//    }
//        @FindBy(css = " li[class='hl-cat-nav__active'] span")
//
//        public WebElement artButton;

//        @FindBy(css = "select [id='gh-cat']")
//        private List<WebElement> menuDropdownOptions;
//
//        public void selectOptionFromMenuDropdownWithGivenText(String option) {
//
//            List<WebElement> elements = menuDropdownOptions;
//
//            for (WebElement element : elements) {
//
//                if (element.getText().equalsIgnoreCase(option)) {
//
//                    element.click();
//
//                }
//
//            }
//
//        }
//
//    }
//}