package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//public class DollsAndBearPage{

    public class DollsAndBearsPage extends CommonAPI {

                @FindBy(css = "input[id='gh-btn' ")
                public WebElement dollsAndGardennButton;

        public DollsAndBearsPage(WebDriver driver) {
            super();
        }

        public void DollsAndBearPage(WebDriver driver) {
                    PageFactory.initElements(driver, this);
                }


                public void clickdollsAndBearsbutton() {
                    click(dollsAndGardennButton);
                }
            }










//            @FindBy(css = "input[id='gh-btn']")
//        public WebElement dollsAndBearsButton;
//
//        public pages.ebay.DollsAndBearsPage(WebDriver driver) {
//            PageFactory.initElements(driver, this);
//        }
//
//
//        public void clickdollsAndBearbutton() {
//            click(dollsAndBearsButton);
//        }
//    }






//        @FindBy(css = "select [id='gh-cat']")
//        private List<WebElement> menuDropdownOptions;

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


