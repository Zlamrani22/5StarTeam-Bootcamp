package testapp.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;

public class ArtTest {
    public class artTest extends CommonAPI {

        @Test
        public void ArtTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("Art");
            waitFor(2);
        }
    }
}
