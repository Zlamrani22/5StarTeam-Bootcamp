package testapp.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;

public class SportingGoodTest {
    public class SportingGoodtest extends CommonAPI {

        @Test
        public void SportingGoodTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("SportinGood");
            waitFor(1);
        }
    }
}
