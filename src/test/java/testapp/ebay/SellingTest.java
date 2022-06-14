package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import pages.ebay.SellingPage;

public class SellingTest extends CommonAPI {
    public void testSelling() {
        SellingPage sellingPage = new SellingPage(getDriver());
        sellingPage.clickSelling();

        String expectSelling = "ebay.com :Sellingy";
        Assert.assertEquals(expectSelling, (getClass()));
    }
}
