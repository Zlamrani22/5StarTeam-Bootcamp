package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchNewCarByMakeAndModelPage extends CommonAPI {
    @FindBy(xpath = "//span[text()='New Car']")
    WebElement newCar;
    @FindBy(xpath = "//body[1]/main[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]")
    WebElement newCarByMakeModel;
    @FindBy(xpath = "//select[@id='carPickerNew_makerSelect']")
    WebElement newCarAllMakes;
    @FindBy(xpath = "//select[@id='carPickerNew_modelSelect']")
    WebElement newCarAllModels;
    @FindBy(xpath = "//input[@id='dealFinderZipNewId']")
    WebElement newCarZipCodeByMakeAndModel;
    @FindBy(xpath = "//input[@id='newCarSearchForm_0']")
    WebElement newCarSearchByMakeAndModel;
    @FindBy(xpath = "//*[@id='sort-listing']")
    WebElement sortListing;
    @FindBy(xpath = "//input[@id='subscribe-email-input']")
    WebElement email;
    @FindBy(xpath = "//div[text()='Email me']")
    WebElement emailMe;
    @FindBy(xpath = "//span[contains(text(),'Black')]")
    WebElement colorBlack;

    @FindBy(xpath = "//select[@id='select-filter']")
    WebElement radius;




    public SearchNewCarByMakeAndModelPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(SearchNewCarByMakeAndModelPage.class);

    public void clickNewCar(){click(newCar);
        LOG.info("click new car success");}
    public void clickNewCarByMakeModel(){click(newCarByMakeModel);
    LOG.info("click new car by make and model success");}
    public void selectOptionFromNewCarAllMakes(String option){selectFromDropdown(newCarAllMakes, option);
        LOG.info("select from drop down new car all makes success");}
    public void selectOptionFromNewCarAllModels(String option){selectFromDropdown(newCarAllModels, option);
        LOG.info("select from drop down all models success");}
    public void typeNewCarZipCodeByMakeAndModel(String zip){type(newCarZipCodeByMakeAndModel, zip);
        LOG.info("type zip code success");}
    public void clickNewCarSearchByMakeAndModel(){click(newCarSearchByMakeAndModel);
        LOG.info("click new car search make and model success");}
    public void selectOptionFromSortListing(String option){selectFromDropdown(sortListing, option);
        LOG.info("select from drop down sport listing success");}

    public void typeEmail(String emailAddress){type(email, emailAddress);
        LOG.info("type email success");}
    public void clickEmailMe(){click(emailMe);
        LOG.info("click email me success");}
    public void clickColorBlack(){click(colorBlack);
        LOG.info("click black color success");}

    public void selectOptionFromRadius(String option){selectFromDropdown(radius, option);
        LOG.info("click select from drop down radius success");}


    }







