package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchNewCarByBodyStyleAndPricePage extends CommonAPI {

    @FindBy(xpath="//span[text()='New Car']")
    WebElement newCarPrice;
    @FindBy(xpath="//body[1]/main[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[2]/span[1]")
    WebElement newCarByBodyStylePrice;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]")
    WebElement newCarSUVPrice;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/select[1]")
    WebElement newCarMinimumPrice ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[2]/div[2]/select[1]")
    WebElement newCarMaximumPrice ;
    @FindBy(xpath="//input[@class='form-control dealFinderZip ft-homepage-search__new-car-form__body__zip error']")
    WebElement zipCodeNewCarByBodyStylePrice;
    @FindBy(xpath = "//input[@class='cgBtn isolated ft-homepage-search__new-car-form__body__submit']")
    WebElement searchNewCarByBodyStylePrice;


    public SearchNewCarByBodyStyleAndPricePage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(SearchNewCarByBodyStyleAndPricePage.class);

    public void clickNewCarPrice(){click(newCarPrice);
        LOG.info("click new car price success");}
    public void clickNewCarByBodyStylePrice(){click(newCarByBodyStylePrice);
        LOG.info("click new car by body style price success");}
    public void clickNewCarSUVPrice(){click(newCarSUVPrice);
        LOG.info("click new car SUV success");}
    public void selectOptionFromNewCarMinimumPrice(String option){selectFromDropdown(newCarMinimumPrice, option);
        LOG.info("select from drop down new car minimum price success");}
    public void selectOptionFromNewCarMaximumPrice(String option){selectFromDropdown(newCarMaximumPrice, option);
        LOG.info("select from drop down new car maximum price success");}
    public void typeZipCodeNewCarByBodyStylePrice(String zip){type(zipCodeNewCarByBodyStylePrice, zip);
        LOG.info("type zip code new car by body style and price success");}
    public void clickSearchNewCarByBodyStylePrice(){click(searchNewCarByBodyStylePrice);
        LOG.info("click search new car by body style and by price success");}
}
