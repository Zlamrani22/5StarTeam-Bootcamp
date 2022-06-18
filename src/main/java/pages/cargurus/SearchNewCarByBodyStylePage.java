package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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



    public SearchNewCarByBodyStylePage(WebDriver driver) {PageFactory.initElements(driver, this);}

    public void clickNewCar(){click(newCar);}
    public void clickNewCarByBodyStyle(){click(newCarByBodyStyle);}
    public void clickNewCarSUV(){click(newCarSUV);}
    public void clickNewCarSedan(){click(newCarSEdan);}
    public void clickNewCarPickupTruck(){click(newCarPickupTruck);}
    public void clickNewCarCoupe(){click(newCarCoupe);}
    public void clickNewCarHatchback(){click(newCarHatchback);}
    public void clickNewCarConvertible(){click(newCarConvertible);}
    public void clickNewCarWagon(){click(newCarWagon);}
    public void clickNewCarMinivan(){click(newCarMinivan);}
    public void typeZipCodeNewCarByBodyStyle(String zip){type(zipCodeNewCarByBodyStyle, zip);}
    public void clickSearchNewCarByBodyStyle(){click(searchNewCarByBodyStyle);}



}
