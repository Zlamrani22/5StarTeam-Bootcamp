package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountLoginPage extends CommonAPI {
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

    @FindBy(css="#account-menu-username")
    WebElement userName ;
    @FindBy(xpath ="//a[contains(text(),'My account')]")
    WebElement myAccount;
    @FindBy(xpath="//body/div[1]/nav[1]/div[1]/ul[2]/li[4]/div[1]/ul[1]/li[2]/a[1]")
    WebElement savedSearch;
    @FindBy(xpath="//body/main[@id='root']/div[@id='cg-mySaved-content']/div[2]/div[1]/div[2]/a[1]/span[1]")
    WebElement newEscalade;
    @FindBy(xpath="//body/div[1]/nav[1]/div[1]/ul[2]/li[4]/div[1]/ul[1]/li[3]/a[1]")
    WebElement savedCars;
    @FindBy(xpath="//span[text()='Start a new search']")
    WebElement startANewSearch;
    @FindBy(xpath="//div[text()='See all recommendations']")
    WebElement seeAllRecommendations;
    @FindBy(xpath="//a[contains(text(),'Recommended cars')]")
    WebElement recommendedCars;
    @FindBy(xpath="//*[@id=\"account-menu-content\"]/ul/li[5]/a")
    WebElement recentlyViewedCars;
    @FindBy(xpath="/html/body/div[1]/nav/div/ul[2]/li[4]/div/ul/li[6]/a")
    WebElement messages;
    @FindBy(xpath="//a[@class='cgds_btn cgds_link_as_btn inboxNoMessages__cta cgds_link_as_btn_defaultSize cgds_btn_isolated']")
    WebElement shopForSellByOwnerVehicles;

    @FindBy(xpath="//a[contains(text(),'Financing')]")
    WebElement financing;
    @FindBy(xpath="//body/div[1]/nav[1]/div[1]/ul[2]/li[4]/div[1]/ul[1]/li[8]/button[1]/*[1]")
    WebElement chooseCountry;
    @FindBy(xpath="//body/div[1]/nav[1]/div[1]/ul[2]/li[4]/div[1]/ul[1]/li[8]/div[1]/ul[1]/li[5]/a[1]/span[1]")
    WebElement unitedKingdom;
    @FindBy(xpath = "/html/body/div[1]/nav/div/ul[2]/li[4]/div/ul/li[9]/a")
    WebElement signOut;
    @FindBy(xpath="//div[text()='Sign in with Facebook']")
    WebElement signInWithFacebook;

    @FindBy(xpath="//div[contains(text(),'Family friendly')]")
    WebElement familyFriendly;
    @FindBy(xpath="//body/div[1]/nav[1]/div[1]/ul[2]/li[1]/div[1]/span[1]/a[1]/*[1]")
    WebElement AddACarReview;
    @FindBy(xpath ="//select[@id='selectMaker']")
    WebElement selectMake;
    @FindBy(xpath = "//select[@id='selectModel']")
    WebElement selectModel;
    @FindBy(xpath="//*[@id=\"selectYear\"]")
    WebElement selectYear;
    @FindBy(xpath="//a[contains(text(),'Start Writing')]")
    WebElement startWriting;


    public AccountLoginPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    private final Logger LOG = LoggerFactory.getLogger(AccountLoginPage.class);

    public void clickOnSignInBtn(){click(signInBtn);
     LOG.info("click sign in button success");}

    public void typeUserEmail(String email){type(userEmail, email);
     LOG.info("type user email success");}

    public void clickOnNextBox(){click(nextBox);
     LOG.info("click on next box success");}
    public void typeUserPassword(String password){type(userPassword, password);
     LOG.info("type user password success");}
    public void clickOnSignInBtn1(){click(signInBtn1);
     LOG.info("click sign in button 1 success");}
    public void clickOnUserName(){click(userName);
     LOG.info("click user name success");}
    public void clickOnMyAccount(){click(myAccount);
     LOG.info("click my account success");}
    public void clickOnSavedSearch(){click(savedSearch);
     LOG.info("click on saved search success");}
    public void clickOnNewEscalade(){click(newEscalade);
     LOG.info("click on new escalade success");}
    public void clickOnSavedCars(){click(savedCars);
     LOG.info("click on saved cars success");}
    public void clickOnStartANewSearch(){click(startANewSearch);
     LOG.info("click on start new search success");}
    public void clickOnSeeAllRecommendations(){click(seeAllRecommendations);
     LOG.info("click see all recommendations success");}
    public void clickOnRecommendedCars(){click(recommendedCars);
     LOG.info("click recommended cars success");}
    public void clickOnRecentlyViewedCars(){click(recentlyViewedCars);
     LOG.info("click recently viewed cars success");}
    public void clickOnMessages(){click(messages);
     LOG.info("click messages success");}
    public void clickOnShopForSellByOwnerVehicles(){click(shopForSellByOwnerVehicles);
     LOG.info("click shop for sell by owner success");}
    public void clickOnFinancing(){click(financing);
     LOG.info("click financing success");}
    public void clickOnChooseCountry(){click(chooseCountry);
     LOG.info("click choose country success");}
    public void clickOnUnitedKingdom(){click(unitedKingdom);
     LOG.info("click united kingdom success");}
    public void clickOnSignOut(){click(signOut);
     LOG.info("click sign out success");}
    public void clickOnSignInWithFacebook(){click(signInWithFacebook);
     LOG.info("click facebook success");}
    public void clickOnFamilyFriendly(){click(familyFriendly);
     LOG.info("click family friendly success");}
    public void clickOnAddACarReview(){click(AddACarReview);
     LOG.info("click add car review success");}
    public void selectOptionFromSelectMake(String option){selectFromDropdown(selectMake, option);
     LOG.info("select from drop down select make success");}
    public void selectOptionFromSelectModel(String option){selectFromDropdown(selectModel, option);
     LOG.info("select from drop down select model success");}
    public void selectOptionFromSelectYear(String option){selectFromDropdown(selectYear, option);
     LOG.info("select from dropdown select year success");}
    public void clickOnStartWriting(){click(startWriting);
     LOG.info("click start writing success");}



}

