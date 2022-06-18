package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationHomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id='header_logo']/a/img")
    public WebElement yourLogoLogo;

    @FindBy(css = "a[title='Log in to your customer account']")
    public WebElement signInButton;

    @FindBy(css = "a[title='View my shopping cart']")
    public WebElement cartButton;

    @FindBy(css = "input[id='search_query_top']")
    private WebElement searchInputField;

    @FindBy(css = "button[name='submit_search']")
    private WebElement searchButton;

    @FindBy(css = "a[title='Contact Us']")
    private WebElement contactUsButton;

    @FindBy(css = "a[class='blockbestsellers']")
    public WebElement bestSellersButton;

    @FindBy(css = "img[src='http://automationpractice.com/modules/themeconfigurator/img/banner-img4.jpg']")
    public WebElement sunglassesAndEyewear;

    @FindBy(xpath = "//*[@id='htmlcontent_top']//ul//li[2]/a/img")
    public WebElement summerCollection;

    @FindBy(xpath = "//div[@class='popup-link prestashop-link primary-link secondary-os-font-bold']/a[@href='https://www.prestashop.com/en/download']")
    public WebElement prestaShopDownloadButton;

    @FindBy(xpath = "//*[@id='htmlcontent_home']/ul/li[3]/a/img")
    public WebElement womensCoatsAndJacketsButton;

    @FindBy(xpath = "//*[@id='footer']//section[2]//div//div/ul/li/a")
    public WebElement womenLink;

    @FindBy(xpath = "//*[@id='homefeatured']//li[4]//div[2]/h5/a")
    public WebElement printedDressButton;

    @FindBy(xpath = "//*[@id='htmlcontent_top']//li[1]/a/img")
    public WebElement saleImage;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    public WebElement tShirtsButton;

    @FindBy(xpath = "//*[@id='center_column']//div[3]//div[2]/a[2]")
    public WebElement moreButton;

    @FindBy(xpath = "//*[@id='center_column']//div[2]/h5/a")
    public WebElement fadedShortSleeveTShirtsLink;

    @FindBy(css = "a[id='color_14']")
    public WebElement blueColorButton;

    @FindBy(css = "a[id='send_friend_button']")
    public WebElement sendToAFriendLink;

    @FindBy(css = "input[id='friend_name']")
    public WebElement nameOfYourFriendInputField;

    @FindBy(css = "input[id='friend_email']")
    public WebElement friendEmailAddressInputField;

    @FindBy(css = "button[id='sendEmail']")
    public WebElement sendEmailButton;

    @FindBy(css = "a[class='ui-slider-handle ui-state-default ui-corner-all ui-state-active']")
    public WebElement priceSliderRight;

    @FindBy(css = "a[title='Delivery']")
    public WebElement deliveryLink;

    @FindBy(css = "a[class='add_to_compare']")
    public WebElement addToCompare;

    @FindBy(css = "button[class='btn btn-default button button-medium bt_compare bt_compare']")
    public WebElement compareButton;

    @FindBy(xpath = "//*[@id='block_contact_infos']//li[3]/span/a")
    public WebElement supportEmailLink;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    public WebElement womenButton;

    public AutomationHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public AutomationHomePage clickYourLogoLogo(){
        click(yourLogoLogo);
        return new AutomationHomePage(getDriver());
    }

    public void clickCartButton(){
        click(cartButton);
    }

    public void clickSignIn(){
        click(signInButton);
    }

    public void typeSearchInputField(String searchItem){
        type(searchInputField, searchItem);
    }

    public void clickSearchButton(){
        click(searchButton);
    }

    public void clickContactUsButton(){
        click(contactUsButton);
    }

    public void SearchElement(String inputValue){
        type(searchInputField, inputValue);
    }

    public void clickBestSellers(){
        click(bestSellersButton);
    }

    public PrestaShopPage clickSunglassesAndEyewear(){
        click(sunglassesAndEyewear);
        return new PrestaShopPage(getDriver());
    }

    public PrestaShopPage clickSummerCollection() {
        click(summerCollection);
        return new PrestaShopPage(getDriver());

    }
    public void clickPrestaShopDownload(){
        click(prestaShopDownloadButton);
    }

    public WomensCoatsAndJacketsPage clickWomensCoatsAndJacketsButton(){
        click(womensCoatsAndJacketsButton);
        return new WomensCoatsAndJacketsPage(getDriver());
    }

    public WomenPage clickWomenLink(){
        click(womenLink);
        return new WomenPage(getDriver());
    }

    public PrintedDressPage clickPrintedDress(){
        click(printedDressButton);
        return new PrintedDressPage(getDriver());
    }

    public PrestaShopPage clickSaleImage(){
        click(saleImage);
        return new PrestaShopPage(getDriver());
    }

    public void clickTShirts(){
        click(tShirtsButton);
    }

    public void clickMore(){
        click(moreButton);
    }

    public void clickFadedShortSleeveTShirts(){
        click(fadedShortSleeveTShirtsLink);
    }

    public void clickBlueColor(){
        click(blueColorButton);
    }

    public void clickSendToAFriend(){
        click(sendToAFriendLink);
    }

    public void typeNameOfYourFriend(String friendName){
        type(nameOfYourFriendInputField, friendName);
    }

    public void typeFriendEmailAddress(String friendEmail){
        type(friendEmailAddressInputField, friendEmail);
    }

    public void clickSendEmail(){
        click(sendEmailButton);
    }

    public void setPriceSlider(Double priceRange) {
        Actions actions = null;
        if (priceRange >= 0 && priceRange <= 100) {
            actions = new Actions(getDriver());
            actions.clickAndHold(priceSliderRight).build().perform();
            actions.moveByOffset(-3, 0).build().perform();
        }
        actions.release(priceSliderRight).build().perform();
    }

    public void clickDeliveryLink(){
        click(deliveryLink);
    }

    public void clickAddToCompare(){
        click(addToCompare);
    }

    public void clickCompare(){
        click(compareButton);
    }

    public void clickSupportEmail(){
        click(supportEmailLink);
    }

    public WomenPage clickWomen(){
        click(womenButton);
        return new WomenPage(getDriver());
    }
}
