package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchUsedCarPage extends CommonAPI {

    @FindBy(xpath="//label[@class='ft-homepage-search__tabs__used-car active']")
    WebElement usedCar;
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

    public void clickUsedCar(){click(usedCar);}
    public void clickByMakeModel(){click(byMakeModel);}
    public void clickByBodyStyle(){click(byBodyStyle);}
    public void clickSUV(){click(SUV);}
    public void clickSedan(){click(sedan);}
    public void clickMinivan(){click(minivan);}
    public void clickPickUpTruck(){click(PickUpTruck);}
    public void clickHatchback(){click(hatchback);}
    public void clickConvertible(){click(convertible);}
    public void clickWagon(){click(wagon);}
    public void clickCoupe(){click(coupe);}
    public void selectOptionFromAllMakes(String option){selectFromDropdown(allMakes, option);}
    public void selectOptionFromAllModels(String option){selectFromDropdown(allModels, option);}
    public void typeZipCodeByMakeAndModel(String zip){type(zipCodeByMakeAndModel, zip);}
    public void typeZipCodeBodyStyle(String zip){type(zipCodeByBodyStyle, zip);}
    public void clickSearchByMakeAndModel(){click(searchByMakeAndModel);}
    public void clickSearchByBodyStyle(){click(searchByBodyStyle);}


}
