package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.MusicPage;


public class MusicTest extends CommonAPI {

        @Test
        public void MusicTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("Music");
            MusicPage musicPage= new MusicPage(getDriver());
            musicPage.clickmusicbutton();
            waitFor(2);
            homePage.clickSearch();
            String expectMusic= "ebay.com : Music";
            Assert.assertEquals(expectMusic, (getPageTitle()));
        }
    }








//           MusicPage musicPage = new MusicPage(getDriver());
//           testHomePage.selectOptionFromMenuDropdownWithGivenText("Music");
//            waitFor(2);
//        }
//    }

