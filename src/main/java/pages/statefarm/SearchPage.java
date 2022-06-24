package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private final Logger LOG = LoggerFactory.getLogger(SearchPage.class);


    //search agent
    public void clickOnSearchBtn(){click(searchBtn);
        LOG.info("click on search button success");}
    public void typeOnSearchBox(String location){type(searchBox, location);
        LOG.info("type search box success");}
    public void clickOnSearchBtn1(){click(searchBtn1);
        LOG.info("click on search button success");}

    //search Us Bank
    public void clickOnBusinessBank(){click(BusinessBanking);
        LOG.info("click on business bank success");}

    //multiple search
    public void clearSearchField(){clear(searchField);
        LOG.info("clear search field success");}
    public void searchElementAndEnter(String item){typeAndEnter(searchField, item);
        LOG.info("search element success");}


}
