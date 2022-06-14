package testapp.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ebay.SignoutPage;

public class SignoutTest extends CommonAPI {
    public void testSignout() {
        SignoutPage signoutPage = new SignoutPage(getDriver());
        signoutPage.clickSignOut();

        String expectSignout = "ebay.com :Signout";
        Assert.assertEquals(expectSignout, (getClass()));
    }


    }





