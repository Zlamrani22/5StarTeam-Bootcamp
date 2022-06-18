package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.BrandOutletPage;
import pages.ebay.HomePage;

public class BrandOutletTest extends CommonAPI{
    @Test
    public void BrandOutletTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBrandOutlet();
        BrandOutletPage brandOutletPage = new BrandOutletPage(getDriver());
        brandOutletPage.clickbrandOutletbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectBrandOutlet = "ebay.com BrandOutlet";
        Assert.assertEquals(expectBrandOutlet, (getPageTitle()));
    }




}
//    @Test
//    public void BrandOutletTest() {
//        BrandOutletPage brandNamePage = new BrandOutletPage(getDriver());
//        brandNamePage.clickBrandName();
//
//        String expectBrandName = "ebay.com :BrandName";
//        Assert.assertEquals(expectBrandName, (getPageTitle()));
//    }
//
//
//}
