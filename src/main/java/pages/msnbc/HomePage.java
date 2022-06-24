package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HomePage.class);

    @FindBy(css = "li[class='shortcuts-list-item']")
    private WebElement mainpagePeacockTab;

    @FindBy(css = "div[class='shortcuts h-h'] li:nth-child(2)")
    private WebElement mainPageColumnistTab;

    @FindBy(xpath = "//a[text()='Rachel Maddow']")
    private WebElement mainPageMaddowTab;

    @FindBy(xpath = "//a[text()='Morning Joe']")
    private WebElement mainPageMornJoeTab;

    @FindBy(xpath = "//a[text()='Deadline: WH']")
    private WebElement mainPageDeadlineTab;

    @FindBy(xpath = "//a[text()='The Beat']")
    private WebElement mainPageBeatTab;

    @FindBy(xpath = "//a[text()='The ReidOut']")
    private WebElement mainPageReidTab;

    @FindBy(css = "div[class='mini-tease-local mini-tease-local--live']")
    private WebElement mainPageLiveTVTab;

    @FindBy(css = "button[class='hamburger js-menu-toggle']")
    public WebElement dropDownTab;

    @FindBy(xpath = "//span[text()='TV Schedule']")
    public WebElement tvSchedule;

    @FindBy(xpath = "//span[text()=\"MSNBC Store\"]")
    public WebElement storeMenuOption;

    @FindBy(xpath = "//span[text()='Podcasts']")
    private WebElement podcastOption;

    @FindBy(xpath = "//span[text()='MSNBC Newsletters']")
    private WebElement newsletterOption;

    @FindBy(css = "div[class='menu-section menu-section-more'] ul[class='menu-list']")
    private WebElement menuDropdownOptionsText;

    @FindBy(css = "h2[class='styles_title__RQZ4f'] a")
    private WebElement msnbcDaily;

    @FindBy(css = "div[class='search-inner'] input[class='search-input js-search-input']")
    public WebElement dropDownSearchField;

    @FindBy(xpath = "//h2[text()='The Next 25: Celebrating 25 years of MSNBC']")
    public WebElement celebratingMSNBCTitle;

    @FindBy(xpath = "(//div[@class='styles_baconPagingDots__G_Znw'])[4]//button")
    private List<WebElement> celebratingMSNBCButtons;

    @FindBy(css = "a[class='animated-ghost-button animated-ghost-button--normal styles_seeAllButton__oNAl4']")
    private WebElement seeAllDailyNBCNews;

    @FindBy(xpath = "//h2[text()='Know Your Value']")
    public WebElement knowYourValueHeaderText;

    @FindBy(css = ".msnbcDaily__footer-info-text")
    public WebElement msnbcDailyFooterHomePage;

    @FindBy(css = ".animated-ghost-button.animated-ghost-button--normal.msnbcDaily__action-button")
    private WebElement subscribeToMsnbcDailyButton;

    @FindBy(css = ".gcsc-find-more-on-google")
    private WebElement searchResultFooter;

    @FindBy(css = "h2[class='smorgasbord__headline']")
    public WebElement homepageHeadline;

    @FindBy(css = "h1[class='article-hero-headline__htag styles_headlineHTag__RM_0V lh-none-print black-print']")
    public WebElement homepageHeaderDirectedNewPage;

    @FindBy(css = "div[class='brand-svg']")
    public WebElement homepageMSNBCLogo;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public String getHeadlineTextNewPage(){
        String text= getElementText(homepageHeaderDirectedNewPage);
        return text;
    }

    public void clickMsnbcLogoHomePage(){
        click(homepageMSNBCLogo);
    }

    public String getLogoText(){
        String text=getElementText(homepageMSNBCLogo);
        return text;
    }


    public void clickPeackockTab(){
        click(mainpagePeacockTab);
        LOG.info("Peacock tab on main page clicks and opens success");
    }

    public void clickColumnist() {
        click(mainPageColumnistTab);
        LOG.info("Columnist tab on Main page clicks and opens success");
    }

    public void clickMaddow() {
        click(mainPageMaddowTab);
        LOG.info("Maddow tab clicks and opens success");
    }

    public void clickMorningJoe() {
        click(mainPageMornJoeTab);
        LOG.info("Morning Joe tab clicked and opens success");
    }

    public void clickDeadLine() {
        click(mainPageDeadlineTab);
        LOG.info("Deadline tab clicked and opens success");
    }

    public void clickBeat() {
        click(mainPageBeatTab);
        LOG.info("Beat page clicked and opens success");
    }

    public void clickReidout() {
        click(mainPageReidTab);
        LOG.info("Reidout tab clicked and opens success");
    }

    public void clickLiveTvTab(){
        click(mainPageLiveTVTab);
        LOG.info("LiveTv tab clicked and opens success");
    }

    public void clickDropdownTab() {
        click(dropDownTab);
        LOG.info("Dropdown menu opened success");
    }

    public void selectTvSchedule() {
        click(tvSchedule);
        LOG.info("Tv Schedule clicked and opens success");
    }

    public void viewHomePageDropdownOptions() {
        String elements = getElementText(menuDropdownOptionsText);
        LOG.info("Menu dropdown options displayed success");
        // System.out.println(elements);
    }


    public void selectStoreOptionFromMenu(){
        click(storeMenuOption);
        LOG.info("Select Store option from Menu dropdown success");
    }

    public void selectPodcastOption(){
        click(podcastOption);
        LOG.info("Podcast option selected success");
    }

    public void selectNewsletterOption(){
        click(newsletterOption);
        LOG.info("Newsletter button clicked and page opens success");
    }

    public void selectMSNBSDailyNews(){
        click(msnbcDaily);
        LOG.info("MSNBC Daily clicked and opens success");
    }

    public void typeAndEnterInDropdownSearchField(String input){
        typeAndEnter(dropDownSearchField,input);
        LOG.info("Dropdown menu opens and option selected success");
    }

    public void typeInDropdownSearchField(String input){
        type(dropDownSearchField,input);
        LOG.info("Item entered in Dropdown search field success");
    }

    public void clickAllButtonsCelebratingMSNBC() {
        List<WebElement> elements = celebratingMSNBCButtons;
        for (WebElement element : elements) {

            element.click();
        }
        LOG.info("All buttons clicked success");

    }

    public void clickSeeAllLatestNBCNews(){
        click(seeAllDailyNBCNews);
    }

    public void clickSubscribeToMsnbcDaily(){
        click(subscribeToMsnbcDailyButton);
    }



}





