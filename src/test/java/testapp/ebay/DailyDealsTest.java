package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.DailyDealsPage;
import pages.ebay.HomePage;

//import static java.sql.DriverManager.getDriver;
////
public class DailyDealsTest extends CommonAPI {
    @Test
    public void DailyDealsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickDailyDeals();
        DailyDealsPage dailyDealsPage = new DailyDealsPage(getDriver());
        String expectAddToCart = "ebay.com AddToCart";
        Assert.assertEquals(expectAddToCart, (getPageTitle()));
    }
}





//        @Test
//    public void DailyDealsTest() {
//
//        DailyDealsPage dailyDealsPage= new DailyDealsPage(getDriver());
//        DailyDealsPage.clickDailyDeals();
//        String expectDailyDeals = "Electronics, Cars, Fashion, Collectibles & More | eBay";
//        Assert.assertEquals(expectDailyDeals, (getPageTitle()));
//    }
//}










//    @Test
//}
////    public void testDailyDealsFunctionality() {
//////////        DailyDealsPage dailyDealsypage = new DailyDealsPage(getDriver());
//////////       DailyDealsPage.clickDailyDeals();
//////////
//////////        String expectDailyDeals = "ebay.com :DailyDeals";
//////////        Assert.assertEquals(expectDailyDeals, (getClass()));
//////////    }
