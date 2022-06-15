package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessPage extends CommonAPI {
        @FindBy(xpath="//header/nav[1]/section[3]/div[1]/div[2]/button[1]")
        WebElement dropDown;
        @FindBy(xpath = "//p[@class='btnContinue']")
        WebElement Continue;

        public AccessPage(WebDriver driver){PageFactory.initElements(driver, this);}

        public void selectFromDropdown(String option) {selectFromDropdown(dropDown, option);}
        public void clickOnContinueBtn(){click(Continue);}


}
