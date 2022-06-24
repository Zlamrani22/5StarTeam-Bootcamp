package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchUsedCarPage extends CommonAPI {

    @FindBy(xpath="//label[@class='ft-homepage-search__tabs__used-car active']")
    WebElement usedCar;

    @FindBy(xpath="//body[1]/main[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[3]/span[1]")
    WebElement byPrice;
    @FindBy(xpath="/html/body/main/div[2]/div[2]/div[1]/section/div/div/div[1]/div/div/div[3]/div/form/fieldset/div/div[1]/select")
    WebElement minimumPrice;
    @FindBy(xpath="/html/body/main/div[2]/div[2]/div[1]/section/div/div/div[1]/div/div/div[3]/div/form/fieldset/div/div[2]/select")
    WebElement maximumPrice;
    @FindBy(xpath="//input[@id='dealFinderZipUsedId_dealFinderFormPrice']")
    WebElement zipCodeByPrice;
    @FindBy(xpath="//input[@class='cgBtn isolated ft-homepage-search__used-car-form__price__submit']")
    WebElement searchByPrice;
    @FindBy(xpath="//body[1]/main[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[2]/span[1]")
    WebElement byBodyStyle;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]")
    WebElement SUV ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[2]")
    WebElement sedan ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[3]")
    WebElement PickUpTruck ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[4]")
    WebElement coupe ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[5]")
    WebElement hatchback ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[6]")
    WebElement convertible ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[7]")
    WebElement wagon ;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[8]")
    WebElement minivan ;
    @FindBy(xpath="//input[@class='form-control dealFinderZip ft-homepage-search__used-car-form__body__zip']")
    WebElement zipCodeByBodyStyle;
    @FindBy(xpath = "//input[@class='cgBtn isolated ft-homepage-search__used-car-form__body__submit']")
    WebElement searchByBodyStyle;
    @FindBy(xpath = "//body[1]/main[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
    WebElement byMakeModel;
    @FindBy(css = "#carPickerUsed_makerSelect")
    WebElement allMakes;
    @FindBy(css = "#carPickerUsed_modelSelect")
    WebElement allModels;
    @FindBy(xpath="//input[@class='form-control dealFinderZip ft-homepage-search__used-car-form__make-model__zip error']")
    WebElement zipCodeByMakeAndModel;
    @FindBy(xpath = "//input[@class='cgBtn isolated ft-homepage-search__used-car-form__make-model__submit']")
    WebElement searchByMakeAndModel;

    public SearchUsedCarPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(SearchUsedCarPage.class);

    public void clickUsedCar(){click(usedCar);
        LOG.info("click used car success");}
    public void clickByPrice(){click(byPrice);
        LOG.info("click by price success");}
    public void selectOptionFromMinimumPrice(String option){selectFromDropdown(minimumPrice, option);
        LOG.info("select from drop down minimum price success");}
    public void selectOptionFromMaximumPrice(String option){selectFromDropdown(maximumPrice, option);
        LOG.info("select from drop down maximum price success");}
    public void typeZipCodeByPrice(String zip){type(zipCodeByPrice, zip);
        LOG.info("type zip code by price success");}
    public void clickSearchByPrice(){click(searchByPrice);
        LOG.info("click search by price success");}
    public void clickByMakeModel(){click(byMakeModel);
        LOG.info("click by make and model success");}
    public void clickByBodyStyle(){click(byBodyStyle);
        LOG.info("click by body style success");}
    public void clickSUV(){click(SUV);
        LOG.info("click SUV success");}
    public void clickSedan(){click(sedan);
        LOG.info("click sedan success");}
    public void clickMinivan(){click(minivan);
        LOG.info("click minivan success");}
    public void clickPickUpTruck(){click(PickUpTruck);
        LOG.info("click pickup trucks success");}
    public void clickHatchback(){click(hatchback);
        LOG.info("click hatchback success");}
    public void clickConvertible(){click(convertible);
        LOG.info("click convertible success");}
    public void clickWagon(){click(wagon);
        LOG.info("click wagon success");}
    public void clickCoupe(){click(coupe);
        LOG.info("click coupe success");}
    public void selectOptionFromAllMakes(String option){selectFromDropdown(allMakes, option);
        LOG.info("select from drop down all makes success");}
    public void selectOptionFromAllModels(String option){selectFromDropdown(allModels, option);
        LOG.info("select from drop down all models success");}

    public void typeZipCodeBodyStyle(String zip){type(zipCodeByBodyStyle, zip);
        LOG.info("type zip code by body style success");}
    public void clickSearchByMakeAndModel(){click(searchByMakeAndModel);
        LOG.info("click search by make and model success");}
    public void clickSearchByBodyStyle(){click(searchByBodyStyle);
        LOG.info("click search by body style success");}


    public void typeZipCodeByMakeAndModel(String zip) {type(zipCodeByMakeAndModel, zip);
        LOG.info("type zip code by make and model success");}
}
