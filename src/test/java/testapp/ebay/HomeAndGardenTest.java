package testapp.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;

public class HomeAndGardenTest {
    public class homeAndGardenTest extends CommonAPI {

        @Test
        public void HomeAndGardenTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("HomeAndGarden");
            waitFor(1);
        }
    }
}
