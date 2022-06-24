package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.RegisterPage;

public class RegisterTest extends CommonAPI {

    @Test
    public void RegisterTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickregisterbutton();
        homePage.clickSearch();
        String expectRegister = "ebay.com Register";
        Assert.assertEquals(expectRegister, (getPageTitle()));
    }
}



//        public void RegisterTest() {
//        RegisterPage registerPage = new RegisterPage(getDriver());
//        registerPage.clickRegister();
//
//        String expectRegister = "ebay.com :Register";
//        Assert.assertEquals(expectRegister, (getClass()));
//    }
//}
