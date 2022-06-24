package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.WatchListPage;


    public class WatchListTest extends CommonAPI {
        @Test
        public void WatchListTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickWatchList();
            WatchListPage watchListPage = new WatchListPage(getDriver());
            watchListPage.clickwatchListbutton();
            waitFor(1);
            homePage.clickSearch();
            String expectWatchList = "ebay.com WatchList";
            Assert.assertEquals(expectWatchList, (getPageTitle()));
        }
    }


