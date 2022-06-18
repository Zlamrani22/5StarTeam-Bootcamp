package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.ValidPasswordPage;

public class ValidPasswordTest extends CommonAPI {
    @Test
    public void ValidPasswordTest() {
        ValidPasswordPage validPasswordPage = new ValidPasswordPage((getDriver()));
        ValidPasswordPage.clickvalidPasswordbutton();
        validPasswordPage.clickValidPassword();
        String expectValidPAssword= "ebay.com :ValidPassword";
        Assert.assertEquals(expectValidPAssword, (getClass()));
    }
}


//    public void ValidEmailTest() {
//        ValidPasswordPage validEmailPage = new ValidPasswordPage(getDriver());
//        validEmailPage.clickValidEmailt();
//
//        String expectValidEmail = "ebay.com :ValidEmail";
//        Assert.assertEquals(expectValidEmail, (getClass()));
//    }
//
//