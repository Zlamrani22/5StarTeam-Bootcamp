package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    @FindBy(css = "input[id='gh-btn'] ")
    private WebElement addToCartButton;

    @FindBy(css="input[id='gh-btn'] ")
    private WebElement antiquesButton;

    @FindBy(css = "input[id='gh-btn']")
    private WebElement artButton;

    @FindBy(css = "select[@id='gh-cat']")
    private WebElement babyButton;

    @FindBy(css="input[id='gh-btn']")
    private WebElement bookButton;

    @FindBy(css="input[id='gh-btn']")
    private WebElement brandOutletButton;

    @FindBy(xpath = "//select[@id='gh-cat'] ")
    public WebElement bussinessAndIndusterialButton;

    @FindBy(xpath = "//a[normalize-space()='Buy']")
    private WebElement buyButton;

    @FindBy(css = "input[id='gh-btn']")
    public WebElement cameraAndPhotoButton;

    @FindBy(css = "input[id='gh-btn']")
    private WebElement cellPhoneAndAccessoriesButton;

    @FindBy(css = " li[class='hl-cat-nav__active'] span")
    public WebElement closeAccountButton;

    @FindBy(css="input[id='gh-btn']")
    private WebElement clothingAndAccessoriesButton;

    @FindBy(css="input[id='gh-btn']")
    private WebElement coinButton;

    @FindBy(css="input[id='gh-btn']")
    public WebElement collectiblesAndArtButton;

    @FindBy(xpath = "//span[normalize-space()='Computers, Tablets & Network")
    private WebElement computerAndTabletButton;

    @FindBy(css = " select [id='gh-cat']")
    public WebElement craftButton;

    @FindBy(xpath="//a[normalize-space()='Daily Deals']")
    public static WebElement dailyDealsButton;

    @FindBy(css = "select [id='gh-cat']")
    public WebElement dollsAndBearsButton;

    @FindBy(css = "select[@id='gh-cat']")
    private WebElement dvdAndMovieButton;

    @FindBy(css="input[id='gh-btn']")
    private WebElement ebayRefurbishedButton;

    @FindBy(css = " input[id='gh-btn']")
    public WebElement electronicButton;

    @FindBy(css = "select[@id='gh-cat']")
    private WebElement entertaintmentMemorabiliaButton;

//    @FindBy(xpath = "//a[@id='need-help-signin-link']")
//    public WebElement forgotPasswordButton;

    @FindBy(css="input[id='gh-btn']")
    private WebElement getYourThingsButton;

