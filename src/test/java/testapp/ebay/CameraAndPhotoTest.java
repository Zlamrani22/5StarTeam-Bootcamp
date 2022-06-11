package testapp.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;

public class CameraAndPhotoTest {
    public class CameraAndPhotTest extends CommonAPI {

        @Test
        public void CameraAndPhotoTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("CameraAndPhoto");
            waitFor(3);
        }
    }

}
