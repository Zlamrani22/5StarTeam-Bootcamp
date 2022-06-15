package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimsPage extends CommonAPI {

    //RoadSideAssistance
    @FindBy(xpath="//span[text()='Claims']")
    private WebElement claim;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[6]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1] ")
    private WebElement roadSideAssistance;

    @FindBy(xpath = "//body/div[@id='content']/section[@id='17-3152508']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement getRoadSideAssistanceBtn;

    @FindBy(xpath = "//button[@id='start-request']")
    WebElement startMyRequest;

    //chat with an agent
    @FindBy(xpath = "//a[contains(text(),'Claims Help')]")
    WebElement claimHelp;
    @FindBy(xpath = "//*[@class='LPMimage']")
    WebElement chat;
    @FindBy(xpath = "//*[@title='Type your message']")
    WebElement message;

    public ClaimsPage(WebDriver driver){PageFactory.initElements(driver, this);}

    //Roadside assistance
    public void clickOnClaim(){
        click(claim);
    }
    public void clickOnRoadSideAssistance(){
        click(roadSideAssistance);
    }
    public void clickOnGetRoadSideAssistanceBtn(){click(getRoadSideAssistanceBtn);}

    //chat with an agent
    public void clickOnClaimHelp(){click(claimHelp);}
    public void clickOnChat(){click(chat);}
    public void typeAndEnter(String text){typeAndEnter(message, text);}

}
