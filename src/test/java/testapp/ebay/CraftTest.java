package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;


public class CraftTest {
    public class CarftPage extends CommonAPI {
        @Test
        public void testCarft() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("Craft");
            waitFor(2);
        }
    }
}



//            CarftPage craftPage = new CarftPage(getDriver());
//            craftPage.clickCraft();
//
//            String expectCraft = "ebay.com :Craft";
//            Assert.assertEquals(expectCraft, (getPageTitle()));
//        }
//
//
//    }
//}

