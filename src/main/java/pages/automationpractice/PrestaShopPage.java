package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestaShopPage extends CommonAPI {

    @FindBy(xpath = "//div[@class='popup-link prestashop-link primary-link secondary-os-font-bold']/a[@href='https://www.prestashop.com/en/download']")
    public WebElement createMyStoreButton;

    @FindBy(xpath = "//*[@id='footer-column-803']/ul/li[1]/a")
    public WebElement supportLink;

    @FindBy(xpath = "//*[@id='7']//div[2]//div[2]/a")
    public WebElement liveDemoButton;


    public PrestaShopPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickCreateMyStore(){
        click(createMyStoreButton);
    }

    public void clickSupportLink(){
        click(supportLink);
    }

    public MyStorePage clickLiveDemo(){
        click(liveDemoButton);
        return new MyStorePage(getDriver());
    }

}
