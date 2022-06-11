package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonAPI {


    @FindBy(xpath="//label[@class='ft-homepage-search__tabs__used-car active']")
    WebElement usedCar;

    @FindBy(xpath="//body[1]/main[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[2]/span[1]")//sedan
    WebElement byBodyStyle;

    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[2]") //sedan
    WebElement sedan ;

    @FindBy(xpath = "//body[1]/main[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
    WebElement byMakeModel;


    @FindBy(css = "#carPickerUsed_makerSelect")
    static
    WebElement allMakes;

    @FindBy(css = "#carPickerUsed_modelSelect")
    static
    WebElement allModels;

    @FindBy(xpath="//input[@class='form-control dealFinderZip ft-homepage-search__used-car-form__make-model__zip error']")
    static
    WebElement zipMakeModelCode;

    @FindBy(xpath = "//input[@class='cgBtn isolated ft-homepage-search__used-car-form__make-model__submit']")
    WebElement searchByMakeAndModel;

    @FindBy(xpath="//input[@class='form-control dealFinderZip ft-homepage-search__used-car-form__body__zip']")
    WebElement zipCodeBody;

    @FindBy(xpath = "//input[@class='cgBtn isolated ft-homepage-search__used-car-form__body__submit']")
    WebElement searchByBodyStyle;
    public SearchPage(WebDriver driver) {PageFactory.initElements(driver, this);}


    public static void clickOnUsedCar() {clickOnUsedCar();}

    public static void clickByMakeModel(){clickByMakeModel();}


    public void clickByBodyStyle(){click(byBodyStyle);}

   public void clickSedan(){click(sedan);}

    public static void selectOptionFromAllMakes(String option){
        selectFromDropdown(allMakes, option);
    }
    public static void selectOptionFromAllModels(String option){
        selectFromDropdown(allModels, option);
    }
    public static void typeZipMakeModelCode(String zip){type(zipMakeModelCode, zip);}

    public void typeZipBodyCode(String zip){type(zipCodeBody, zip);}

    public void clickOnSearchByMakeAndModel(){click(searchByMakeAndModel);}

    public void clickOnSearchByBodyStyle(){click(searchByBodyStyle);}
}
