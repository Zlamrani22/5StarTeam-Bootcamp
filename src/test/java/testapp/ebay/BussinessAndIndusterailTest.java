package testapp.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;

public class BussinessAndIndusterailTest {
    public class BussinessAndIndusterialTest extends CommonAPI {

        @Test
        public void BussinessAndIndusterialTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("BussinessAndIndusterial");
            waitFor(3);
        }
    }
}
