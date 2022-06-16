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

    @FindBy(css = "input[placeholder='Find a Job...']")
    private WebElement findJobSearchField;

    @FindBy(css = "ul[class='react-autosuggest__suggestions-list'] li")
    private List<WebElement> autoSuggestList;

    @FindBy(css = "div[class='job-location-filter selected-filters']")
    private WebElement searchResultHeader;

    @FindBy(css = "input[placeholder='Search by Location']")
    private WebElement locationSearchField;


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

    public void typeInJobSearchField(String input){
        type(findJobSearchField, input);
    }

    public void chooseFromAutoSuggestList(String  choice){
        autoSuggest(autoSuggestList,choice);
    }

    public String viewCareerResultsHeader(){
        String text=getElementText(searchResultHeader);
        return text;
    }

    public void enterLocationInCareerSearchField(String location){
        typeAndEnter(locationSearchField,location);
    }

//    public void autoSuggestCareerSearchField(String input,String choice ) {
//        type(findJobSearchField, input);
//        List <WebElement> options=autoSuggestList;
//
//        for (WebElement option : options) {
//
//            if (option.getText().equalsIgnoreCase(choice)) {
//                waitFor(2);
//                option.click();
//              //  break;
//
//            }
//        }
//    }
}
