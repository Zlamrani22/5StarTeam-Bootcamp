package testapp.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NBCPage extends CommonAPI {

    @FindBy(css = "a[href='https://www.nbcnews.com']")
    private WebElement nbcLogoDropdownMenu;

    @FindBy(css = "ul[class='shortcuts-list h-lh'] li:nth-child(5)")
    private WebElement covidMainTabNBCPage;

    @FindBy(css = "//p[@class='two-week big-number']")
    public WebElement covidTwoWeekPercentageText;

    public NBCPage(WebDriver driver){
    PageFactory.initElements(driver,this);
    }

    public void clickNBCNewsLogo(){
        click(nbcLogoDropdownMenu);
    }

    public void clickCovidTab(){
        click(covidMainTabNBCPage);
    }

    public void viewCovidTwoWeekPercentage(){
        getElementText(covidTwoWeekPercentageText);
    }

}
