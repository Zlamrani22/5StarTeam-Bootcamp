package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MSNBCSearchPage extends CommonAPI {
    @FindBy(css = "div[class='gsc-option-menu-container gsc-inline-block']")
    public WebElement sortByDropdown;

    @FindBy(css = "div[class='gsc-option-menu-item']")
    public WebElement dateOptionSortByDropdown;

    @FindBy(css = "div[class='gsc-option-menu-item']")
    public WebElement relevanceOptionSortByDropdown;

    @FindBy(css = "span[id='gs_cb50']")
    public WebElement clearSearchField;

    @FindBy(css = "td[class='gsc-orderby-container']")
    public WebElement sortByOptionSelectedDisplayed;

    @FindBy(css = "input[class='gsc-input']")
    public WebElement searchPageSearchField;

    public MSNBCSearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickSortByDropdown(){
        click(sortByDropdown);
    }

    public void clickDateOptionFromSortByDropdown(){
        click(dateOptionSortByDropdown);
    }

    public void clickRelevanceOptionFromSortByDropdown(){
        click(relevanceOptionSortByDropdown);
    }

    public void clearSearchField(){
        click(clearSearchField);
    }

    public String  displaySortByOptionSelected(){
        String text=getElementText(sortByOptionSelectedDisplayed);
        return text;
    }

    public void typeInSearchPageSearchField(String input){
        typeAndEnter(searchPageSearchField,input);
    }

    public String searchFieldTextDisplayed(){
        String text=getElementText(searchPageSearchField);
        return text;
    }
}
