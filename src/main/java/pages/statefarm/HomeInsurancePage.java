package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeInsurancePage  extends CommonAPI {

    //Home insurance
    @FindBy(xpath = "//span[text()='Insurance']")
    private WebElement insurance;
    @FindBy(css = "#oneX-1-insurance")
    WebElement home;
    @FindBy(css="#quote-main-zip-code-input")
    WebElement zipCode;
    @FindBy(xpath = "//button[@id='getaQuoteButton']")
    WebElement startQuote;

    //articles insurance
    @FindBy(xpath = "//*[text()='Personal Articles']")
    WebElement personalArticles;
    @FindBy(css = "#callout-agent-zip-code-input_1")
    WebElement zip;
    @FindBy(css = "#quote-main-zip-code-button_1")
    WebElement findAgent;

    //farm and ranch
    @FindBy(xpath = "//a[text()='Farm and Ranch']")
    WebElement ranchAndFarm;

    public HomeInsurancePage(WebDriver driver){PageFactory.initElements(driver, this);}

    //get home insurance
    public void clickOnInsurance(){click(insurance);}
    public void clickOnHome(){click(home);}
    public void typeInZipCode(String zip){type(zipCode, zip);}
    public void clickOnStartQuote(){click(startQuote);}

    //articles insurance
    public void clickOnPersonalArticles(){click(personalArticles);}
    public void clickOnFindAgent(){click(findAgent);}
    public void typeZip(String zip1){type(zip, zip1);}

    //farm and ranch
    public void clickOnFarmAndRanch(){click(ranchAndFarm);}

}
