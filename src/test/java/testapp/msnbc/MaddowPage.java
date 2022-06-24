package testapp.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaddowPage extends CommonAPI {

    @FindBy(css = "h1[class='show-lead__show--name']")
    private WebElement pageHeader;

    @FindBy(css = "div[class='lazyload-wrapper']")
    private WebElement latestMaddowVideos;

    @FindBy(xpath = "//div[@class='lazyload-wrapper'][2]")
    private WebElement videoTwoLatest;

    @FindBy(xpath = "//div[@class='lazyload-wrapper'][3]")
    private WebElement videoThreeLatest;

    @FindBy(xpath = "//div[@class='lazyload-wrapper'][4]")
    private WebElement videoFourLatest;

    @FindBy(xpath = "//div[@class='lazyload-wrapper'][5]")
    private WebElement videoFiveLatest;

    @FindBy(css = "h2[class=\"styles_titleText__7qLbv\"]")
    private WebElement latestVideoHeader;

    public MaddowPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String maddowPageHeader() {

        String title = getElementText(pageHeader);
        return title;
    }

    public void playAllLatestMaddowVideos() {

        {click(latestMaddowVideos);
        click(videoTwoLatest);
        click(videoThreeLatest);
        click(videoFourLatest);
        click(videoFiveLatest);}

    }

    public boolean checkLatestVideosButtonIsInteractable(){
        isInteractable(latestMaddowVideos);
        isInteractable(videoTwoLatest);
        isInteractable(videoThreeLatest);
        isInteractable(videoFourLatest);
        isInteractable(videoFiveLatest);
        return true;
    }

    public String getLatestVideoPageHeader(){
        String element= getElementText(latestVideoHeader);
        return element;
    }
}


