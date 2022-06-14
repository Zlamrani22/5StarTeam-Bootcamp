package testapp.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.AddToCartPage;
import pages.ebay.DailyDealsPage;

//import static java.sql.DriverManager.getDriver;
////
public class DailyDealsTest extends CommonAPI {
    @Test
    public void testDailyDeals() {

        DailyDealsPage dailyDealsPage= new DailyDealsPage(getDriver());
        DailyDealsPage.clickDailyDeals();
        String expectDailyDeals = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        Assert.assertEquals(expectDailyDeals, (getPageTitle()));
    }
}










//    @Test
//}
////    public void testDailyDealsFunctionality() {
//////////        DailyDealsPage dailyDealsypage = new DailyDealsPage(getDriver());
//////////       DailyDealsPage.clickDailyDeals();
//////////
//////////        String expectDailyDeals = "ebay.com :DailyDeals";
//////////        Assert.assertEquals(expectDailyDeals, (getClass()));
//////////    }
