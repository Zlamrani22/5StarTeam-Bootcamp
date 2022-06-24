package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VotePage extends CommonAPI {


    public VotePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "select[id='filter__state']")
    private WebElement filterStateDropdown;

    @FindBy(css = "#main-signup")
    public WebElement signUpAlertsHeader;

    @FindBy(css = "input[class='choices__input choices__input--cloned']")
    private WebElement inputFieldStateSignUpAlerts;

    @FindBy(css = "#submit-btn__main-signup")
    private WebElement submitButton;



    public void chooseStateFromDropdown(String option){
        selectFromDropdown(filterStateDropdown,option);

    }

    public boolean optionChosenStateDropdownText(){
        isPresent(filterStateDropdown);
        return true;
    }

    public void enterStateForAlerts(String state){
        type(inputFieldStateSignUpAlerts,state);

    }

    public String  chosenStatePresent(){
        String text= getElementText(inputFieldStateSignUpAlerts);
            return text;


    }

    public void clickSubmitButton(){
        click(submitButton);
    }



}
