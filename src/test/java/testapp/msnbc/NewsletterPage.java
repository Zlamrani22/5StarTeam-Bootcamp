package testapp.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsletterPage extends CommonAPI {

    @FindBy(xpath = "//li[@class='waffleCard styles_waffleCard__TcO9m'][2]")
    private WebElement selectMorningJoeNewsletter;

    public NewsletterPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void chooseMorningJoeNewsletter(){
        click(selectMorningJoeNewsletter);
    }
}
