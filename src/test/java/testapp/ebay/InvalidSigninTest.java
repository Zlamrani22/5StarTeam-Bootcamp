package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import pages.ebay.InvalidSigninPage;

public class InvalidSigninTest extends CommonAPI {
    public void testInvalidSignin() {
        InvalidSigninPage invalidSinginPage = new InvalidSigninPage(getDriver());
        invalidSinginPage.clickInvalidSignint();

        String expectInvalidSignin = "ebay.com :InvalidSignin";
        Assert.assertEquals(expectInvalidSignin, (getClass()));
    }
}

//
//}
