package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class PetSupplyPage extends CommonAPI {

        @FindBy(xpath = "//select[@id='gh-cat']")
        public WebElement petSupplyButton;

        public PetSupplyPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickpetSupplybutton() {
            click(petSupplyButton);
        }
    }


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