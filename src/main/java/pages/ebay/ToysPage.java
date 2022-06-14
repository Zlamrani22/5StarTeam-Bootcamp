package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToysPage extends CommonAPI {
    @FindBy(xpath = "//body/div[@role='main']/div/ul/li[1]/a[1]")
    public WebElement toysButton;

    public void clickToys() {
        click(toysButton);
    }

    public ToysPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}

