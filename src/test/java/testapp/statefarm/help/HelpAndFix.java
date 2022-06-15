package testapp.statefarm.help;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.statefarm.HelpAndFixPage;

public class HelpAndFix extends CommonAPI {
    @Test
    public void fixUserId() {
        HelpAndFixPage helpAndFixPage = new HelpAndFixPage(getDriver());
        helpAndFixPage.clickOnHelp();
       // helpAndFixPage.getWindowHandles();
        helpAndFixPage.clickOnForgetUserId();

    }
}