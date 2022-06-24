package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ChatPage extends CommonAPI {
    @FindBy(xpath="//body[1]/main[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/label[4]/a[1]/span[1]")
    WebElement sellMyCar;
    @FindBy(xpath="//a[contains(text(),'Get Started')]")
    WebElement getStarted;
    @FindBy(xpath="//button[@class='wrapperCard-bkAU18']")
    WebElement chatWithUs;
    @FindBy(xpath="//body/div[7]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/textarea[1]")
    WebElement newMessage;
    @FindBy(xpath="//*[@id='ic/light/send']")
    WebElement sendMessage;

    public ChatPage(WebDriver driver) {PageFactory.initElements(driver, this);}


    private final Logger LOG = LoggerFactory.getLogger(ChatPage.class);

    public void clickOnSellMyCar(){click(sellMyCar);
        LOG.info("sell my car success");}
    public void clickOnGetStarted(){click(getStarted);
        LOG.info("click get started success");}
    public void clickOnChatWithUs(){click(chatWithUs);
        LOG.info("click chat with us success");}
    public void typeNewMessage(String message){type(newMessage, message);
        LOG.info("type new message success");}
    public void clickOnSendMessage(){click(sendMessage);
        LOG.info("click send message success");}

}
