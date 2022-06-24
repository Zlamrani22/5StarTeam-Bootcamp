package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.GetYourThingsPage;
import pages.ebay.HomePage;


    public class GetYourThingsTest extends CommonAPI {
        @Test
        public void GetYourThingsTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickGetYourThings();
            GetYourThingsPage getYourThingsPage = new GetYourThingsPage(getDriver());
            getYourThingsPage.clickgetYourThingsbutton();
            homePage.clickSearch();
            String expectGetYourThings = "ebay.com GetYourThings ";
            Assert.assertEquals(expectGetYourThings, (getPageTitle()));
        }
    }

