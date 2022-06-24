package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    //get car insurance
    @FindBy(xpath = "//a[text()='Car Insurance']")
    WebElement carInsurance;
    @FindBy(xpath = " //input[@id='quote-main-zip-code-input']")
    WebElement zip;
    @FindBy(css  = "#quote-main-zip-code-button-1")
    WebElement startQuote;

    //get motor home insurance
    @FindBy(xpath = "//a[text()='Motorhome']")
    WebElement motorHome;

    //get off-road vehicles
    @FindBy(xpath = "//a[text()='Off-road Vehicles']")
    WebElement offRoadVehicle;

    public AutoInsurancePage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(AutoInsurancePage.class);


    //get motorcycle insurance
    public void clickOnInsurance(){click(insurance);
    LOG.info("click insurance success");}
    public void clickOnMotorcycle(){click(motorcycle);
    LOG.info("click motorcycle success");}
    public void type(String zip){type(zipCode, zip);
    LOG.info("type zipcode success");}
    public void clickOnFindAgent(){click(findAgent);
    LOG.info("click find an agent success");}


    //get boat insurance
    public void clickOnBoat(){click(boat);
    LOG.info("click on boat success");}


    //get travel trailer insurance
    public void clickOnTrailer(){click(trailer);
    LOG.info("click on trailer success");}


    //get a car insurance
    public void clickOnCarInsurance(){click(carInsurance);
    LOG.info("click on car insurance success");}
    public void typeZip(String zipcode){type(zip, zipcode);
    LOG.info("type in zip code success");}
    public void clickOnStartQuote(){click(startQuote);
    LOG.info("click start quote success");}

    //get motor home insurance
    public void clickOnMotorHome(){click(motorHome);
    LOG.info("click on motor home success");}

    //get off-road vehicles
    public void clickOnOffRoad(){click(offRoadVehicle);
    LOG.info("click off road vehicle success");}


}
