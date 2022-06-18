package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CollectiblesAndArtPage;
import pages.ebay.HomePage;


    public class CollectiblesAndArtTest extends CommonAPI {
        @Test
        public void CollectiblesAndArtTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickCollectiblesAndArt();
            CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(getDriver());
            collectiblesAndArtPage.clickcollectiblesAndArtbutton();
            waitFor(2);
            homePage.clickSearch();
            String expectCollectiblesAndArt = "ebay.com CollectiblesAndArt";
            Assert.assertEquals(expectCollectiblesAndArt, (getPageTitle()));
        }
    }






//        @Test
//        public void CollectiblesAndArtTest() {
//            CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(getDriver());
//            collectiblesAndArtPage.clickCollectiblesAndArtt();
//            String expectCollectiblesAndArt = "ebay.com :CollectiblesAndArt";
//            Assert.assertEquals(expectCollectiblesAndArt, (getPageTitle()));
//        }
//
//
//    }
//}