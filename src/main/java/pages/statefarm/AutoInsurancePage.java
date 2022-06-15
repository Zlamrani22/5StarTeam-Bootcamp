package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoInsurancePage extends CommonAPI {

    //get motorcycle insurance
    @FindBy(xpath = "//span[text()='Insurance']")
    private WebElement insurance;
    @FindBy(xpath = "//a[text()='Motorcycle']")
    WebElement motorcycle;
    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement zipCode;
    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement findAgent;

    //get boat insurance
    @FindBy(xpath = "//a[text()='Boat']")
    WebElement boat;

    //get travel trailer insurance
    @FindBy(xpath = "//*[text()='Travel Trailers']")
    WebElement trailer;
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
    WebElement xBox;

    public AutoInsurancePage(WebDriver driver){PageFactory.initElements(driver, this);}

    //get motorcycle insurance
    public void clickOnInsurance(){click(insurance);}
    public void clickOnMotorcycle(){click(motorcycle);}

    public void type(String zip){type(zipCode, zip);}
    public void clickOnFindAgent(){click(findAgent);}

    //get boat insurance
    public void clickOnBoat(){click(boat);}

    //get travel trailer insurance
    public void clickOnTrailer(){click(trailer);}
    public void clickOnXbox(){click(xBox);}



}
