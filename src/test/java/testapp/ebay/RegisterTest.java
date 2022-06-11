package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import pages.ebay.RegisterPage;

public class RegisterTest extends CommonAPI {
    public void testRegister() {
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickRegister();

        String expectRegister = "ebay.com :Register";
        Assert.assertEquals(expectRegister, (getClass()));
    }
}
