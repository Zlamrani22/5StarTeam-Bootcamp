package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PodcastPage extends CommonAPI {

    @FindBy(xpath = "//span[text()='American Radical']")
    private WebElement americanRadical;

    @FindBy(css = "h1[class='styles_header__UNNIX']")
    private WebElement pageTitleAmericanRadical;

    @FindBy(xpath = "//li[@class='styles_linkListItem__aVGnJ'][1]")
    private WebElement applePodcastButton;

    @FindBy(xpath = "//li[@class='styles_linkListItem__aVGnJ'][2]")
    private WebElement clickSpotifyPodcastButton;

    @FindBy(xpath = "//span[text()='Introducing: American Radical']")
    private WebElement listenNowAmericanRadical;

    @FindBy(xpath = "(//button[@aria-label='Play'])[1]")
    private WebElement playAmRadicalPodcast;

    public PodcastPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickAmericanRadical(){
        click(americanRadical);
    }

    public String titleAmericanRadical(){
        String title=getElementText(pageTitleAmericanRadical);
        return title;
    }

    public void clickApplePodcast(){
        click(applePodcastButton);
    }

    public void spotifyPodcastButton(){
        click(clickSpotifyPodcastButton);
    }

    public void listenNowButtonRadicalPage(){
        click(listenNowAmericanRadical);
    }

    public void playButtonAmRedicalPod(){
        click(playAmRadicalPodcast);
    }
}
