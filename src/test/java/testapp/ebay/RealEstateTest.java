package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.RealEstatePage;


public class RealEstateTest extends CommonAPI {

            @Test
            public void RealEstateTest() {
                HomePage homePage = new HomePage(getDriver());
                homePage.selectOptionFromDropDown("RealEstate");
               RealEstatePage realEstatePage = new RealEstatePage(getDriver());
                realEstatePage.clickrealEstatebutton();
                waitFor(2);
                homePage.clickSearch();
                String expectRealEstate = "ebay.com : RealEstate";
                Assert.assertEquals(expectRealEstate, (getPageTitle()));
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
