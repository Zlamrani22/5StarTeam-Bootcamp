package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchNewCarByPricePage extends CommonAPI {

    @FindBy(xpath="//span[text()='New Car']")
    WebElement newCar;
    @FindBy(xpath="/html/body/main/div[2]/div[2]/div[1]/section/div/div/div[2]/div/div/label[3]/span")
    WebElement newCarByPrice;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/select[1]")
    WebElement newCarMinPrice;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/select[1]")
    WebElement newCarMaxPrice;
    @FindBy(xpath="//input[@id='dealFinderZipUsedId_dealFinderFormPriceNew']")
    WebElement newCarByPriceZipCode;
    @FindBy(xpath="//input[@Id='dealFinderFormPriceNew_0']")
    WebElement newCarByPriceSearchBtn;
    @FindBy(xpath="/html/body/main/div[2]/div/div/div[2]/div[2]/div[5]/button/span")
    WebElement nextPageByPrice;

    public SearchNewCarByPricePage(WebDriver driver) {PageFactory.initElements(driver, this);}

    public void clickNewCar(){click(newCar);}

    public void clickNewCarByPrice(){click(newCarByPrice);}
    public void selectOptionFromNewCarMinPrice(String option){selectFromDropdown(newCarMinPrice, option);}
    public void selectOptionFromNewCarMaxPrice(String option){selectFromDropdown(newCarMaxPrice, option);}

    public void typeNewCarByPriceZipCode(String zip){type(newCarByPriceZipCode, zip);}

    public void clickNewCarByPriceSearchBtn(){click(newCarByPriceSearchBtn);}








}
