package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utility.ConnectDB;

public class AccessPage extends CommonAPI {
        @FindBy(xpath="//header/nav[1]/section[3]/div[1]/div[2]/button[1]")
        WebElement dropDown;
        @FindBy(xpath = "//p[@class='btnContinue']")
        WebElement Continue;

        public AccessPage(WebDriver driver){PageFactory.initElements(driver, this);}
        private final Logger LOG = LoggerFactory.getLogger(AccessPage.class);

        public void selectFromDropdown(String option) {selectFromDropdown(dropDown, option);
        LOG.info("select from drop down success");}
        public void clickOnContinueBtn(){click(Continue);
        LOG.info("click continue success");}


}
