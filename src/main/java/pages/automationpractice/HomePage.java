package pages.automationpractice;

import org.openqa.selenium.WebDriver;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {


    @FindBy(css = "input[id='search_query_top']")
    private WebElement searchInputField;

    @FindBy(css = "button[name='submit_search']")
    private WebElement searchButton;

    @FindBy(css = "a[title='Contact Us']")
    private WebElement contactUsButton;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
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

}
