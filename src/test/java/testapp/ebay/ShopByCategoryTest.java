package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import pages.ebay.ShopByCategoryPage;

public class ShopByCategoryTest extends CommonAPI {
    public void testShopByCatogory() {
        ShopByCategoryPage shopByCategoryPage = new ShopByCategoryPage(getDriver());
        shopByCategoryPage.clickShopByCategory();

        String expectShopByCategory = "ebay.com :ShopByCategory";
        Assert.assertEquals(expectShopByCategory,(getClass()));
    }

    }


