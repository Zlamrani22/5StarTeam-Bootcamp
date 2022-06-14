package testapp.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.MusicPage;
import pages.ebay.TestHomePage;


    public class MusicTest extends CommonAPI {

        @Test
        public void MusicTest() {
                TestHomePage testHomePage = new TestHomePage(getDriver());
                testHomePage.selectOptionFromMenuDropdownWithGivenText("Music");
                waitFor(2);
            }
        }







//           MusicPage musicPage = new MusicPage(getDriver());
//           testHomePage.selectOptionFromMenuDropdownWithGivenText("Music");
//            waitFor(2);
//        }
//    }

