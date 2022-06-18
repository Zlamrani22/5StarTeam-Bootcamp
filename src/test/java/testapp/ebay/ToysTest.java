package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.ToysPage;


public class ToysTest extends CommonAPI {
        @Test
        public void ToysTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("Toys");
            ToysPage toysPage=new ToysPage(getDriver());
            toysPage.clicktoysButton();
            waitFor(2);
            homePage.clickSearch();
            String expectToys = "ebay.com : Toys";
            Assert.assertEquals(expectToys, (getPageTitle()));
        }
    }











//    public void testToys() {
//        ToysPage toysPage = new ToysPage(getDriver());
//        ToysPage.clickToys();
//
//        String expectToys = "ebay.com :Toys";
//        Assert.assertEquals(expectToys, (getClass()));
//    }
//}

