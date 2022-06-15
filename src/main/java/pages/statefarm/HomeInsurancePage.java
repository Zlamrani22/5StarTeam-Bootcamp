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

    public HomeInsurancePage(WebDriver driver){PageFactory.initElements(driver, this);}

    //get home insurance
    public void clickOnInsurance(){click(insurance);}
    public void clickOnHome(){click(home);}
    public void typeInZipCode(String zip){type(zipCode, zip);}
    public void clickOnStartQuote(){click(startQuote);}

}
