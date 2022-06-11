package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HelpAndAccountPage;

public class HelpAndAccountTest extends CommonAPI {
    @Test
    public void testHelpAndAccount() {
        HelpAndAccountPage helpAndAccountPage = new HelpAndAccountPage(getDriver());
        helpAndAccountPage.clickHelpAndAccount();

        String expectHelpAndAccount = "ebay.HelpAndAccountTest";
        Assert.assertEquals(expectHelpAndAccount, (getClass()));
    }
}
