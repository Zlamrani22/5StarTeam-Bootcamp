package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CollectiblesAndArtPage;

public class CollectiblesAndArtTest {
    public class collectiblesAndArtTest extends CommonAPI {
        @Test
        public void testCollectiblesAndArt() {
            CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(getDriver());
            collectiblesAndArtPage.clickCollectiblesAndArt();

            String expectCollectiblesAndArt = "ebay.com :CollectiblesAndArt";
            Assert.assertEquals(expectCollectiblesAndArt, (getPageTitle()));
        }


    }
}