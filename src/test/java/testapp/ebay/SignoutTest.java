package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.SignoutPage;

public class SignoutTest extends CommonAPI {
    @Test
    public void SingoutTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSignOut();
        SignoutPage signoutPage = new SignoutPage(getDriver());
        signoutPage.clickSignOutButton();
        homePage.clickSearch();
        String expectSignout = "ebay.com Signout";
        Assert.assertEquals(expectSignout, (getPageTitle()));
    }




//    public void SignoutTest() {
//        SignoutPage signoutPage = new SignoutPage(getDriver());
//        signoutPage.clickSignOut();
//        String expectSignout = "ebay.com :Signout";
//        Assert.assertEquals(expectSignout, (getClass()));
//    }


    }





