package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddToCartStorePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AddToCartStorePage.class);

    @FindBy(css = "div[class='grid-product__color-image grid-product__color-image--39517818290330 small--hide']")
    public WebElement logoMug;

    @FindBy(css = "div[class='grid-product__color-image grid-product__color-image--35684997202074 small--hide']")
    private WebElement maddowShowShirt;

    @FindBy(css = "div[class='drawer__header appear-animation appear-delay-1']")
    public WebElement checkoutPageLogo;

    @FindBy(css = "#AddToCart-product-template")
    public WebElement addToCart;

    @FindBy(css = "button[name='checkout']")
    private WebElement checkout;

    @FindBy(xpath = "//a[@class='site-nav__link site-nav__link--underline site-nav__link--has-dropdown'][normalize-space()='Shop by Product']")
    public WebElement shopByProductButton;

    @FindBy(xpath = "//a[text()='Accessories']")
    private WebElement accessoriesListedInShopByProductDropdown;

    @FindBy(xpath = "//a[normalize-space()='Shop By Show']")
    public WebElement shopByShowHeaderTab;

    @FindBy(xpath = "//a[@class='site-nav__dropdown-link'][normalize-space()='The Office']")
    private WebElement theOfficeShowInShopByShow;

    @FindBy(xpath = "//div[@id='CollectionSidebar-1']//a[@title='Narrow selection to products matching tag Bags'][normalize-space()='Bags']")
    private WebElement bagsCheckboxTheOfficeShopPage;

    @FindBy(xpath = "(//div[normalize-space()='The Office Dunder Mifflin Tote Bag'])[1]")
    private WebElement dunderMifflinToteBag;

    @FindBy(css = "select[id='SortBy']")
    public WebElement storePageSortByDropdown;

    @FindBy(css = "option[value='best-selling']")
    private WebElement bestSellingOption;

    @FindBy(xpath = "//div[normalize-space()='Shopping Cart']")
    public WebElement shoppingCartLogo;


    @FindBy(xpath = "//div[@class='ajaxcart__product appear-animation appear-delay-3']//button[@aria-label='Increase item quantity by one']//*[name()='svg']")
    private WebElement increaseQuantityOnSelectedItem;


    @FindBy(xpath = "//input[@id='updates_36015264202906:91381dde05b9d431c9271fdca02e2cf5']")
    private WebElement itemIncreasedWindow;

    @FindBy(css = "button[class='needsclick klaviyo-close-form kl-private-reset-css-Xuajs1']")
    private WebElement closePopup;

    @FindBy(xpath = "(//div[@class='grid-product__meta'])[1]")
    public WebElement firstProductStorePage;

    //@FindBy(xpath = "(//h2[normalize-space()='Trending Products'])[1]")

    public AddToCartStorePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectLogoMug() {
        click(logoMug);
        LOG.info("Clicked on Logo Mug success");
    }

    public void clickRachelMaddowLogoTee() {
        click(maddowShowShirt);
        LOG.info("Clicked on Maddow Logo Tee success");
    }

    public boolean checkoutPageLogoDisplayed() {
        isPresent(checkoutPageLogo);
        LOG.info("Checkout page opened success");
        return true;
    }

    public void addToCartBtn() {
        click(addToCart);
        LOG.info("Item added to cart success");
    }

    public void checkoutBtn() {
        click(checkout);
        LOG.info("Checkout button clicked success");
    }

    public void clickAccessoriesInShopByProduct() {
        click(accessoriesListedInShopByProductDropdown);
        LOG.info("Accessories selected in dropdown success");
    }

    public void clickTheOfficeUnderShopByShowHoverOverMenu() {
        click(theOfficeShowInShopByShow);
        LOG.info("The Office Show Selected in Hoverover menu success");
    }

    public void selectBagsCheckboxTheOfficeStorePage() {
        click(bagsCheckboxTheOfficeShopPage);
        LOG.info("Bags Checkbox is clicked and bags page opens success");
    }

    public void clickSortBy() {
        click(storePageSortByDropdown);
        LOG.info("Sort by dropdown clicks and opens success");
    }

    public void clickDunderMufflinToteBag() {
        click(dunderMifflinToteBag);
        LOG.info("Dunder Mifflin bag clicked and opens success");

    }

    public void selectItemSortByDropdown(String option) {
        selectFromDropdown(storePageSortByDropdown, option);
        LOG.info("Sort by dropdown opens and option selected success");
    }

    public void clickBestSelling(){
        click(bestSellingOption);
    }

    public void shoppingCartLogoDisplayed() {
        getElementText(shoppingCartLogo);
        LOG.info("Shopping cart logo displayed success");
    }

    public void increaseQuantityOnSelectedItem() {
        WebElement increase = increaseQuantityOnSelectedItem;

        for (int i = 1; i <= 3; i++) {
            click(increase);
        }
        LOG.info("Item increase button clicked and number increased success");

    }

    public boolean itemIncreased(){
        isInteractable(itemIncreasedWindow);
        LOG.info("Items increased by one success");
        return true;

    }

    public void clickToClosePopup(){
        switchFrames(0);
        click(closePopup);
        LOG.info("Popup closed success");
    }

    public String copyNbcStoreFirstItemText(){
        String product= firstProductStorePage.getText();
        return product;

    }



}
