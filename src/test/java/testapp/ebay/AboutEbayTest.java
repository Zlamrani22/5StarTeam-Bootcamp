package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.AboutEbayPage;
import pages.ebay.HomePage;


    public class AboutEbayTest extends CommonAPI {
        @Test
        public void AboutEbayTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("AboutEbay");
            AboutEbayPage aboutEbayPage = new AboutEbayPage(getDriver());
            aboutEbayPage.clickAboutEbaybutton();
            waitFor(2);
            homePage.clickSearch();
            String expectAboutEbay = "ebay.com :AboutEbay";
            Assert.assertEquals(expectAboutEbay,(getPageTitle()));
        }
    }











//        @Test
//        public void AboutEbayTest() {
//            HomePage homePage = new HomePage(getDriver());
//            homePage.selectOptionFromDropDown("");
//            waitFor(2);
//            homePage.clickSearch();
//            String expectAboutEbay = "ebay.com : AboutEbay";
//            Assert.assertEquals(expectAboutEbay, (getPageTitle()));
//        }
//    }
//

