package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.ForgotPasswordPage;
import pages.ebay.ForgotUseIdPage;

import static java.sql.DriverManager.getDriver;

public class ForgotUserIdTest extends CommonAPI {
    @Test
    public void testForgotUserId() {
        ForgotUseIdPage forgotUserIdpage = new ForgotUseIdPage(getDriver());
        forgotUserIdpage.clickForgotUserIdt();

        String expectForgotUSerId = "ebay.com :ForgotUserId";
        Assert.assertEquals(expectForgotUSerId, (getClass()));
    }
}
