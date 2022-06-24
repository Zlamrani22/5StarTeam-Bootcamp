package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class CareerSearchPage extends CommonAPI {

    private static Logger LOG = LoggerFactory.getLogger(CareerSearchPage.class);

    @FindBy(css = "input[class='input-search']")
    private WebElement careerSearchButton;

    @FindBy(xpath = "//input[@placeholder='Find a Job...']")
    public WebElement findJobSearchField;

    @FindBy(css = ".react-autosuggest__input--focused")
    private WebElement jobSearchField;

    public void clickJobSearchField2(){
        click(jobSearchField);
    }

//    @FindBy(css = "div[class='react-autosuggest__container react-autosuggest__container--open'] ul li")
//    private List<WebElement> autoSuggestList;

//    @FindBy(css = "ul[class='react-autosuggest__suggestions-list']")
//    private List<WebElement> autoSuggestList;

    @FindBy(css = "div[class='job-location-filter selected-filters']")
    private WebElement searchResultHeader;

    @FindBy(css = "input[placeholder='Search by Location']")
    private WebElement locationSearchField;

    @FindBy(css= "ul[role='listbox'] ")
    private List<WebElement> selectFromSuggestionDropdown;
   // xpath= "//div[@class='react-autosuggest__container react-autosuggest__container--open']//div[@id='react-autowhatever-1']


    @FindBy(css = "i[class='far fa-arrow-right']")
    public WebElement searchArrowJobPage;

    @FindBy(xpath = "//div[text()='Career Level']")
    public WebElement careerLevelCollapsibleOptions;

    @FindBy(css = "div[class='profession-list'] [class='location-checkbox'] ")
    public WebElement careerlevelOptionsCheckbox;


    @FindBy(xpath = "//span[text()='Entry-Level']")
    public WebElement entryLevelCheckBox;
    //div[@class='location-checkbox add-check']//img
    //div[@class='profession-list']//div[1]//div[1]

    @FindBy(css = "div[class='list-filters-apply']")
    public WebElement applyFilters;

    @FindBy(css = "input[class='react-autosuggest__input'] ")
    public WebElement searchFieldViewForScroll;

    @FindBy(css = "span[class='remote-label']")
    public WebElement remoteCheckboxButton;

    @FindBy(xpath= "(//span[@class='fas fa-arrow-right'])[1]")
    public WebElement findJobArrow;

    @FindBy(css = ".business-selector.selector")
    public WebElement businessesCollapsableOptions;

    @FindBy(xpath = "//div[normalize-space()='Operations & Technology']")
    public WebElement operationsTechnologyOptionUnderBusinesses;

    @FindBy(xpath = "//div[text()='Technology']")
    public WebElement operationsOptionUnderOperationsTechnology;

    @FindBy(xpath = "//i[text()='Filter Businesses']")
    public WebElement businessesOptionsheader;

    @FindBy(xpath = "//div[normalize-space()='Automation Engineer']")
    public WebElement automationEngineerOption;

    @FindBy(css = "i[class='far fa-search']")
    private WebElement searchEyeGlassCareerPage;
    
    @FindBy(css = "ul[block='block-nbcucareers-main-menu'] li a")
    private List<WebElement> careerPageNavigationBar;

    @FindBy(css = ".aoi-selector.selector")
    public WebElement areaOfInterestCollapsibleOptions;

    @FindBy(css = ".location-selector.selector")
    public WebElement allLocationsCollapsibleOptions;

    @FindBy(css = "li[class='nav-item'] a")
    public WebElement allLinksCareersFooter;

    @FindBy(css = "#block-footersocialicons-menu")
    public WebElement careersPageFooter;

    @FindBy(xpath = "//trigger-tag[normalize-space()='Asia-Pacific']")
    public WebElement asiaPacificOptionAllLocations;

    @FindBy(xpath = "//div[normalize-space()='Singapore']")
    private WebElement singaporeCountry;

    @FindBy(css = "div[class='Collapsible open-region-dropdown'] div[id='4'] span:nth-child(2)")
    private WebElement singaporeCity;

    @FindBy(css = "div[class='MuiCollapse-wrapperInner-4'] div div[class='MuiCardContent-root-5']")
    public WebElement businessDropdownMenu;

    @FindBy(css = "a[href='/careers']")
    private WebElement careersTabCareersPage;

    @FindBy(css = "a[href='/programs']")
    private WebElement programsTabCareersPage;

    @FindBy(css = "a[href='/internships']")
    private WebElement internshipsTabCareersPage;

    @FindBy(css = "a[href='/brands']")
    private WebElement brandsTabCareersPage;

    @FindBy(css = "a[href='/culture']")
    private WebElement cultureTabCareersPage;

    @FindBy(css = "a[href='/benefits']")
    private WebElement benefitsTabCareersPage;

    @FindBy(css = "a[href='/all-locations']")
    private WebElement locationsTabCareersPage;

    @FindBy(css = "a[href='/faq']")
    private WebElement faqTabCareersPage;


    public CareerSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchButtonAndEnter(String input) {
        click(careerSearchButton);
        typeAndEnter(careerSearchButton, input);
    }

    public void searchButtonCareers(String input) {
        type(careerSearchButton, input);
    }

    public void clearSearchButton() {
        clear(careerSearchButton);
    }

    public void clearJobSearchField(){
        clear(findJobSearchField);
    }

    public void clickJobSearchField(){click(findJobSearchField);}

    public void typeInJobSearchField(String input){
        type(findJobSearchField, input);
    }

    public void typeAndPressEnterInJobSearchField(String input){typeAndEnter(findJobSearchField, input);}

    public void clickLocationFieldCareerPage(){
        click(locationSearchField);
    }


    public void chooseFromAutoSuggestList(String finaloption){

       List <WebElement> options= selectFromSuggestionDropdown;

       for(WebElement option : options) {
           if(option.getText().equalsIgnoreCase(finaloption)){
               option.click();
               break;
           }
       }
    }


    public String viewCareerResultsHeader(){
        String text=getElementText(searchResultHeader);
        return text;
    }

    public void enterLocationInCareerSearchField(String location){
        click(locationSearchField);typeAndEnter(locationSearchField,location);
    }

    public void clickSearchArrow(){
        click(searchArrowJobPage);
    }

    public void clickCareerLevelDropdown(){
        click(careerLevelCollapsibleOptions);
    }


    public void clickEntryLevelCheckbox(){
        click(entryLevelCheckBox);
    }

    public void clickApplyFilters(){
        click(applyFilters);
    }

    public void clickRemoteCheckbox(){
        click(remoteCheckboxButton);
    }

    public void clickFindJobArrow(){
        click(findJobArrow);
    }

    public void clickBusinessesCollapsableOption(){
        click(businessesCollapsableOptions);

    }

    public void scrollDownBusinessCollabsableOptions() {
        scrollDownUsingArrowDown(operationsTechnologyOptionUnderBusinesses);
    }

    public WebElement clickOperationsTechnologyOptionUnderBusinesses(){
        click(operationsTechnologyOptionUnderBusinesses);

        return operationsTechnologyOptionUnderBusinesses;
    }

    public void clickOperationsOptionUnderOperationsAndTechnology(){
        click(operationsOptionUnderOperationsTechnology);
    }

    public void viewBusinessesOptionsHeader(){
        click(businessesOptionsheader);
    }

    public void clickSearchEyeGlass(){
        click(searchEyeGlassCareerPage);
    }

    public void clickCheckBoxEntryLevel(){
        click(entryLevelCheckBox);
    }

    public boolean checkboxIsclicked(){
        checkBoxIsChecked(careerlevelOptionsCheckbox);

        return true;
    }

    public boolean remoteCheckboxIsChecked(){
        isPresent(remoteCheckboxButton);
        return true;
    }

    public boolean clickedAutomationEngineer(){
        isPresent(automationEngineerOption);
        return true;
    }
    
    public void clickAllNavigationBarTabsCareers(){
        List<WebElement> elements= careerPageNavigationBar;
        for (WebElement element:elements)
        {
            element.click();
        }
    }

    public void clickAllLocations(){
        click(allLocationsCollapsibleOptions);
    }

    public void clickAsiaPacificOptionLocations(){
        click(asiaPacificOptionAllLocations);
    }

    public void iterateOverCareersFooterWeblinks() throws IOException {
        iterateOverWeblinks(allLinksCareersFooter,"href");
    }

    public void clickSingaporeAsiaDropdownList(){
        click(singaporeCountry);
    }

    public void clickSingaporeSingaporeDropdow(){
        click(singaporeCity);
    }

    public String getBusinessHeaderText(){
        String text=getElementText(businessesOptionsheader);
        return text;
    }

    public void clickCareersTab(){
        click(careersTabCareersPage);
    }

    public void clickProgramsTab(){
        click(programsTabCareersPage);
    }

    public void clickInternshipsTab(){
        click(internshipsTabCareersPage);
    }

    public void clickBrandsTab(){
        click(brandsTabCareersPage);
    }

    public void clickCultureTab(){
        click(cultureTabCareersPage);
    }

    public void clickBenefitsTab(){
        click(benefitsTabCareersPage);
    }

    public void clickLocationsTab(){
        click(locationsTabCareersPage);
    }

    public void clickFAQTab(){
        click(faqTabCareersPage);
    }



//    public void iterateOverCareersFooterWeblinks() throws IOException {
//        List<WebElement> links= allLinksCareersFooter;
//        SoftAssert a = new SoftAssert();
//        for(WebElement link : links)
//        {
//            String url= link.getAttribute("href");
//
//            HttpsURLConnection connection= (HttpsURLConnection) new URL(url).openConnection();
//            connection.setRequestMethod("HEAD");
//            connection.connect();
//            int respondCode= connection.getResponseCode();
//            System.out.println(respondCode);
//            a.assertTrue(respondCode<400, "The Link with text" + link.getText() + "is broken with code" + respondCode);
//        }
//        a.assertAll();
//    }

//    public void doubleClickAreaOfInterest(){
//        doubleClick(areaOfInterestDropdownCareers);
//    }








}
