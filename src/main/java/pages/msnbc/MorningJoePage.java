package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MorningJoePage extends CommonAPI {

    @FindBy(css = "img[class='titleLogo']")
    private WebElement pageHeader;

    @FindBy(css = "div[id='hfs-footer']")
    private WebElement joePageFooter;

    @FindBy(xpath = "//a[text()='Careers']")
    private WebElement careersButton;

    @FindBy(css = "input[class='input-search']")
    private WebElement careerSearchButton;
//    @FindBy(css = "form[action='/find-a-job#']")
//    private WebElement searchCareers;

    @FindBy(xpath = "//a[@class=\"animated-ghost-button animated-ghost-button--small styles_promo3PanelButton__X0MV7\"][text()='FULL BIO'][1]")
    private WebElement morningJoeBioButton;

    @FindBy(css = "div[class='job-location-filter selected-filters']")
    private WebElement careerListHeader;

    @FindBy(xpath = "//a[text()='@JoeScarborough']")
    private WebElement followJoeText;

    public MorningJoePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String joePageHeader() {

        String header = getElementText(pageHeader);
        return header;
    }

    public void scrollToBottomOfPage(){
        scrollToView(careersButton);

    }

    public WebElement clickCareersButton(){
        click(careersButton);
        return careersButton;
    }

    public void scrollToFullBio(){
        click(morningJoeBioButton);
    }

    public WebElement clickFullMorningJoeBio(){
        click(morningJoeBioButton);
        return morningJoeBioButton;
    }
//    public WebElement clickCareers() {
//        click(careersButton);
//        return careersButton;
//    }

    public WebElement clickFollowJoeOnInsta(){
        followJoeText.click();
        return clickFollowJoeOnInsta();
    }

    public boolean followJoeIsClicked(){
        isInteractable(followJoeText);
        return true;
    }


    public String viewResultsHeader(){
        String text=getElementText(careerListHeader);
        return text;
    }
}
