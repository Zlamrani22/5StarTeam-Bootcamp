package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    @FindBy(xpath = "//select[@id='sort-listing']")
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

    public void clickNewCar(){click(newCar);}


    public void clickNewCarByMakeModel(){click(newCarByMakeModel);}
    public void selectOptionFromNewCarAllMakes(String option){selectFromDropdown(newCarAllMakes, option);}
    public void selectOptionFromNewCarAllModels(String option){selectFromDropdown(newCarAllModels, option);}
    public void typeNewCarZipCodeByMakeAndModel(String zip){type(newCarZipCodeByMakeAndModel, zip);}
    public void clickNewCarSearchByMakeAndModel(){click(newCarSearchByMakeAndModel);}
    public void selectOptionFromSortListing(String option){selectFromDropdown(sortListing, option);}

    public void typeEmail(String emailAddress){type(email, emailAddress);}
    public void clickEmailMe(){click(emailMe);}
    public void clickColorBlack(){click(colorBlack);}

    public void selectOptionFromRadius(String option){selectFromDropdown(radius, option);}


    }







