package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.InvalidSigninPage;

//import base.CommonAPI;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.ebay.CameraAndPhotoPage;
//import pages.ebay.InvalidSigninPage;
//import pages.ebay.LoginPage;
//
public class InvalidSigninTest extends CommonAPI {

    @Test
    public void InvalidSigninTest() {
        InvalidSigninPage invalidSinginPage = new InvalidSigninPage(getDriver());
        invalidSinginPage.clickInvalidSignint();
        InvalidSigninPage invalidSigninPage = new InvalidSigninPage(getDriver());
        invalidSigninPage.clickInvalidSignint();
        String expectInvalidSignin = "ebay.com :InvalidSignin";
        Assert.assertEquals(expectInvalidSignin, (getClass()));
    }
}

//}
//public class InvalidSigninTest extends CommonAPI {
//
//
//@Test
//public void IvalidateLoginPage(){
//    InvalidSigninPage invalidSigninPage = new InvalidSigninPage(getDriver());
// InvalidSigninPage invalidSigninPage= new InvalidSigninPage(getDriver());
//    invalidSigninPage.clickInvalidSignint();
//    Assert.assertFalse(InvalidSigninPage.checkLogoIsPresent());
//}
//}