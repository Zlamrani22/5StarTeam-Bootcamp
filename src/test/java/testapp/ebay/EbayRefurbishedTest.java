package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.EbayRefurbishedPage;
import pages.ebay.HomePage;


    public class EbayRefurbishedTest extends CommonAPI {
        @Test
        public void EbayRefurbishedTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickEbayRefurbished();
            EbayRefurbishedPage ebayRefurbishedPage = new EbayRefurbishedPage(getDriver());
            ebayRefurbishedPage.clickebayRefurbishedbutton();
            homePage.clickSearch();
            String expectEbayRefurbished = "ebay.com EbayRefurbished";
            Assert.assertEquals(expectEbayRefurbished, (getPageTitle()));
        }
    }