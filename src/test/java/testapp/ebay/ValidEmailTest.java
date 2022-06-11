package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import pages.ebay.ValidEmailPage;

public class ValidEmailTest extends CommonAPI {
    public void testValidEmail() {
        ValidEmailPage validEmailPage = new ValidEmailPage(getDriver());
        validEmailPage.clickValidEmailt();

        String expectValidEmail = "ebay.com :ValidEmail";
        Assert.assertEquals(expectValidEmail, (getClass()));
    }
}
