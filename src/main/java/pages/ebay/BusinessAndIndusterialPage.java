package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BusinessAndIndusterialPage extends CommonAPI {

    @FindBy(css = "input[id='gh-btn']")
    public WebElement businessAndIndusterialButton;

    public BusinessAndIndusterialPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickbusinessAndIndusterialbutton() {
        click(businessAndIndusterialButton);
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


