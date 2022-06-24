package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.ChatPage;

public class ChatPageTest extends CommonAPI {
    @Test
    public void chat() {
        ChatPage chatPage = new ChatPage(getDriver());
        chatPage.clickOnSellMyCar();
        String expectedPageTitle = "Sell your car | It’s free & 100% online | CarGurus - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        chatPage.clickOnGetStarted();
        String expectedPageTitle1 = "Sell your car | It’s free & 100% online | CarGurus - CarGurus";
        Assert.assertEquals(expectedPageTitle1, getPageTitle());
        chatPage.clickOnChatWithUs();
        chatPage.typeNewMessage("hey");
        chatPage.clickOnSendMessage();
    }
}
