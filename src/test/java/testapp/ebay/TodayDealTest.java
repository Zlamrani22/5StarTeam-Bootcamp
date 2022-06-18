package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.TodayDealPage;


    public class TodayDealTest extends CommonAPI {
        @Test
        public void TodayDealTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickTodayDeal();
            TodayDealPage todayDealPage = new TodayDealPage(getDriver());
            todayDealPage.clicktodaydealbutton();
            homePage.clickSearch();
            String expectTodayDeal = "ebay.com TodayDeal";
            Assert.assertEquals(expectTodayDeal, (getPageTitle()));
        }

    }

