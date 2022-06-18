package testapp.ebay;


import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CloseAccountPage;
import pages.ebay.HomePage;

public class CloseAccountTest extends CommonAPI {

    @Test
    public void CloseAccountTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("CloseAccount");
        CloseAccountPage closeAccountPage=new CloseAccountPage(getDriver());
        closeAccountPage.clickcloseAccountbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectCloseAccount = "ebay.com :CloseAccount";
        Assert.assertEquals(expectCloseAccount, (getPageTitle()));
    }
}




//public class CloseAccountTest extends CommonAPI {
//    @Test
//    public void CloseAccountTest() {
//        HomePage testHomePage = new HomePage(getDriver());
//        testHomePage.selectOptionFromMenuDropdownWithGivenText("CloseAccount");
//        waitFor(3);
//    }
////}






//    @Test
//    public void testCloseAccount() {
//
//        CloseAccountPage closeAccountPage = new CloseAccountPage(getDriver());
//        closeAccountPage.clickCloseAccount();
//
//        String expectedCloseAcount = "ebay.com :CloseAccount";
//        Assert.assertEquals(expectedCloseAcount, (getPageTitle()));
//    }
//}