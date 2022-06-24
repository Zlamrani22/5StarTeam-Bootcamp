package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    //check claim steps
    @FindBy(css = "#open-auto-drawer-undefined")
    WebElement steps;


    public ClaimsPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(ClaimsPage.class);


    //Roadside assistance
    public void clickOnClaim(){click(claim);
        LOG.info("click on claim success");}
    public void clickOnRoadSideAssistance(){click(roadSideAssistance);
        LOG.info("click on road side assistance success");  }
    public void clickOnGetRoadSideAssistanceBtn(){click(getRoadSideAssistanceBtn);
        LOG.info("click on get road side assistance button success");}

    //chat with an agent
    public void clickOnClaimHelp(){click(claimHelp);
        LOG.info("click on claim help success");}
    public void clickOnChat(){click(chat);
        LOG.info("click on chat success");}
    public void typeAndEnter(String text){typeAndEnter(message, text);
        LOG.info("type message success");}

    //check claim steps
    public void clickOnSteps(){click(steps);
        LOG.info("click on steps success");}


}
