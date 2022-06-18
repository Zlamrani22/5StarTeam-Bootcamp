package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStorePage extends CommonAPI {

    @FindBy(xpath = "//*[@id='category-3']/a")
    public WebElement clothesButton;

    @FindBy(xpath = "//*[@id='category-4']/a")
    public WebElement menButton;

    @FindBy(xpath = "//*[@id='category-6']/a")
    public WebElement accessoriesButton;

    @FindBy(xpath = "//*[@id='category-8']/a")
    public WebElement homeAccessoriesButton;

    @FindBy(xpath = "//*[@id='content']//div[5]//article//div//div[1]/a/img")
    public WebElement todayIsAGoodDayFramedPoster;

    @FindBy(css = "a[class='btn btn-explore btn-visible-small btn-explore-bo']")
    public WebElement startNowButton;

    @FindBy(xpath = "//*[@id='_desktop_user_info']/div/a")
    public WebElement myStoreSignInButton;

    @FindBy(xpath = "span[class='hide-header']")
    public WebElement hideHeaderButton;

    @FindBy(xpath = "//*[@id='header']/a[3]/span")
    public WebElement exploreFrontOfficeButton;


    public MyStorePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOverClothes(WebDriver driver){
       hoverOver(driver, clothesButton);
    }

    public void clickMenButton(){
        click(menButton);
    }

    public void hoverOverAccessories(WebDriver driver){
        hoverOver(driver, accessoriesButton);
    }

    public void clickHomeAccessories(){
        click(homeAccessoriesButton);
    }

    public void clickTodayIsAGoodDayFramedPoster(){
        click(todayIsAGoodDayFramedPoster);
    }

    public void clickStartNow(){
        click(startNowButton);
    }
    public void clickMyStoreSingIn(){
        click(myStoreSignInButton);
    }

    public void clickHideHeader(){
        click(hideHeaderButton);
    }

    public void clickExploreFrontOffice(){
        click(exploreFrontOfficeButton);
    }
}
