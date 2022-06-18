package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//public class MotorPage {
    public class MotorPage extends CommonAPI {
        @FindBy(css = "input[id='gh-btn']")
        public WebElement motorButton;

        public MotorPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickmotorbutton() {
            click(motorButton);

            {

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
}