//    @FindBy(xpath = "//a[@id='need-help-signin-link']")
//    public WebElement forgotUserIdButton;

    @FindBy(xpath = "//select[@id='gh-cat']")
    private WebElement giftCardAndCouponButton;

    @FindBy(xpath = "//a[@class='gh-p'][normalize-space()='Help & Contact']")
    public WebElement helpAndContacttButton;

    @FindBy(css="input[id='gh-btn']")
    public WebElement homeAndGardenButton;

    @FindBy(xpath = "//select[@id='gh-cat']")
    private WebElement healthAndBeautyButton;

    @FindBy(xpath = "//span[normalize-space()='Home']")
    public WebElement homeButton;

    @FindBy(css="input[id='gh-btn']")
    public WebElement howToDonateButton;

    @FindBy(xpath = "//a[contains(text(),'Messages')]")
    public WebElement inboxMessageButton;

    @FindBy(css = "input[id='gh-btn']")
    public WebElement invalidSigninButton;

    @FindBy(xpath="//span[@id='gh-ug']//a[contains(text(),'Sign in')]")
    public WebElement signinButton;

    @FindBy(css="input[id='gh-btn']")
    public WebElement motorButton;

    @FindBy(xpath = "//select[@id='gh-cat']")
    public WebElement musicButton;

    @FindBy(css = "a[title='My eBay']")
    public WebElement myEbaytButton;

    @FindBy(css = "#gh-cat")
    public WebElement petSupplyButton;

    @FindBy(css="input[id='gh-btn']")
    public WebElement policyButton;

    @FindBy(xpath = "//select[@id='gh-cat']")
    private WebElement potteryAndGlassButton;

    @FindBy(css = "input[id='gh-btn'] ")
    public WebElement realEstateButton;

    @FindBy(xpath = "//a[normalize-space()='Refresh your home for less']")
    private WebElement refreshYourHomeForLessButton;

    @FindBy(xpath = "//span[normalize-space()='register page']")
    public WebElement registerButton;

    @FindBy(css="input[id='gh-btn']")
    private WebElement savedSearchButton;

    @FindBy(css = "input[id='gh-btn'] ")
    public WebElement searchButton;

    @FindBy(css = "input[id='gh-btn']")
    public WebElement sellingButton;

    @FindBy(css = "input[id='gh-btn']")
    public WebElement shopByCatogoryButton;

    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    private WebElement singOutButton;

    @FindBy(css="input[id='gh-btn']")
    public WebElement sportingGoodButton;

    @FindBy(xpath = " //select[@id='gh-cat']")
    public WebElement stampsButton;

    @FindBy(xpath = "//a[contains(text(),'Today'deal')]")
    private WebElement todaydealButton;

    @FindBy(css="input[id='gh-btn']")
    public WebElement toysButton;

    @FindBy(xpath = " //select[@id='gh-cat']")
    public WebElement travelButton;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement validPasswordtButton;

    @FindBy(css="input[id='gh-btn']")
    public WebElement watchesAndJewellyButton;

    @FindBy(css = "a[title='Watchlist']")
    private WebElement watchlistButton;

    @FindBy(xpath = "//a[normalize-space()='Womens Sandals']")
    private WebElement womenSandalsButton;

    @FindBy(xpath = "/a[normalize-space()='Wallet Women']")
    private WebElement womenWalletButton;

    @FindBy(css = "input[id='gh-btn']")
    private WebElement aboutEbayButton;

    @FindBy(css = "input[id='gh-btn']")
    private WebElement advancedSearchButton;

    @FindBy(xpath = " //a[@class='gf-bttl thrd'][normalize-space()='Community']")
    private WebElement communityButton;

    @FindBy(css = "select[id='gh-cat']")
    private WebElement dropDownMenu;



    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCart() {
        click(addToCartButton);
    }

    public void selectOptionFromDropDown(String option) {
        selectFromDropdown(dropDownMenu, option);
    }

    public void clickAntiques() {
        click(antiquesButton);
    }

    public void clickArt() {
        click(artButton);
    }

    public void clickBaby() {
        click(babyButton);
    }

    public void clickBook() {
        click(bookButton);
    }

    public void clickBrandOutlet() {
        click(brandOutletButton);
    }

    public void clickBusinessAndIndusterial() {
        click(bussinessAndIndusterialButton);
    }

    public void clickBuy() {
        click(buyButton);
    }

    public void clickCameraAndPhoto() {
        click(cameraAndPhotoButton);
    }

    public void clickCellPhoneAndAccessories() {
        click(cellPhoneAndAccessoriesButton);
    }

    public void clickCloseAccount() {
        click(closeAccountButton);
    }

    public void clickClothingAndAccessories() {
        click(clothingAndAccessoriesButton);
    }

    public void clickCoin() {
        click(coinButton);
    }

    public void clickCollectiblesAndArt() {
        click(collectiblesAndArtButton);
    }

    public void clickComputerAndTablet() {
        click(computerAndTabletButton);
    }

    public void clickCraft() {
        click(craftButton);
    }

    public void clickDailyDeals() {
        click(dailyDealsButton);
    }

    public void clickDollsAndBears() {
        click(dollsAndBearsButton);
    }

    public void clickDvdAndMovie() {
        click(dvdAndMovieButton);
    }

    public void clickEbayRefurbished() {
        click(ebayRefurbishedButton);
    }

    public void clickeElectronic() {
        click(electronicButton);
    }

    public void clickEntertaintmentMemorabilia() {
        click(entertaintmentMemorabiliaButton);
    }

    public void clickAboutEbay() {
        click(aboutEbayButton);
    }

    public void clickCommunity() {
        click(communityButton);
    }

    public void clickGetYourThings() {
        click(getYourThingsButton);
    }

    public void clickGiftCardAndCoupon() {
        click(giftCardAndCouponButton);
    }

    public void clickHealthAndBeauty() {
        click(healthAndBeautyButton);
    }

    public void clickHelpAndAccount() {
        click(helpAndContacttButton);
    }

    public void clickHomeAndGarden() {
        click(homeAndGardenButton);
    }

    public void clickHowToDonate() {
        click(howToDonateButton);
    }

    public void clickInboxMessage() {
        click(inboxMessageButton);
    }

    public void clickInvalidSignin() {
        click(invalidSigninButton);
    }

    public void clickSingin() {
        click(signinButton);
    }

    public void clickMotor() {
        click(motorButton);
    }

    public void clickMusic() {
        click(musicButton);
    }

    public void clickMyEbay() {
        click(myEbaytButton);
    }

    public void clickPetSupply() {
        click(petSupplyButton);
    }

    public void clickPolicy() {
        click(policyButton);
    }

    public void clickpotteryAndGlass() {
        click(potteryAndGlassButton);
    }

    public void clickRealEstate() {
        click(realEstateButton);
    }

    public void clickRefreshYourHomeForLess() {
        click(refreshYourHomeForLessButton);
    }

    public void clickRegister() {
        click(registerButton);
    }

    public void clickSave() {
        click(savedSearchButton);
    }
    public void clickadvancedSearchbutton() {
        click(advancedSearchButton);
    }

    public void clickSearch() {
        click(searchButton);
    }

    public void clickSelling() {
        click(sellingButton);
    }

    public void clickShopByCategory() {
        click(shopByCatogoryButton);
    }

    public void clickSignOut() {
        click(singOutButton);
    }

    public void clickSportingGood() {
        click(sportingGoodButton);
    }

    public void clickStamps() {
        click(stampsButton);
    }

    public void clickTodayDeal() {
        click(todaydealButton);
    }

    public void clickToys() {
        click(toysButton);
    }

    public void clickTravel() {
        click(travelButton);
    }

    public void clickValidEmail() {
        click(validPasswordtButton);
    }

    public void clickWatchesAndJewelly() {
        click(watchesAndJewellyButton);
    }

    public void clickWomenSandals() {
        click(womenSandalsButton);
    }

    public void clickWatchList() {
        click(watchlistButton);
    }

    public void clickWomenWallet() {
        click(womenWalletButton);
    }

    public void clickSavedSearch() {
    }

    public void clickEelecteronic() {
    }

    public void clickHelpAndContact() {
    }
}


