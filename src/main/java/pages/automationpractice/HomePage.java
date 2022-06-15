package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

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
    WebElement bestSellersButton;

    @FindBy(css = "img[src='http://automationpractice.com/modules/themeconfigurator/img/banner-img4.jpg']")
    WebElement sunglassesAndEyewear;

    @FindBy(xpath = "//*[@id='htmlcontent_top']//ul//li[2]/a/img")
    WebElement summerCollection;

    @FindBy(xpath = "//div[@class='popup-link prestashop-link primary-link secondary-os-font-bold']/a[@href='https://www.prestashop.com/en/download']")
    WebElement prestaShopDownloadButton;

    @FindBy(xpath = "//*[@id='htmlcontent_home']/ul/li[3]/a/img")
    public WebElement womensCoatsAndJacketsButton;


    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
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
    public void prestaShopDownloadButton(){
        click(prestaShopDownloadButton);
    }
    public WomensCoatsAndJacketsPage clickWomensCoatsAndJacketsButton(){
        click(womensCoatsAndJacketsButton);
        return new WomensCoatsAndJacketsPage(getDriver());
    }
}
