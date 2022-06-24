package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.ElectronicPage;
import pages.ebay.HomePage;

//import base.CommonAPI;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.automationpractice.HomePage;
//
public class ElecteronicTest extends CommonAPI {
        @Test
        public void ElectronicTest() {
                HomePage homePage = new HomePage(getDriver());
                homePage.selectOptionFromDropDown("Electeronic");
                ElectronicPage electronicPage= new ElectronicPage(getDriver());
                electronicPage.clickelectronicbutton();
                waitFor(2);
                homePage.clickSearch();
                String expectElectronic = "ebay.com :Electronic";
                Assert.assertEquals(expectElectronic, (getPageTitle()));
        }
}






//public class ElecteronicTest {
//    public class electronicTest extends CommonAPI {
//
//            @Test
//            public void ElecteronicTest() {
//                HomePage homePage = new HomePage(getDriver());
//                homePage.selectOptionFromDropDown("Electronic");
//                waitFor(2);
//                homePage.clickSearchBtn();
//                String expectElectronic = "ebay.com :Electronic";
//                Assert.assertEquals(expectElectronic, (getPageTitle()));
//            }
//    }
//
//
//
//}







//        public void testElecteronic() {
//            ElectronicPage electronicPage = new ElectronicPage(getDriver());
//            electronicPage.clickElectronic();
//
//            String expectElecteronic = "ebay.com :Electronic";
//            Assert.assertEquals(expectElecteronic, (getPageTitle()));
//        }
//
//
//    }
////
////}
