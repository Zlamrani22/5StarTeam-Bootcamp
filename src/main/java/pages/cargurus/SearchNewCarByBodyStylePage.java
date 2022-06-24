package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchNewCarByBodyStylePage extends CommonAPI {

    @FindBy(xpath="//span[text()='New Car']")
    WebElement newCar;

    @FindBy(xpath="//body[1]/main[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[2]/span[1]")
    WebElement newCarByBodyStyle;

    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]")
    WebElement newCarSUV ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[2]")
    WebElement newCarSEdan ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[3]")
    WebElement newCarPickupTruck ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[4]")
    WebElement newCarCoupe ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[5]")
    WebElement newCarHatchback ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[6]")
    WebElement newCarConvertible ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[7]")
    WebElement newCarWagon ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[8]")
    WebElement newCarMinivan ;

    @FindBy(xpath="//input[@class='form-control dealFinderZip ft-homepage-search__new-car-form__body__zip']")
    WebElement zipCodeNewCarByBodyStyle;

    @FindBy(xpath = "//input[@class='cgBtn isolated ft-homepage-search__new-car-form__body__submit']")
    WebElement searchNewCarByBodyStyle;
    @FindBy(xpath ="//p[text()='Only show recent price drops']")
    WebElement dropPrice;
    @FindBy(css ="#select-filter")
    WebElement radius;



    public SearchNewCarByBodyStylePage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(SearchNewCarByBodyStylePage.class);

    public void clickNewCar(){click(newCar);
        LOG.info("click new car success");}
    public void clickNewCarByBodyStyle(){click(newCarByBodyStyle);
        LOG.info("click new car by body style success");}
    public void clickNewCarSUV(){click(newCarSUV);
        LOG.info("click new car SUV success");}
    public void clickNewCarSedan(){click(newCarSEdan);
        LOG.info("click new car sedan success");}
    public void clickNewCarPickupTruck(){click(newCarPickupTruck);
        LOG.info("click new car pick up truck success");}
    public void clickNewCarCoupe(){click(newCarCoupe);
        LOG.info("click new car coupe success");}
    public void clickNewCarHatchback(){click(newCarHatchback);
        LOG.info("click new car hatchback success");}
    public void clickNewCarConvertible(){click(newCarConvertible);
        LOG.info("click new car convertible success");}
    public void clickNewCarWagon(){click(newCarWagon);
        LOG.info("click new car wagon success");}
    public void clickNewCarMinivan(){click(newCarMinivan);
        LOG.info("click new car mini van success");}
    public void typeZipCodeNewCarByBodyStyle(String zip){type(zipCodeNewCarByBodyStyle, zip);
        LOG.info("type zip code success");}
    public void clickSearchNewCarByBodyStyle(){click(searchNewCarByBodyStyle);
        LOG.info("click search new car by body style success");}
    public void clickDropPrice() {click(dropPrice);
        LOG.info("click drop price success");}
   public void selectFromRadiusDropDown(String option){selectFromDropdown(radius,option);
       LOG.info("select from drop down radius success");}
}
