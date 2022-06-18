package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.WatchesAndJewellyPage;


public class WatchesAndJewellyTest extends CommonAPI {
        @Test
        public void WatchAndJewellyTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("WatchesAndJewelly");
            WatchesAndJewellyPage watchesAndJewellyPage = new WatchesAndJewellyPage(getDriver());
            watchesAndJewellyPage.clickwatchesAndJewellybutton();
            waitFor(3);
            homePage.clickSearch();
            String expectWatchesAndJewelly = "ebay.com :WatchesAndJewelly";
            Assert.assertEquals(expectWatchesAndJewelly, (getPageTitle()));
        }
    }









//    public void testWatchesAndJewelly() {
//           WatchesAndJewellyPage watchesAndJewellyPage = new WatchesAndJewellyPage(getDriver());
//            watchesAndJewellyPage.clickwatchesandjewelly();
//
//            String expectAddToCartOnEbay = "ebay.com :AddToCartOnEbay";
//            Assert.assertEquals(expectAddToCartOnEbay, (getPageTitle()));
//        }
//
//
//    }
//
//}
