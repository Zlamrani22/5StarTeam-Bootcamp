package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestaShopPage extends CommonAPI {

    @FindBy(xpath = "//div[@class='popup-link prestashop-link primary-link secondary-os-font-bold']/a[@href='https://www.prestashop.com/en/download']")
    public WebElement createMyStoreButton;

    public PrestaShopPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickCreateMyStore(){
        click(createMyStoreButton);
    }
}
