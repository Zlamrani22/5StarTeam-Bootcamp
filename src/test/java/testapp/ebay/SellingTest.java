package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.SellingPage;


    public class SellingTest extends CommonAPI {
        @Test
        public void SellingTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickSelling();
           SellingPage sellPage = new SellingPage(getDriver());
           homePage.clickSearch();
            String expectSelling = "ebay.com Selling";
            Assert.assertEquals(expectSelling, (getPageTitle()));
        }
    }





//    public void SellTest() {
//        SellingPage sellingPage = new SellingPage(getDriver());
//        sellingPage.clickSelling();
//
//        String expectSelling = "ebay.com :Sellingy";
//        Assert.assertEquals(expectSelling, (getClass()));
//    }
//}
