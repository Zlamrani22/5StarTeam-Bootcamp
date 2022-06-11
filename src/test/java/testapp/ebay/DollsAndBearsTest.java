package testapp.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;

public class DollsAndBearsTest {
    public class DollsAndBearTest extends CommonAPI {

        @Test
        public void DollsAndBearsTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("DollsAndBears");
            waitFor(1);
        }
    }
}
