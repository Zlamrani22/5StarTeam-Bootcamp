package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist']")
    public WebElement myWishlistLink;

    @FindBy(css = "input[id='name']")
    public WebElement myWishlistNameInputField;

    @FindBy(xpath = "//*[@id='center_column']//div[2]//ul//li/a/span")
    public WebElement myWishlistButton;

    @FindBy(css = "button[id='submitWishlist']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id='center_column']//div[1]//ul//li[1]/a/span")
    public WebElement orderHistoryDetailsButton;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    public WebElement womenButton;

    @FindBy(xpath = "//*[@id='center_column']//ul//li[5]//div[1]/div/a[1]/img")
    public WebElement printedSummerDressMoreButton;

    @FindBy(xpath = "//*[@id='product_comments_block_extra']/ul/li/a")
    public WebElement writeAReviewLink;

    @FindBy(css = "input[class='inputNew form-control grey newsletter-input']")
    public WebElement newsletterEmailInputField;

    @FindBy(css = "button[name='submitNewsletter']")
    public WebElement newsletterButton;

    @FindBy(css = "a[title='Sign out']")
    public WebElement signOutButton;

    @FindBy(css = "a[title='About us']")
    public WebElement aboutUsButton;

    @FindBy(css = "a[title='Our stores']")
    public WebElement ourStoresButton;

    @FindBy(css = "a[title='Terms and conditions of use']")
    public WebElement termsAndConditionsButton;

    @FindBy(css = "a[title='Sitemap']")
    public WebElement sitemapButton;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickMyWishlistLink() {
        click(myWishlistLink);
    }

    public void typeMyWishlistName(String myWishlistName) {
        type(myWishlistNameInputField, myWishlistName);
    }

    public void clickMyWishlist(){
        click(myWishlistButton);
    }

    public void clickSaveButton() {
        click(saveButton);
    }

    public void clickOrderHistoryDetails() {
        click(orderHistoryDetailsButton);
    }

    public void typeNewsletterEmailInputField(String userEmail){
        type(newsletterEmailInputField, userEmail );
    }

    public void clickNewsletterButton(){
        click(newsletterButton);
    }

    public void clickWomen() {
        click(womenButton);
    }

    public void clickPrintedSummerDressMore() {
        click(printedSummerDressMoreButton);
    }

    public void clickWriteAReview() {
        click(writeAReviewLink);
    }

    public HomePage clickSignOut(){
        click(signOutButton);
        return new HomePage(getDriver());
    }

    public void clickAboutUsButton(){
        click(aboutUsButton);
    }

    public void clickOurStores(){
        click(ourStoresButton);
    }

    public void clickTermsAndConditions(){
        click(termsAndConditionsButton);
    }
    public SitemapPage clickSitemap(){
        click(sitemapButton);
        return new SitemapPage(getDriver());
    }
}
