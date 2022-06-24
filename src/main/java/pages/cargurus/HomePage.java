package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends CommonAPI {

    @FindBy(xpath="//a[contains(text(),'Advertise')]")
    WebElement advertise;
    @FindBy(xpath="//body/div[@id='main']/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]")
    WebElement contactSupport;
    @FindBy(xpath ="//a[text()='Contact CarGurus Here']")
    WebElement contactCarGurusHere;
    @FindBy(xpath="//*[text()='Sign in / Register']")
    WebElement signInBtn;
    @FindBy(xpath="//*[@name='registerEmail']")
    WebElement userEmail;
    @FindBy(xpath="//*[text()='Next']")
    WebElement nextBox;

    @FindBy(css="#loginPassword")
    WebElement userPassword;

    @FindBy(xpath="//*[@type='submit']")
    WebElement signInBtn1;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[3]/div[1]/div[1]/section[1]/section[1]/section[2]/form[1]/section[1]/fieldset[2]/label[1]/input[1]")
    WebElement licensePlate;
    @FindBy(xpath="//*[@class='c2dVinFormDropDown']")
    WebElement state;

    @FindBy(xpath="//label[contains(text(),'VIN')]")
    WebElement vin;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[3]/div[1]/div[1]/section[1]/section[1]/section[2]/form[1]/section[1]/fieldset[2]/label[1]/input[1]")
    WebElement enterYourVin;
    @FindBy(xpath="//body/main[@id='main']/div[2]/div[3]/div[1]/div[1]/section[1]/section[1]/section[2]/form[1]/section[1]/button[1]")
    WebElement getYourOffer;
    @FindBy(xpath="//h2[contains(text(),'Screenshots')]")
    WebElement headerText;
    @FindBy(xpath="//div[contains(text(),'Adventure & offroad')]")
    WebElement adventureAndOffRoads;
    @FindBy(xpath="//h1[contains(text(),'4X4 trucks for sale nationwide')]")
    WebElement headerTextOne;
    @FindBy(xpath="//a[@title='Get it on Google Play']")
    WebElement downloadCarGurusApp;

    @FindBy(xpath="//a[contains(text(),'Our Team')]")
    WebElement ourTeam;
    @FindBy(xpath="//h1[contains(text(),'Job Search Results')]")
    WebElement headerTextTwo;
    @FindBy(xpath="//*[@id=\"footer-subscribe-blade\"]/div/div/div[1]/div/a[4]")
    WebElement youtubePage;
    @FindBy(xpath="//yt-formatted-string[contains(text(),'Subscribe')]")
    WebElement subscribe;
    @FindBy(xpath ="//a[contains(text(),'Privacy')]")
    WebElement privacy;
    @FindBy(xpath="//a[text()='Security']")
    WebElement security;
    @FindBy(xpath="//body/div[@id='wrapper']/main[@id='content']/div[@id='contentBody']/div[1]/div[1]/aside[1]/nav[1]/ul[1]/li[3]/a[1]")
    WebElement carrier;
    @FindBy(xpath="//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]")
    WebElement seeOpenRoles;
    @FindBy(xpath="//*[@class='cargurusLogo']")
    WebElement logo;
    @FindBy(xpath="//*[text()='Welcome back, Mustapha']")
    WebElement welcomeMessage;
    @FindBy(css="#account-menu-username")
    WebElement userName ;
    @FindBy(xpath ="//a[contains(text(),'My account')]")
    WebElement myAccount;
    @FindBy(xpath="//h1[contains(text(),'Account settings')]")
    WebElement headerTextThree;
    @FindBy(xpath ="//span[contains(text(),'My garage')]")
    WebElement myGarage;
    @FindBy(xpath="//h1[contains(text(),'Your garage is empty.')]")
    WebElement headerTextFour;



    public HomePage(WebDriver driver){PageFactory.initElements(driver,this);}

    private final Logger LOG = LoggerFactory.getLogger(HomePage.class);



    public void clickOnAdvertise(){click(advertise);
        LOG.info("click advertise success");}

    public void clickOnContactSupport(){click(contactSupport);
        LOG.info("click contact support success");}

    public void clickOnContactCarGurusHere(){click(contactCarGurusHere);
        LOG.info("click contact cargurus here success");}
    public void clickOnSignInBtn(){click(signInBtn);
        LOG.info("click sign in button success");}
    public void typeUserEmail(String email){type(userEmail, email);
        LOG.info("type user email success");}
    public void clickOnNextBox(){click(nextBox);
        LOG.info("click next box success");}
    public void typeUserPassword(String password){type(userPassword, password);
        LOG.info("type user password success");}
    public void clickOnSignInBtn1(){click(signInBtn1);
        LOG.info("click sign in Btn1 success");}

    public void clickOnLicensePlate(){click(licensePlate);
        LOG.info("click license plate success");}

    public void typeLicensePlate(String license){type(licensePlate, license);
        LOG.info("type license plate success");}

    public void selectOptionFromState(String option){selectFromDropdown(state, option);
        LOG.info("select from drop down state success");}

    public void clickOnVin(){click(vin);
        LOG.info("click vin success");}

    public void typeEnterYourVin(String yourVin){type(enterYourVin, yourVin);
        LOG.info("type enter your vin success");}

    public void clickOnGetYourOffer(){click(getYourOffer);
        LOG.info("click get your offer success");}

    public String gertHeaderText(){return getElementText(headerText);}

    public void clickOnAdventureAndOffRoads(){click(adventureAndOffRoads);
        LOG.info("click adventure and off-roads success");}

    public String gertHeaderTextOne(){return getElementText(headerTextOne);}

    public void clickOnDownloadCarGurusApp(){click(downloadCarGurusApp);
        LOG.info("click download CarGurus App success");}

    public void clickOnOurTeam(){click(ourTeam);
        LOG.info("click our team success");}

    public void clickOnYoutubePage(){click(youtubePage);
        LOG.info("click youtube page success");}

    public void clickOnSubscribe(){click(subscribe);
        LOG.info("click subscribe success");}

    public void clickOnPrivacy(){click(privacy);
        LOG.info("click privacy success");}

    public void clickOnSecurity(){click(security);
        LOG.info("click security success");}

    public void clickOnCarrier(){click(carrier);
        LOG.info("click career success");}

    public void clickOnSeeOpenRoles(){click(seeOpenRoles);
        LOG.info("click see open roles success");}

    public String gertHeaderTextTwo(){return getElementText(headerTextTwo);}

    public void clickOnLogo(){click(logo);
        LOG.info("click logo success");}

    public boolean checkLogoIsPresent(){return isPresent(logo);}

    public void clickOnWelcomeMessage(){click(welcomeMessage);
        LOG.info("click welcome message success");}

    public boolean checkWelcomeMessageIsPresent(){return isPresent(welcomeMessage);}
    public void clickOnUserName(){click(userName);
        LOG.info("click user name success");}
    public void clickOnMyAccount(){click(myAccount);
        LOG.info("click my account success");}
    public String gertHeaderTextThree(){return getElementText(headerTextThree);}

    public void clickOnMyGarage(){click(myGarage);
        LOG.info("click my garage success");}

    public String gertHeaderTextFour(){return getElementText(headerTextFour);}







}
