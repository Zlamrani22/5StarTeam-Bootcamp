package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandNamePage extends CommonAPI {


    @FindBy(xpath = "//a[@aria-label='Your shopping cart']//*[name()='svg']")
    public WebElement brandnameButton;

    public  BrandNamePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickBrandName() {
        click(brandnameButton);
    }


}








