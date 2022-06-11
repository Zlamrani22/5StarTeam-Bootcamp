package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import pages.ebay.BrandNamePage;

public class BrandNameTest extends CommonAPI{

    public void testBrandName() {
        BrandNamePage brandNamePage = new BrandNamePage(getDriver());
        brandNamePage.clickBrandName();

        String expectBrandName = "ebay.com :BrandName";
        Assert.assertEquals(expectBrandName, (getPageTitle()));
    }


}
