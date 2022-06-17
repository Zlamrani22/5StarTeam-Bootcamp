package testapp.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private WebElement dropDownTab;

    @FindBy(xpath = "//span[text()='TV Schedule']")
    private WebElement tvSchedule;

    @FindBy(xpath = "//span[text()=\"MSNBC Store\"]")
    private WebElement storeMenuOption;

    @FindBy(xpath = "//span[text()='Podcasts']")
    private WebElement podcastOption;

    @FindBy(xpath = "//span[text()='MSNBC Newsletters']")
    private WebElement newsletterOption;

    @FindBy(css = "div[class='menu-section menu-section-more'] ul[class='menu-list']")
    private WebElement menuDropdownOptionsText;

    @FindBy(css = "h2[class='styles_title__RQZ4f'] a")
    private WebElement msnbcDaily;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickPeackockTab(){click(mainpagePeacockTab);}

    public void clickColumnist() {
        click(mainPageColumnistTab);
    }

    public void clickMaddow() {
        click(mainPageMaddowTab);
    }

    public void clickMorningJoe() {
        click(mainPageMornJoeTab);
    }

    public void clickDeadLine() {
        click(mainPageDeadlineTab);
    }

    public void clickBeat() {
        click(mainPageBeatTab);
    }

    public void clickReidout() {
        click(mainPageReidTab);
    }

    public void clickLiveTvTab(){click(mainPageLiveTVTab);}

    public void clickDropdownTab() {
        click(dropDownTab);
        LOG.info("Dropdown menu opened success");
    }

    public void selectTvSchedule() {
        click(tvSchedule);
    }

    public void viewHomePageDropdownOptions() {
        String elements = getElementText(menuDropdownOptionsText);
        LOG.info("");
        // System.out.println(elements);
    }


    public void selectStoreOptionFromMenu(){
        click(storeMenuOption);
        LOG.info("Select Store option from Menu dropdown success");
    }

    public void selectPodcastOption(){
        click(podcastOption);
    }

    public void selectNewsletterOption(){
        click(newsletterOption);
    }

    public void selectMSNBSDailyNews(){
        click(msnbcDaily);
    }



}


//    public List<String> getHomePageDropdownOptions(){
//        List<String> options = new ArrayList<>();
//        List<WebElement> elements = getDropDownOptions(menuDropdownOptions);
//        for (WebElement element:elements) {
//            options.add(element.getText());
//        }
//        return options;
//    }


        //reusable steps
//    public void searchElement(String item){
//        type(searchField, item);
//    }
//    public void clickSearchBtn(){
//        click(searchBtn);
//    }
//    public void clearSearchField(){
//        clear(searchField);
//    }
//    public void searchElementAndEnter(String item){
//        typeAndEnter(searchField, item);
//    }
//    public void selectOptionFromMenuDropdown(String option){
//        selectFromDropdown(menuDropdown, option);
//    }
//    public List<String> getHomePageDropdownOptions(){
//        List<String> options = new ArrayList<>();
//        List<WebElement> elements = getDropDownOptions(menuDropdown);
//        for (WebElement element:elements) {
//            options.add(element.getText());
//        }
//        return options;
//    }
//    public void selectOptionFromMenuDropdownWithSelectOptions(String option){
//        List<WebElement> elements = getDropDownOptions(menuDropdown);
//        for (WebElement element:elements) {
//            if (element.getText().equalsIgnoreCase(option)){
//                element.click();
//            }
//        }
//    }
//    public void selectOptionFromMenuDropdownWithGivenText(String option){
//        List<WebElement> elements = menuDropdownOptions;
//        for (WebElement element :elements) {
//            if (element.getText().equalsIgnoreCase(option)){
//                element.click();
//            }
//        }
//    }
//    public void hoverOverFloatingMenu(WebDriver driver){
//        hoverOver(driver, floatingMenu);
//    }
//    public void clickOnLoginBtn(){
//        click(signInBtn);
//    }



