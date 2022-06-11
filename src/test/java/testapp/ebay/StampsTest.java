package testapp.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.StampsPage;
import pages.ebay.TestHomePage;

public class StampsTest {
    public class StampTest extends CommonAPI {

        @Test
        public void StampsTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("Stamps");
            waitFor(1);
        }
    }

}

