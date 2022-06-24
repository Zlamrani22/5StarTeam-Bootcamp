package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CraftPage;
import pages.ebay.HomePage;

public class CraftTest extends CommonAPI {
    @Test
    public void CraftTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Craft");
        CraftPage craftPage= new CraftPage(getDriver());
        craftPage.clickcraftbutton();
        waitFor(1);
        homePage.clickSearch();
        String expectCraft = "ebay.com :Craft";
        Assert.assertEquals(expectCraft, (getPageTitle()));
    }
}






