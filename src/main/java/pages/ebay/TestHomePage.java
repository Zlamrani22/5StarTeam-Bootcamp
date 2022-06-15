package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestHomePage extends CommonAPI {
    @FindBy(css = " li[class='hl-cat-nav__active'] span")
    public WebElement testHomeButton;
   @FindBy (css = "select [id='gh-cat']")
    private List<WebElement> menuDropdownOptions;
    public void selectOptionFromMenuDropdownWithGivenText(String option){

        List<WebElement> elements = menuDropdownOptions;

        for (WebElement element :elements) {

            if (element.getText().equalsIgnoreCase(option)){

                element.click();

            }

        }

    }


//   select
//    public void clickTestHomePage() {
//        click(testHomeButton);
//    }

    public TestHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}

