package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void clickNewCarPrice(){click(newCarPrice);}
    public void clickNewCarByBodyStylePrice(){click(newCarByBodyStylePrice);}
    public void clickNewCarSUVPrice(){click(newCarSUVPrice);}
    public void selectOptionFromNewCarMinimumPrice(String option){selectFromDropdown(newCarMinimumPrice, option);}
    public void selectOptionFromNewCarMaximumPrice(String option){selectFromDropdown(newCarMaximumPrice, option);}
    public void typeZipCodeNewCarByBodyStylePrice(String zip){type(zipCodeNewCarByBodyStylePrice, zip);}
    public void clickSearchNewCarByBodyStylePrice(){click(searchNewCarByBodyStylePrice);}
}
