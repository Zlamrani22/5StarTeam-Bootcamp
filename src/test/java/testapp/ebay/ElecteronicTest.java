package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.BookPage;
import pages.ebay.ElectronicPage;
import pages.ebay.TestHomePage;

public class ElecteronicTest {
    public class electronicTest extends CommonAPI {
        public class TravelTest extends CommonAPI {

            @Test
            public void ElectronicTest() {
                TestHomePage testHomePage = new TestHomePage(getDriver());
                testHomePage.selectOptionFromMenuDropdownWithGivenText("Electronic");
                waitFor(2);
            }
        }
    }
}






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
//
//}
