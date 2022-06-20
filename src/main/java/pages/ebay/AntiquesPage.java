package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class AntiquesPage extends CommonAPI {
        @FindBy(css = "input[id='gh-btn']")
        private WebElement antiquesButton;

        public AntiquesPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickantiquesbutton() {
            click(antiquesButton);
        }
    }





