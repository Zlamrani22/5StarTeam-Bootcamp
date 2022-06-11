package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;
import pages.ebay.WatchesAndJewellyPage;

public class WatchesAndJewellyTest {
    public class watchesAndJewellyTest extends CommonAPI {
        @Test
        public void WatchAndJewellyTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("WatchesAndJewelly");
            waitFor(3);
        }
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
