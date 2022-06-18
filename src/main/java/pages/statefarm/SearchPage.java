package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPI {

    //search agent
    @FindBy(xpath = "//button[@class='-oneX-header-util-menu-btn  -oneX-util-menu-icon-container']")
    WebElement searchBtn;
    @FindBy(css = "#util-sf-search")
    WebElement searchBox;
    @FindBy(xpath="//button[text()='Search']")
    WebElement searchBtn1;

    //search Us Bank
    @FindBy(xpath = "//a[contains(text(),'Business Banking From State Farm and U.S. Bank | S')]")
    WebElement BusinessBanking;

    @FindBy(css = "#inpage-search")
    WebElement searchField;


    public SearchPage(WebDriver driver){PageFactory.initElements(driver, this);}


    //search agent
    public void clickOnSearchBtn(){click(searchBtn);}
    public void typeOnSearchBox(String location){type(searchBox, location);}
    public void clickOnSearchBtn1(){
        click(searchBtn1);
    }

    //search Us Bank
    public void clickOnBusinessBank(){click(BusinessBanking);}

    //multiple search
    public void clearSearchField(){clear(searchField);}
    public void searchElementAndEnter(String item){typeAndEnter(searchField, item);}


}
