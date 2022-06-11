package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerSearchPage extends CommonAPI {

    @FindBy(css = "input[class='input-search']")
    private WebElement careerSearchButton;

    public CareerSearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void searchButtonAndEnter(String input){
        typeAndEnter(careerSearchButton, input);
    }

    public void searchButtonCareers(String input){type(careerSearchButton,input);}

    public void clearSearchButton(){clear(careerSearchButton);}
}
