package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HelpAndContactPage;
import pages.ebay.HomePage;

public class HelpAndContactTest extends CommonAPI {

    @Test
    public void HelpAndContactTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickHelpAndContact();
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(getDriver());
        helpAndContactPage.clickhelpAndContactbutton();
        homePage.clickSearch();
        String expectHelpAndContact = "ebay.com HelpAndContact";
        Assert.assertEquals(expectHelpAndContact, (getPageTitle()));
    }
}





//        @Test
//    public void HelpAndContactTest() {
//        HelpAndContactPage helpAndAccountPage = new HelpAndContactPage(getDriver());
//        helpAndAccountPage.clickHelpAndAccount();
//
//        String expectHelpAndAccount = "ebay.HelpAndContactTest";
//        Assert.assertEquals(expectHelpAndAccount, (getClass()));
//    }
//}
