package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import pages.ebay.MyEbayPage;

public class MyEbayTest extends CommonAPI {
    public void testMyEbay() {
        MyEbayPage myEbayPage = new MyEbayPage(getDriver());
        myEbayPage.clickMyEbay();

        String expectMyEbay = "ebay.com :MyEbay";
        Assert.assertEquals(expectMyEbay, (getClass()));
    }
}
