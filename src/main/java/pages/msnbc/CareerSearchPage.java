package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CareerSearchPage extends CommonAPI {

    @FindBy(css = "input[class='input-search']")
    private WebElement careerSearchButton;

    @FindBy(xpath = "//input[@placeholder='Find a Job...']")
    public WebElement findJobSearchField;

    @FindBy(css = "div[class='react-autosuggest__container react-autosuggest__container--open'] ul li")
    private List<WebElement> autoSuggestList;

    @FindBy(css = "div[class='job-location-filter selected-filters']")
    private WebElement searchResultHeader;

    @FindBy(css = "input[placeholder='Search by Location']")
    private WebElement locationSearchField;

    @FindBy(css = "li[id='react-autowhatever-1--item-7'] div")
    private WebElement selectAutomationEngineerFromSuggestion;

    @FindBy(css = "i[class='far fa-arrow-right']")
    private WebElement searchArrowJobPage;

    @FindBy(css = "div[class='job-selector selector ']")
    private WebElement careerLevelDropdown;

    @FindBy(css = "div[class='collapsible-content'] [class='location-checkbox']")
    private WebElement careerlevelOptions;

    @FindBy(css = "div.profession-list div:nth-child(2) div")
    public WebElement entryLevelCheckBox;

    @FindBy(css = ".list-filters-apply")
    public WebElement applyFiltersCareerLevel;

    @FindBy(css = "input[class='react-autosuggest__input'] ")
    public WebElement searchFieldViewForScroll;

    @FindBy(css = "span[class='remote-label']")
    public WebElement remoteCheckboxButton;

    @FindBy(css = "div[id='block-findajob']")
    public WebElement findJobArrow;

    @FindBy(xpath = "//div[text()='Businesses']")
    public WebElement businessesCollapsableOptions;

    @FindBy(xpath = "//div[text()='Operations & Technology']")
    public WebElement operationsTechnologyOptionUnderBusinesses;

    @FindBy(xpath = "//div[text()='Technology']")
    public WebElement operationsOptionUnderOperationsTechnology;

    @FindBy(xpath = "//i[text()='Filter Businesses']")
    public WebElement businessesOptionsheader;

    public CareerSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchButtonAndEnter(String input) {
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

    public void typeInJobSearchField(String input){
        type(findJobSearchField, input);
    }

    public void typeAndPressEnterInJobSearchField(String input){typeAndEnter(findJobSearchField, input);}


    public boolean automationEngineerIsClicked(){
       isInteractable(selectAutomationEngineerFromSuggestion);
       return true;
    }

    public void chooseFromAutoSuggestList(String input, String finalOption){
       WebElement choose= findJobSearchField;
       choose.sendKeys(input);
       List <WebElement> options= autoSuggestList;

       for(WebElement option : options) {
           if(option.getText().equalsIgnoreCase(finalOption)){
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
        type(locationSearchField,location);
    }

    public void clickSearchArrow(){
        click(searchArrowJobPage);
    }

    public void clickCareerLevelDropdown(){
        click(careerLevelDropdown);
    }

    public void clickAllCareerLevelOptions(){
        WebElement options= careerlevelOptions;
        while (true){
            click(options);

        }
    }

    public void clickEntryLevelCheckbox(){
        click(entryLevelCheckBox);
    }

    public void clickApplyFiltersCareerLevel(){
        click(applyFiltersCareerLevel);
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

    public void clickOperationsTechnologyOptionUnderBusinesses(){
        click(operationsTechnologyOptionUnderBusinesses);
    }

    public void clickOperationsOptionUnderOperationsAndTechnology(){
        click(operationsOptionUnderOperationsTechnology);
    }

    public void viewBusinessesOptionsHeader(){
        click(businessesOptionsheader);
    }








}
