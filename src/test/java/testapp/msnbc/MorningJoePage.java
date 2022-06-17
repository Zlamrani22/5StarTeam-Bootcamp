package testapp.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MorningJoePage extends CommonAPI {

    @FindBy(css = "img[class='titleLogo']")
    private WebElement pageHeader;

    @FindBy(css = "h2[class='styles_promo3CardHeadline__aknwc']")
    private WebElement joePageTextAboveFullBio;

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
    private WebElement followJoeInstaButton ;

    @FindBy(xpath = "//p[text()='Like Joe on Facebook: ']")
    private WebElement followJoeText;

    public MorningJoePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String joePageHeader() {

        String header = getElementText(pageHeader);
        return header;
    }


    public WebElement viewCareersButton(){
        isPresent(careersButton);

        return careersButton;
    }


    public WebElement fullMorningJoeBioButton(){
        isPresent(joePageTextAboveFullBio);
        return joePageTextAboveFullBio;
    }

    public void clickMorningJoeBioButton(){
        click(morningJoeBioButton);
    }

    public void clickCareersButton() {
        click(careersButton);
    }

    public WebElement viewFollowJoeOnInsta(){
        isPresent(followJoeText);
        return followJoeText;
    }

    public void clickFollowJoeOnInsta(){
        click(followJoeInstaButton);
    }

    public boolean followJoeIsClicked(){
        isInteractable(followJoeInstaButton);
        return true;
    }



}
