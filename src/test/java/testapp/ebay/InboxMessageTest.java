package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.InboxMessagePage;

public class InboxMessageTest extends CommonAPI {
        @Test
        public void InboxMessageTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("InboxMessage");
           InboxMessagePage inboxMessagePage= new InboxMessagePage(getDriver());
            inboxMessagePage.clickInboxMessage();
            waitFor(1);
            homePage.clickSearch();
            String expectInboxMessage = "ebay.com :InboxMessage";
            Assert.assertEquals(expectInboxMessage, (getPageTitle()));
        }
    }








//    @Test
//    public void InboxMessageTest() {
//        InboxMessagePage inboxMessagePage = new InboxMessagePage(getDriver());
//        inboxMessagePage.clickInboxMessage();
//
//        String expectInboxMessage = "ebay.com :InboxMessage";
//        Assert.assertEquals(expectInboxMessage, (getClass()));
//    }
//}
