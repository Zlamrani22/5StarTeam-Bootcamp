package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import pages.ebay.SigninPage;

public class SigninTest extends CommonAPI {

    public void testSingin() {
       SigninPage singinPage = new SigninPage(getDriver());
        singinPage.clickSingin();

        String expectSignin = "ebay.com :Signin";
        Assert.assertEquals(expectSignin, (getClass()));
    }
}
