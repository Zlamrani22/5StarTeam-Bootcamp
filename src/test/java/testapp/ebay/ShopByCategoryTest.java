package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.ShopByCategoryPage;


    public class ShopByCategoryTest extends CommonAPI {
        @Test
        public void ShopByCategoryTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickShopByCategory();
            ShopByCategoryPage shopByCategoryPage = new ShopByCategoryPage(getDriver());
            shopByCategoryPage.clickShopByCategorybutton();
            homePage.clickSearch();
            String expectShopByCategory = "ebay.com ShopByCategory";
            Assert.assertEquals(expectShopByCategory, (getPageTitle()));
        }
    }






//    public void ShopByCatogoryTest() {
//        ShopByCategoryPage shopByCategoryPage = new ShopByCategoryPage(getDriver());
//        shopByCategoryPage.clickShopByCategory();
//
//        String expectShopByCategory = "ebay.com :ShopByCategory";
//        Assert.assertEquals(expectShopByCategory,(getClass()));
//    }
//
//    }


