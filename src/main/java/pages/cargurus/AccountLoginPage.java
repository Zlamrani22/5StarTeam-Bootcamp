package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage extends CommonAPI {
    @FindBy(xpath="//*[text()='Sign in / Register']")
    private WebElement signInBtn;
    @FindBy(xpath="//*[@name='registerEmail']")
    private WebElement userEmail;
    @FindBy(xpath="//*[text()='Next']")
    private WebElement nextBox;

    @FindBy(css="#loginPassword")
    private WebElement userPassword;

    @FindBy(xpath="//*[@type='submit']")
    private WebElement signInBtn1;



    public AccountLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void clickOnSignInBtn(){
        click(signInBtn);
    }

    public void typeUserEmail(String email){
        type(userEmail, email);
    }

    public void clickOnNextBox(){
        click(nextBox);
    }
    public void typeUserPassword(String password){
        type(userPassword, password);
    }
    public void clickOnSignInBtn1(){
        click(signInBtn1);
    }







}

