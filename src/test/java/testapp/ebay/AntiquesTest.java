package testapp.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;

public class AntiquesTest {
    public class antiquesTest extends CommonAPI {

        @Test
        public void AntiquesTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("Antiques");
            waitFor(3);
        }
    }

}
