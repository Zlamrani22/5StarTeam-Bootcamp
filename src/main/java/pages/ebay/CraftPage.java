package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CraftPage {

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
