package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.RealEstatePage;
import pages.ebay.TestHomePage;

public class RealEstateTest {
    public class realEstateTest extends CommonAPI {
        public class RealEstatTest extends CommonAPI {

            @Test
            public void RealEstateTest() {
                TestHomePage testHomePage = new TestHomePage(getDriver());
                testHomePage.selectOptionFromMenuDropdownWithGivenText("RealEstate");
                waitFor(2);
            }
        }


    }
}

//        public void testRealestate() {
//           RealEstatePage realEstatePage = new RealEstatePage(getDriver());
//            realEstatePage.clickRealEstate();
//
//            String expectRealEstate = "ebay.com : RealEstate";
//            Assert.assertEquals(expectRealEstate, (getPageTitle()));
//        }
//
//
//    }
//}
