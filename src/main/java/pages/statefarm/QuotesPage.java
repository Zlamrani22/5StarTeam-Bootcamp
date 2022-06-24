package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuotesPage extends CommonAPI {

    //quote in general
    @FindBy(xpath = "//span[text()='Get a Quote']")
    private WebElement getQuote;
    @FindBy(css = "#getaquote-select-product")
    private WebElement product;
    @FindBy(css = "#getaquote-zip")
    private WebElement zipCode;
    @FindBy(css = "#getaquote-state-select")
    WebElement states;
    @FindBy(css = "#getaQuoteButton")
    private WebElement startQuoteBtn;

    //life
    @FindBy(css = "#quoteForYouYes")
    WebElement yes;
    @FindBy(css = "#birthDate")
    WebElement dateOfBirth;
    @FindBy(css = "#birthDateContinueButton")
    WebElement continueBox;
    @FindBy(css = "#genderbutton1")
    WebElement MaleBox;

    //medical
    @FindBy(css = "#userBirthDateId")
    WebElement AgeBox;
    @FindBy(css = "#coppaContinueButtonId")
    WebElement okBox;

    //hospital income
    @FindBy(css = "#getaQuoteButton")
    WebElement findAnAgent;
    @FindBy(css = "#search-options-toggle")
    WebElement advancedSearch;

    public QuotesPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(QuotesPage.class);


    //quote in general
    public void getQuote() {click(getQuote);
        LOG.info("click get quote success");}
    public void selectFromMenuDropdown(String option) {selectFromDropdown(product, option);
        LOG.info("select from menu drop down success");}
    public void selectFromMenuDropdown1(String option) {selectFromDropdown(states, option);
        LOG.info("select from menu drop down success");}
    public void typeZipCode(String zip) {type(zipCode, zip);
        LOG.info("type zip code success");}
    public void clickOnStartQuoteBtn() {click(startQuoteBtn);
        LOG.info("click on start quote success");}

    //life
    public void clickYesBtn(){click(yes);
        LOG.info("click yes button success");}
    public void typeDateOfBirth(String DOB){type(dateOfBirth, DOB);
        LOG.info("type date pf birth success");}
    public void clickOnContinueBox(){click(continueBox);
        LOG.info("click on continue box success");}
    public void clickOnMaleBox(){click(MaleBox);
        LOG.info("click on male box success");}


    //hospital income
    public void typeBod(String Bod){type(AgeBox, Bod);
        LOG.info("type birthday success");}
    public void clickOnOKBox(){click(okBox);
        LOG.info("click ok box success");}
    public void clickOnFindAnAgent(){click(findAnAgent);
        LOG.info("click on find agent success");}
    public void clickOnAdvancedSearch(){click(advancedSearch);
        LOG.info("click on advanced search success");}
}
