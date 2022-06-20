package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CommunityPage;
import pages.ebay.HomePage;


    public class CommunityTest extends CommonAPI {
        @Test
        public void CommunityTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickCommunity();
            CommunityPage communityPage = new CommunityPage(getDriver());
            communityPage.clickcommunitybutton();
            waitFor(2);
            homePage.clickSearch();
            String expectCommunity = "ebay.com Community";
            Assert.assertEquals(expectCommunity, (getPageTitle()));
        }


    }
