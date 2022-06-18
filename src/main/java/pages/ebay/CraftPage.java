package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CraftPage extends CommonAPI {

        @FindBy(css = "input[id='gh-btn'] ")
        public WebElement craftButton;

        public CraftPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickcraftbutton() {
            click(craftButton);
        }
    }


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
//    }
//}
