package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchNewCarPage extends CommonAPI {

    @FindBy(xpath="//span[text()='New Car']")
    WebElement newCar;

    @FindBy(xpath="//body[1]/main[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[2]/span[1]")
    WebElement newCarByBodyStyle;

    @FindBy(xpath="//div[@class='card noBorder center bodyoption bodyoptionNew selected']")
    WebElement newCarSUV ;

    @FindBy(xpath="//input[@id='dealFinderZipUsedId_dealFinderFormBodyNewCar']")
    WebElement newCarZipCodeByBodyStyle;

    @FindBy(xpath = "//input[@class='cgBtn isolated ft-homepage-search__new-car-form__body__submit']")
    WebElement newCarSearchByBodyStyle;



    public SearchNewCarPage(WebDriver driver) {PageFactory.initElements(driver, this);}


}
