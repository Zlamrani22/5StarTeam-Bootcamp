package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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


    private final Logger LOG = LoggerFactory.getLogger(SearchNewCarByPricePage.class);

    public void clickNewCar(){click(newCar);
    LOG.info("click new cars success");}

    public void clickNewCarByPrice(){click(newCarByPrice);
        LOG.info("click new car by price success");}
    public void selectOptionFromNewCarMinPrice(String option){selectFromDropdown(newCarMinPrice, option);
        LOG.info("select from drop down new car minimum price success");}
    public void selectOptionFromNewCarMaxPrice(String option){selectFromDropdown(newCarMaxPrice, option);
        LOG.info("select from drop down new car maximum price success");}

    public void typeNewCarByPriceZipCode(String zip){type(newCarByPriceZipCode, zip);
        LOG.info("type New Car By Price Zip Code success");}

    public void clickNewCarByPriceSearchBtn(){click(newCarByPriceSearchBtn);
        LOG.info("click New Car By Price Search Btn success");}








}
