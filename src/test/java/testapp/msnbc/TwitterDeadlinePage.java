package testapp.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterDeadlinePage extends CommonAPI {

    @FindBy(css = "div[class='css-18t94o4 css-1dbjc4n r-42olwf r-sdzlij r-1phboty r-rs99b7 r-2yi16 r-1qi8awa r-1ny4l3l r-ymttw5 r-o7ynqc r-6416eg r-lrvibr']")
    private WebElement followBtn;

    @FindBy(css = "div[class='css-901oao r-18jsvk2 r-37j5jr r-yy2aun r-1vr29t4 r-37tt59 r-5oul0u r-bcqeeo r-fdjqy7 r-qvutc0']")
    private WebElement popupPage;

    public TwitterDeadlinePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void twitterFollowBtn(){
        click(followBtn);
    }

    public String popupPageText(){
        String page= getElementText(popupPage);
        return page;
    }
}
