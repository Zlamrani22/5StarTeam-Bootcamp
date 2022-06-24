package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.MyEbayPage;


    public class MyEbayTest extends CommonAPI {
        @Test
        public void MyEbayTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickMyEbay();
            MyEbayPage myEbayPage = new MyEbayPage(getDriver());
            myEbayPage.clickmyEbaybutton();
            homePage.clickSearch();
            String expectMyEbay = "ebay.com MyEbay";
            Assert.assertEquals(expectMyEbay, (getPageTitle()));
        }
    }




//        public void MyEbayTest() {
//        MyEbayPage myEbayPage = new MyEbayPage(getDriver());
//        myEbayPage.clickMyEbay();
//
//        String expectMyEbay = "ebay.com :MyEbay";
//        Assert.assertEquals(expectMyEbay, (getClass()));
//    }
//}
