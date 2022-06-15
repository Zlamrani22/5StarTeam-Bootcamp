package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotesPage extends CommonAPI {

    //Auto quote
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

    @FindBy(css = "#getaQuoteButton")
    WebElement findAnAgent;
    @FindBy(css = "#search-options-toggle")
    WebElement advancedSearch;

    public QuotesPage(WebDriver driver){PageFactory.initElements(driver, this);}


    //quote in general
    public void getQuote() {click(getQuote);}
    public void selectFromMenuDropdown(String option) {selectFromDropdown(product, option);}
    public void selectFromMenuDropdown1(String option) {selectFromDropdown(states, option);}
    public void zipCode(String zip) {type(zipCode, zip);}
    public void clickOnStartQuoteBtn() {click(startQuoteBtn);}
    //life
    public void clickYesBtn(){click(yes);}

    public void typeDateOfBirth(String DOB){type(dateOfBirth, DOB);}

    public void clickOnContinueBox(){click(continueBox);}
    public void clickOnMaleBox(){click(MaleBox);}

    //hospital income
    public void typeBod(String Bod){
        type(AgeBox, Bod);
    }
    public void clickOnOKBox(){click(okBox);}
    public void clickOnFindAnAgent(){click(findAnAgent);}
    public void clickOnAdvancedSearch(){click(advancedSearch);}
}
