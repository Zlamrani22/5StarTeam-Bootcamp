package testapp.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;

public class MotorTest {
    public class motorTest extends CommonAPI {

        @Test
        public void MotorTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("Motor");
            waitFor(2);
        }
    }

}
